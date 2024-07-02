package library_inventory;

public class Book extends Material {
    private int numberIsbn;
    private String author;

    public Book(String title, int publicationYear, int numberIsbn, String author) {
        super(title, publicationYear);
        this.author = author;
        this.numberIsbn = numberIsbn;

    }

    @Override
    public void showInfo() {

        System.out.println("Autor: " + author);

    }

    public int getNumberIsbn() {
        return numberIsbn;
    }

    public void setNumberIsbn(int numberIsbn) {
        this.numberIsbn = numberIsbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
