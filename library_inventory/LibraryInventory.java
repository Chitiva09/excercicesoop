package library_inventory;

import java.util.Scanner;

public class LibraryInventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SwitchEnum optionIntroduction = null;
        String nameUser = "";
        MainSwitchEnum start;
        Options options = new Options();
        Message message = null;

        while (optionIntroduction != SwitchEnum.GO_OUT) {

            if (message == null) {
                Message.createAcount();
                nameUser = (scan.nextLine());
                message = new Message(nameUser);
            } else {

                Message.optionsUser(nameUser);
                optionIntroduction = SwitchEnum.fromInt(scan.nextInt());

                start = options.boop(optionIntroduction);
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

                    case NO_MAGAZINE -> {
                        Message.magazinesError(nameUser);

                    }
                    case NO_BOOKS -> {
                        Message.booksError(nameUser);

                    }
                    case NUMBER_EDITION_ERROR -> {

                        Message.numberEditionError(nameUser);
                    }
                   
                    
                    case YEAR_ERROR -> {
                        Message.yearError(nameUser);
                    }

                    default -> {

                        Message.improperOperation(nameUser);

                    }

                }
            }
        }

    }
}
