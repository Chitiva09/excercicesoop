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
    private int optionToFind;
    private String toFind;

    Scanner scan = new Scanner(System.in);
    Book book = null;// este me sirve para inocializar el objeto book en null
    Magazine magazine = null; //  este me sirve para inocializar el objeto magazine en null
    List<Magazine> magazines = new ArrayList<>(); // inicializacion del list magazines
    List<Book> books = new ArrayList<>();//inicializacion del list books

    //constructr para traer por parametro la opcion para ingresar en  el switch
    public Options(SwitchEnum optionIntroduction) {
        this.optionSwitcIntro = optionIntroduction;

    }

    //metodo para el switch que llame boop
    public MainSwitchEnum boop() {
        switch (optionSwitcIntro) {

            case CREATE_MAGAZINE -> {

                System.out.println("Cual es el titulo de su revista?");
                title = scan.nextLine();
                
                System.out.println("Cual es el año de publicacion de ?" + title);
                publicationYear = scan.nextInt();
               
                System.out.println("Cual es el numero de edicion de ?" + title);
                numEdition = scan.nextInt();
              

                Magazine magazine = new Magazine(title, publicationYear, numEdition);
                magazines.add(magazine);// meto la informacion del objeto magazine en el list magazines

                return MainSwitchEnum.OPERATION_SUCCES;
            }
            case CREATE_BOOK -> {
                System.out.println("Cual es el titulo de su libro?");
                title = scan.nextLine();
                System.out.println("Cual es el año de publicacion de ?" + title);
                publicationYear = scan.nextInt();
                System.out.println("Cual es el numero de ISBN de ?" + title);
                numberIsbn = scan.nextInt();
                System.out.println("Cual es el nombre del autor de ?" + title);
                author = scan.nextLine();

                Book book = new Book(title, publicationYear, numberIsbn, author);
                books.add(book);// meto la informacion del objeto book en el list books

                return MainSwitchEnum.OPERATION_SUCCES;
            }

            case SHOW_ALL_MAGAZINES -> {
                // con este if si el list magazines esta en null retorna un mensaje en el cual dice que list no tiene informacion
                if ( magazines == null) {
                    return MainSwitchEnum.NO_MAGAZINE;

                } else {

                    System.out.printf(
                            " ------------------------------------------------------------------------------------ \n");
                    System.out.printf(
                            "|      NOMBRE DE LA REVISTA      |    AÑO DE PUBLICACION    |    NUMERO DE EDICION   |\n");
                    System.out.printf(
                            "|------------------------------------------------------------------------------------|\n");

                    for (Magazine magazin : magazines) {
                        System.out.println("entro al for");
                        System.out.printf("|      %s      |    %d    |    %d   |%n", magazin.getTitle(),
                                magazin.getPublicationYear(), magazin.getNumEdition());

                    }

                    return MainSwitchEnum.OPERATION_SUCCES;
                }
            }

            case SHOW_ALL_BOOKS -> {

                if (books == null) {
                    return MainSwitchEnum.NO_BOOKS;

                } else {

                    System.out.printf(
                            " -------------------------------------------------------------------------------------------------------- \n");
                    System.out.printf(
                            "|      NOMBRE DEL LIBRO     |    AÑO DE PUBLICACION    |      NUMERO DE ISBN         |      AUTOR        | \n");
                    System.out.printf(
                            "|--------------------------------------------------------------------------------------------------------|\n");

                    for (Book book : books) {
                        System.out.printf("|      %s      |    %d    |    %d   |   %S   |%n", book.getTitle(),
                                book.getPublicationYear(), book.getNumberIsbn(), book.getAuthor());

                    }

                    return MainSwitchEnum.OPERATION_SUCCES;
                }
            }
            case SHOW_SPECIFIC_MAGAZINE -> {
                if (magazines == null) {
                    return MainSwitchEnum.NO_MAGAZINE;

                } else {

                    Message.optionsToFindMagazine();
                    optionToFind = (scan.nextInt());

                    switch (optionToFind) {
                        case 1 -> {
                            System.out.println("digite el titulo");
                                toFind = (scan.nextLine());
   
                            for (Magazine magazine : magazines) {
                                
                                if ((magazine.getTitle().contains(toFind))) {
                                    System.out.println(magazine);
                                }
                            }

                        }
                        case 2 -> {

                        }
                        case 3 -> {

                        }
                        case 4 -> {

                        }

                    }

                    return MainSwitchEnum.OPERATION_SUCCES;
                }
            }
            case SHOW_SPECIFIC_BOOK -> {
                if (books == null) {
                    return MainSwitchEnum.NO_MAGAZINE;

                } else {

                    for (Book book : books) {
                        Message.optionsToFindBook();
                        optionToFind = (scan.nextInt());

                        switch (optionToFind) {
                            case 1 -> {

                            }
                            case 2 -> {

                            }
                            case 3 -> {

                            }
                            case 4 -> {

                            }
                            case 5 -> {

                            }
                        }
                    }

                    return MainSwitchEnum.OPERATION_SUCCES;
                }
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
