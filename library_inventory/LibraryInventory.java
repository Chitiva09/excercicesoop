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

                Message.introduction(nameUser);
                optionIntroduction = SwitchEnum.fromInt(scan.nextInt());scan.nextLine();
                Options options = new Options(optionIntroduction);

                Message message = new Message(nameUser);

            }

            Message.optionsUser(nameUser);
            optionIntroduction = SwitchEnum.fromInt(scan.nextInt());
            Options options = new Options(optionIntroduction);
            scan.close();
            start = options.boop();
            switch (start) {
                case MainSwitchEnum.OPERATION_SUCCES -> {

                }
                case MainSwitchEnum.SALIR -> {

                }

                case MainSwitchEnum.IMPROPER_OPERATION -> {

                }
                case MainSwitchEnum.OPTION_NOT_FOUND -> {

                }
                default -> {

                    Message.optionsUser(nameUser);
                }

            }
        }

    }
}
