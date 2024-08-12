public class Magazine extends LibraryItem {
    private int issueNumber;
    private String Publisher;
    public Magazine(String title,String author, int publishYear,int issueNumber,String Publisher){
        super(title, author, publishYear);
        this.issueNumber = issueNumber;
        this.Publisher = Publisher;
    }
    public String getMagazineInfo(){
        return getDetails() + ", IssueNumber :"+issueNumber+", Publisher :"+Publisher;
    }
}
