public class LibraryItem
{
    //variable declare
    private String title;
    private String author;
    private int publishYear;
    //parametrized constructor
    public LibraryItem(String title,String author, int publishYear){
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }
    //methods
    public String getDetails(){
        return "Title: "+title+", Author :"+author+", Publish Year :"+publishYear;
    }
    public boolean checkAvailbility(){
        return true;
    }
}

