package crawler;

public class BidList
{
    private int Type;
    private String Url;
    private String Title;
    private String Refer;
    private String BidNo;
    private String Bstart;
    private String Bexpire;
    private String PDate;
    private String Dept;
    private String Charge;

    public BidList()
    {
        this.Type = -1;
        this.Url = "NULL";
        this.Title = "NULL";
        this.Refer = "NULL";
        this.BidNo = "NULL";
        this.Bstart = "NULL";
        this.Bexpire = "NULL";
        this.PDate = "NULL";
        this.Dept = "NULL";
        this.Charge = "NULL";
    }

    public int getType() {
        return Type;
    }
    public void setType(int type) {
        Type = type;
    }
    public String getUrl() {
        return Url;
    }
    public void setUrl(String url) {
        Url = url;
        Url.replaceAll("\'", " ");
        Url.replaceAll("’", " ");
        Url.replaceAll("‘", " ");
        Url.replaceAll("'", " " );
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
        Title.replaceAll("\'", " ");
        Title.replaceAll("’", " ");
        Title.replaceAll("‘", " ");
        Title.replaceAll("'", " ");
    }
    public String getRefer() {
        return Refer;
    }
    public void setRefer(String refer) {
        Refer = refer;
        Refer.replaceAll("\'", " ");
        Refer.replaceAll("’", " ");
        Refer.replaceAll("‘", " ");
        Refer.replaceAll("'", " ");
    }
    public String getBidNo() {
        return BidNo;
    }
    public void setBidNo(String bidNo) {
        BidNo = bidNo;
        BidNo.replaceAll("\'", " ");
        BidNo.replaceAll("’", " ");
        BidNo.replaceAll("‘", " ");
        BidNo.replaceAll("'", " ");
    }
    public String getBstart() {
        return Bstart;
    }
    public void setBstart(String bstart) {
        Bstart = bstart;
        Bstart.replaceAll("\'", " ");
        Bstart.replaceAll("’", " ");
        Bstart.replaceAll("‘", " ");
        Bstart.replaceAll("'", " ");
    }
    public String getBexpire() {
        return Bexpire;
    }
    public void setBexpire(String bexpire) {
        Bexpire = bexpire;
        Bexpire.replaceAll("\'", " ");
        Bexpire.replaceAll("’", " ");
        Bexpire.replaceAll("‘", " ");
    }
    public String getPDate() {
        return PDate;
    }
    public void setPDate(String pDate) {
        PDate = pDate;
        PDate.replaceAll("\'", " ");
        PDate.replaceAll("\\’", " ");
        PDate.replaceAll("\\‘", " ");
        PDate.replaceAll("'", " ");
    }
    public String getDept() {
        return Dept;
    }
    public void setDept(String dept) {
        Dept = dept;
        Dept.replaceAll("\'", " ");
        Dept.replaceAll("’", " ");
        Dept.replaceAll("‘", " ");
        Dept.replaceAll("'", " ");
    }
    public String getCharge() {
        return Charge;
    }
    public void setCharge(String charge) {
        Charge = charge;
        Charge.replaceAll("\'", " ");
        Charge.replaceAll("’", " ");
        Charge.replaceAll("‘", " ");
        Charge.replaceAll("'", " ");
    }

    public String getIndex(int index){
        String toGet = null;
        switch(index){
            case 1:
                toGet = getUrl();
                break;
            case 2:
                toGet = getTitle();
                break;
            case 3:
                toGet = getRefer();
                break;
            case 4:
                toGet = getBidNo();
                break;
            case 5:
                toGet = getBstart();
                break;
            case 6:
                toGet = getBexpire();
                break;
            case 7:
                toGet = getPDate();
                break;
            case 8:
                toGet = getDept();
                break;
            case 9:
                toGet = getCharge();
                break;
        }
        return toGet;
    }
}