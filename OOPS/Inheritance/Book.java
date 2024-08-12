public class Book extends LibraryItem 
{
    private String ISBN;
    private String genre;
    public Book(String title, String author,int publishYear,String ISBN, String genre){
        super(title,author,publishYear);
        this.ISBN = ISBN;
        this.genre = genre;
    }
    public String getBookInfo(){
        return getDetails() + ", ISBN :"+ISBN+", Genre :"+genre;
    }
}