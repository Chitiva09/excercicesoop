package library_inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Options {

    private SwitchEnum optionSwitcIntro;
    private String title;
    private int publicationYear;
    private int numEdition;
    private int numberIsbn;
    private String author;
    private String toFind;

    Scanner scan = new Scanner(System.in);
    Book book = null;
    List<Magazine> magazines = new ArrayList<>();
    List<Book> books = new ArrayList<>();

    public Options(SwitchEnum optionIntroduction) {
        this.optionSwitcIntro = optionIntroduction;
    }

    

    public MainSwitchEnum boop() {
        switch (optionSwitcIntro) {

            case SwitchEnum.CREATE_MAGAZINE -> {

                System.out.println("Cual es el titulo de su revista?");
                title = scan.nextLine();
                System.out.println("Cual es el año de publicacion de ?" + title);
                publicationYear = scan.nextInt();
                System.out.println("Cual es el numero de edicion de ?" + title);
                numEdition = scan.nextInt();

                Magazine magazine = new Magazine(title, publicationYear, numEdition);
                magazines.add(magazine);

                return MainSwitchEnum.OPERATION_SUCCES;
            }
            case SwitchEnum.CREATE_BOOK -> {
                System.out.println("Cual es el titulo de su libro?");
                title = scan.nextLine();
                System.out.println("Cual es el año de publicacion de ?" + title);
                publicationYear = scan.nextInt();
                System.out.println("Cual es el numero de ISBN de ?" + title);
                numberIsbn = scan.nextInt();
                System.out.println("Cual es el nombre del autor de ?" + title);
                author = scan.nextLine();

                Book book = new Book(title, publicationYear, numberIsbn, author);
                books.add(book);

                return MainSwitchEnum.OPERATION_SUCCES;
            }

            case SwitchEnum.SHOW_ALL_MAGAZINES -> {

                System.out.printf(" ------------------------------------------------------------------------------------ ");
                System.out.printf("|      NOMBRE DE LA REVISTA      |    AÑO DE PUBLICACION    |    NUMERO DE EDICION   |");
                System.out.printf("|------------------------------------------------------------------------------------|");
             

                for ( Magazine magazine : magazines){
                    System.out.printf("|      %s      |    %d    |    %d   |%n", magazine.getTitle(), magazine.getPublicationYear(), magazine.getNumEdition() );

                }

                return MainSwitchEnum.OPERATION_SUCCES;
            }

            case SwitchEnum.SHOW_ALL_BOOKS -> {
                
                System.out.printf(" -------------------------------------------------------------------------------------------------------- ");
                System.out.printf("|      NOMBRE DEL LIBRO     |    AÑO DE PUBLICACION    |      NUMERO DE ISBN         |      AUTOR        | ");
                System.out.printf("|--------------------------------------------------------------------------------------------------------|");
             

                for ( Book book : books){
                    System.out.printf("|      %s      |    %d    |    %d   |   %S   |%n", book.getTitle(), book.getPublicationYear(), book.getNumberIsbn(), book.getAuthor());

                }
 

                return MainSwitchEnum.OPERATION_SUCCES;
            }
            case SwitchEnum.SHOW_SPECIFIC_MAGAZINE -> {



                for ( Magazine magazine : magazines) {
                    


                }




                return MainSwitchEnum.OPERATION_SUCCES;
            }
            case SwitchEnum.SHOW_SPECIFIC_BOOK -> {

                return MainSwitchEnum.OPERATION_SUCCES;
            }
            case GO_OUT -> {

                return MainSwitchEnum.GO_OUT;
            }
            default -> {
                return MainSwitchEnum.IMPROPER_OPERATION;
            }
        }

    }

    public SwitchEnum getOptionSwitcIntro() {
        return optionSwitcIntro;
    }

    public void setOptionSwitcIntro(SwitchEnum optionSwitcIntro) {
        this.optionSwitcIntro = optionSwitcIntro;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumEdition() {
        return numEdition;
    }

    public void setNumEdition(int numEdition) {
        this.numEdition = numEdition;
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

    public String getToFind() {
        return toFind;
    }

    public void setToFind(String toFind) {
        this.toFind = toFind;
    }

}
