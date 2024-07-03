package library_inventory;

import java.util.Scanner;

public class LibraryInventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SwitchEnum optionIntroduction = null;
        String nameUser = "";
        MainSwitchEnum start;
        Book book = null;
        Magazine magazine = null;

        while (optionIntroduction != SwitchEnum.GO_OUT) {

            if ((book == null) && (magazine == null)) {
                Message.createAcount();
                nameUser = (scan.nextLine());
                Message message = new Message(nameUser);
            }

            Message.optionsUser(nameUser);
            optionIntroduction = SwitchEnum.fromInt(scan.nextInt());
            Options options = new Options(optionIntroduction);
            scan.close();
            start = options.boop();
            switch (start) {
                case OPERATION_SUCCES -> {
                    Message.operationSucces(nameUser);
                }
                case GO_OUT -> {
                    Message.goOut(nameUser);
                    break;
                }

                case IMPROPER_OPERATION -> {
                    Message.improperOperation(nameUser);
                }
                case OPTION_NOT_FOUND -> {

                }
                case NO_MAGAZINE-> {
                    Message.magazinesError(nameUser);

                }
                case NO_BOOKS->{
                    Message.booksError(nameUser);

                }
                default -> {

                    Message.improperOperation(nameUser);
                }

            }
        }

    }
}
