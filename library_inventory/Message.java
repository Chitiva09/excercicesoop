package library_inventory;

public class Message {
    String userName;
    public Message (String nameUser ){
        this.userName=nameUser;

    }


    public static void createAcount() {
        System.out.println(" ----------------- BIENVENIDO --------------------" );
        System.out.println("|     Por favor ingrese un nombre de usuario      |");
        System.out.println(" ------------------------------------------------- ");

    }

    public static void introduction(String userName) {

        System.out.printf(" ------------------------------------------------------------\n");
        System.out.printf("|     ¿que opcion deseas registrar %s                        |\n", userName);
        System.out.printf("|------------------------------------------------------------|\n");
        System.out.printf("| 1. Libro                                                   |\n");
        System.out.printf("|------------------------------------------------------------|\n");
        System.out.printf("| 2. Revista                                                 |\n");
        System.out.printf("|------------------------------------------------------------|\n");
        System.out.printf("| 3. Cancelar operacion y salir                              |\n");
        System.out.printf(" ------------------------------------------------------------ \n");
    }

    public static void optionsUser(String userName) {
        System.out.printf(" -------------------------------------------------------------\n");
        System.out.printf("|       ¿que opcion deseas realizar %s                        |\n" , userName);
        System.out.printf("|-------------------------------------------------------------|\n");
        System.out.printf("| 1. Agregar nuevo libro                                      |\n");
        System.out.printf("|-------------------------------------------------------------|\n");
        System.out.printf("| 2. Agregar nueva revista                                    |\n");
        System.out.printf("|-------------------------------------------------------------|\n");
        System.out.printf("| 3. Mostrar todos los libros                                 |\n");
        System.out.printf("|-------------------------------------------------------------|\n");
        System.out.printf("| 4. Mostrar todas las revistas                               |\n");
        System.out.printf("|-------------------------------------------------------------|\n");
        System.out.printf("| 5. Buscar libro por numero ISBN                             |\n");
        System.out.printf("|-------------------------------------------------------------|\n");
        System.out.printf("| 6. Buscar revista por numero de edicion                     |\n");
        System.out.printf("|-------------------------------------------------------------|\n");
        System.out.printf("| 7. Salir                                                    |\n");
        System.out.printf(" ------------------------------------------------------------- \n");

    }

    public static void showMessage(String message) {

        int width = 50;
        int surplus = (width - message.length()) / 2;
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.print("\n");

        // System.out.printf("%-"+surplus+"s", message);
        System.out.printf("%" + width + "s%n", message);
        System.out.print("\n");

        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }

    }


}
