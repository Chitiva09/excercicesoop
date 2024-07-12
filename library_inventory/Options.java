package library_inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Options {

    private String title;
    private String publicationYear;
    private String numEdition;
    private String numberIsbn;
    private String author;
    private int optionToFind;
    private String toFind;

    Scanner scan = new Scanner(System.in);
    List<Magazine> magazines = new ArrayList<>(); // inicializacion del list magazines
    List<Book> books = new ArrayList<>();// inicializacion del list books

    // metodo para el switch que llame boop
    public MainSwitchEnum boop(SwitchEnum optionIntroduction) {

        switch (optionIntroduction) {

            case CREATE_MAGAZINE -> {

                System.out.println("Cual es el titulo de su revista?");
                title = scan.nextLine();

                // utilizo este do-while para hacer un mini bucle para que si ingresan un año
                // de mas o menos de 4 caracteres de error y se repita la peticion del dato
                while(publicationYear.length() == 4); {
                    System.out.println("Cual es el año de publicacion de ?" + title);
                    publicationYear = scan.nextLine();
                    if (publicationYear.length() == 4){
                        break;
                    }
                        Message.errorIntroduction();
                }

                // utilizo este do-while para hacer un mini bucle para que si ingresan un numero de serie
                // de mas o menos de 6 caracteres de error y se repita la peticion del dato
                while (numEdition.length() == 6); {
                    System.out.println("Cual es el numero de edicion de ?" + title);
                    numEdition = scan.nextLine();
                    if (numEdition.length() == 6){
                       break;
                    }
                    Message.errorIntroduction();
                }

                Magazine magazine = new Magazine(title, publicationYear, numEdition);
                magazines.add(magazine);// meto la informacion del objeto magazine en el list magazines

                return MainSwitchEnum.OPERATION_SUCCES;

            }
            case CREATE_BOOK -> {
                System.out.println("Cual es el titulo de su libro?");
                title = scan.nextLine();
                System.out.println("Cual es el año de publicacion de ?" + title);
                publicationYear = scan.nextLine();
                System.out.println("Cual es el numero de ISBN de ?" + title);
                numberIsbn = scan.nextLine();
                System.out.println("Cual es el nombre del autor de ?" + title);
                author = scan.nextLine();

                Book book = new Book(title, publicationYear, numberIsbn, author);
                books.add(book);// meto la informacion del objeto book en el list books

                return MainSwitchEnum.OPERATION_SUCCES;
            }

            case SHOW_ALL_MAGAZINES -> {
                // con este if si el list magazines esta en null retorna un mensaje en el cual
                // dice que list no tiene informacion
                if (magazines.isEmpty()) {
                    return MainSwitchEnum.NO_MAGAZINE;

                } else {

                    System.out.printf(
                            " ------------------------------------------------------------------------------------ \n");
                    System.out.printf(
                            "|      NOMBRE DE LA REVISTA      |    AÑO DE PUBLICACION    |    NUMERO DE EDICION   |\n");
                    System.out.printf(
                            "|------------------------------------------------------------------------------------|\n");

                    for (Magazine magazin : magazines) {
                        System.out.printf("|      %s      |    %s    |    %s   |%n", magazin.getTitle(),
                                magazin.getPublicationYear(), magazin.getNumEdition());

                    }

                    return MainSwitchEnum.OPERATION_SUCCES;
                }
            }

            case SHOW_ALL_BOOKS -> {

                if (books.isEmpty()) {
                    return MainSwitchEnum.NO_BOOKS;

                } else {

                    System.out.printf(
                            " -------------------------------------------------------------------------------------------------------- \n");
                    System.out.printf(
                            "|      NOMBRE DEL LIBRO     |    AÑO DE PUBLICACION    |      NUMERO DE ISBN         |      AUTOR        | \n");
                    System.out.printf(
                            "|--------------------------------------------------------------------------------------------------------|\n");

                    for (Book book : books) {
                        System.out.printf("|      %s      |    %s    |    %s   |   %S   |%n", book.getTitle(),
                                book.getPublicationYear(), book.getNumberIsbn(), book.getAuthor());

                    }

                    return MainSwitchEnum.OPERATION_SUCCES;
                }
            }
            case SHOW_SPECIFIC_MAGAZINE -> {
                if (magazines.isEmpty()) {
                    return MainSwitchEnum.NO_MAGAZINE;

                } else {

                    Message.optionsToFindMagazine();
                    optionToFind = (scan.nextInt());
                    scan.nextLine();

                    switch (optionToFind) {
                        case 1 -> {
                            System.out.println("digite el titulo");
                            toFind = (scan.nextLine());

                            for (Magazine magazine : magazines) {

                                if (!magazine.getTitle().toUpperCase().contains(toFind.toUpperCase())) {
                                    return MainSwitchEnum.NOT_FOUND_MAGAZINE;

                                } else if ((magazine.getTitle().toUpperCase().contains(toFind))) {

                                    System.out.printf(
                                            " ------------------------------------------------------------------------------------ \n");
                                    System.out.printf(
                                            "|      NOMBRE DE LA REVISTA      |    AÑO DE PUBLICACION    |    NUMERO DE EDICION   |\n");
                                    System.out.printf(
                                            "|------------------------------------------------------------------------------------|\n");

                                    System.out.printf("|      %s      |    %s    |    %s   |%n", magazine.getTitle(),
                                            magazine.getPublicationYear(), magazine.getNumEdition());

                                }
                            }
                        }
                        case 2 -> {
                            System.out.println("digite el año de publicacion");
                            toFind = (scan.nextLine());
                            if ((toFind.length() == 4)) {

                                for (Magazine magazine : magazines) {

                                    if ((magazine.getPublicationYear().contains(toFind))) {

                                        System.out.printf(
                                                " ------------------------------------------------------------------------------------ \n");
                                        System.out.printf(
                                                "|      NOMBRE DE LA REVISTA      |    AÑO DE PUBLICACION    |    NUMERO DE EDICION   |\n");
                                        System.out.printf(
                                                "|------------------------------------------------------------------------------------|\n");

                                        System.out.printf("|      %s      |    %s    |    %s   |%n",
                                                magazine.getTitle(),
                                                magazine.getPublicationYear(), magazine.getNumEdition());

                                    }
                                }
                            } else {
                                return MainSwitchEnum.YEAR_ERROR;
                            }
                        }
                        case 3 -> {
                            System.out.println("digite el numero de edicion");
                            toFind = (scan.nextLine());
                            if ((toFind.length() == 6)) {

                                for (Magazine magazine : magazines) {

                                    if ((magazine.getNumEdition().toUpperCase().contains(toFind.toUpperCase()))) {

                                        System.out.printf(
                                                " ------------------------------------------------------------------------------------ \n");
                                        System.out.printf(
                                                "|      NOMBRE DE LA REVISTA      |    AÑO DE PUBLICACION    |    NUMERO DE EDICION   |\n");
                                        System.out.printf(
                                                "|------------------------------------------------------------------------------------|\n");

                                        System.out.printf("|      %s      |    %s    |    %s   |%n",
                                                magazine.getTitle(),
                                                magazine.getPublicationYear(), magazine.getNumEdition());

                                    }
                                }
                                return MainSwitchEnum.OPERATION_SUCCES;
                            } else {

                                return MainSwitchEnum.NUMBER_EDITION_ERROR;
                            }

                        }
                        case 4 -> {

                        }

                    }

                    return MainSwitchEnum.OPERATION_SUCCES;
                }
            }
            case SHOW_SPECIFIC_BOOK -> {
                if (books.isEmpty()) {
                    return MainSwitchEnum.NO_MAGAZINE;

                } else {

                    for (Book book : books) {
                        Message.optionsToFindBook();
                        optionToFind = (scan.nextInt());
                        scan.nextLine();

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getNumEdition() {
        return numEdition;
    }

    public void setNumEdition(String numEdition) {
        this.numEdition = numEdition;
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

    public String getToFind() {
        return toFind;
    }

    public void setToFind(String toFind) {
        this.toFind = toFind;
    }

}
