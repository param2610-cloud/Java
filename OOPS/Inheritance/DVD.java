public class DVD extends LibraryItem 
{
    private int duration;
    private String director;
    public DVD(String title,String author, int publishYear,int duration,String director)
    {
        super(title, author, publishYear);
        this.duration =duration;
        this.director = director;
    }
    String getDVDInfo(){
        return getDetails() + ", Duration :"+duration+", Director :"+director;
    }
} 