package crawler;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException, IOException{
        int i = 0;

        DBManager dbmng = new DBManager("root","lelab2016");
        dbmng.setDbms("mysql");
        dbmng.makeDbConnection();
        dbmng.updateDatabase();
        String[] urls = dbmng.getUrlList();
        Parser[] parser = new Parser[urls.length];
        Mapper mapper = new Mapper();
        int[] status = dbmng.getStatusList();
        dbmng.close();

        for(i = 0; i < urls.length; i++){
            try {
                parser[i] = new Parser(urls[i]);
            }catch(Exception e){
                System.out.println("security exception or connection problem occured");
            }
            parser[i].setType(status[i]);
        }
        for(i = 0; i < urls.length; i++){
            parser[i].findLocation();
            mapper.setMapper(parser[i]);
            dbmng.setDBManager(mapper, "mysql");
            dbmng.execute();
        }
    }
}