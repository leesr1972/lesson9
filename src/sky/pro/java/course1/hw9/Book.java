package sky.pro.java.course1.hw9;

public class Book {
    private final String titleBook;
    private final Author authorBook;
    public int yearOfPublication;

    public Book(String titleBook, Author authorBook, int yearOfPublication) {
        this.titleBook = titleBook;
        this.authorBook = authorBook;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
