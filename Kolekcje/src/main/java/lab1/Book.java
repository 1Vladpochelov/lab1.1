package lab1;

public class Book {
    public static String Bookname;
    public static String Author;
    public int ReleaseDate;


   Book (String Bookname, String Author, int ReleaseDate)
    {
        this.Bookname = Bookname;
        this.Author = Author;
        this.ReleaseDate = ReleaseDate;

    }


    public String getBookName() {
        return Bookname;
    }

    public String getAuthor() { return Author; }

    public int getReleaseDate() {
        return ReleaseDate;
    }

}