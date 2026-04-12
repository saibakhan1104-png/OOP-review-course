
public class Book {

    private String bookTitle;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String bookTitle, String author, int publicationYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true; // default value
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean checkOut() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book Title: " + bookTitle +
               "\nAuthor: " + author +
               "\nPublication Year: " + publicationYear +
               "\nAvailability: " + (isAvailable ? "Available" : "Checked Out");
    }
}
