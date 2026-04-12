public class Book {

    private String title;
    private String author;
    private float price;
    public Book() {
        this.title = null;
        this.author = null;
        this.price = 0.0f;
    }

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    public String toString() {
        return "Title - " + this.title +
                "\nAuthor - " + this.author +
                "\nPrice - " + String.format("%.2f", this.price);
    }
    public static void main(String[] args) {

        Book b1 = new Book("Java Programming", "James Gosling", 500.0f);


        System.out.println("Book 1 Details:");
        System.out.println(b1);
        Book b2 = new Book();
        b2.setTitle("C Programming");
        b2.setAuthor("Dennis Ritchie");
        b2.setPrice(350.75f);

  
        System.out.println("\nBook 2 Details:");
        System.out.println("Title: " + b2.getTitle());
        System.out.println("Author: " + b2.getAuthor());
        System.out.println("Price: " + b2.getPrice());
    }
}
