package library_inventory;

public class Book extends Material {
    private String numberIsbn;
    private String author;

    public Book(String title, String publicationYear, String numberIsbn, String author) {
        super(title, publicationYear);
        this.author = author;
        this.numberIsbn = numberIsbn;

    }

    @Override
    public void showInfo() {

        System.out.println("Autor: " + author);

    }

    public String getNumberIsbn() {
        return numberIsbn;
    }

    public void setNumberIsbn(String numberIsbn) {
        this.numberIsbn = numberIsbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
