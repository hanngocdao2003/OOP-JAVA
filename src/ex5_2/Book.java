package ex5_2;

public class Book {
    private String title;
    private double price;
    private int yearOfPublication;
    private String authorName;

    public Book(String title, double price, int yearOfPublication, String authorName) {
        this.title = title;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
        this.authorName = authorName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfPublication=" + yearOfPublication +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}