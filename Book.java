public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetail() {
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
    }

    public static void main(String[] args) {
        Book b = new Book("Power", "Robert");
        b.displayDetail();
    }
}
