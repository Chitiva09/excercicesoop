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
    public static void goOut(String userName) {

        System.out.printf(" ------------------------------:)--------------------------------\n");
        System.out.printf("|                          HASTA PRONTO %S                       |\n", userName);
        System.out.printf(" ---------------------------------------------------------------- \n");
    }
    
    public static void improperOperation (String userName) {

        System.out.printf(" ------------------------------:)--------------------------------\n");
        System.out.printf("|         %S ud ha ingresado una opcion incorrecta               |\n", userName);
        System.out.printf(" ---------------------------------------------------------------- \n");
    }
   
    public static void operationSucces(String userName) {

        System.out.printf(" ------------------------------:)--------------------------------\n");
        System.out.printf("|           Su solicitud se a realizado con exito %S             |\n", userName);
        System.out.printf(" ---------------------------------------------------------------- \n");
    }

    public static void booksError(String userName) {

        System.out.printf(" -----------------------------ERROR-------------------------------\n");
        System.out.printf("|              USUARI@ %S NO HAY LIBROS REGISTRADOS               |\n", userName);
        System.out.printf(" ----------------------------------------------------------------- \n");
    }
    public static void notFound() {

        System.out.printf(" -----------------------------ERROR-------------------------------\n");
        System.out.printf("|                 NO SE ENCONTRO ESA REVISTA                      |\n");
        System.out.printf(" ----------------------------------------------------------------- \n");
    }
    public static void magazinesError(String userName) {

        System.out.printf(" -----------------------------ERROR-------------------------------\n");
        System.out.printf("|             USUARI@ %S NO HAY REVISTAS REGISTRADAS              |\n", userName);
        System.out.printf(" ----------------------------------------------------------------- \n");
    }
    public static void optionsToFindMagazine() {
        System.out.println(" -------------------------------------------------------------");
        System.out.println("|                  ¿Como desea buscar?                        |");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("| 1. Por titulo                                               |");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("| 2. Por año de publicacion                                   |");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("| 3. Por numero de edición                                    |");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("| 4. Cancelar operacion                                       |");
        System.out.println(" ------------------------------------------------------------- ");
       
    }
    public static void numberEditionError(String userName) {

        System.out.printf(" -----------------------------ERROR-------------------------------\n");
        System.out.printf("|   USUARI@ %S el numero de edicion debe ser de 6 digitos         |\n", userName);
        System.out.printf(" ----------------------------------------------------------------- \n");
    }
    public static void errorIntroduction() {

        System.out.printf(" -----------------------------------ERROR--------------------------------------\n");
        System.out.printf("|                      HAS INGRESADO UN DATO INCORRECTO                        |\n");
        System.out.printf("|        El año debe tener 4 digitos y el numero de serie 6 digitos            |\n");
        System.out.printf(" ------------------------------------------------------------------------------ \n");
    }
    public static void yearError(String userName) {

        System.out.printf(" -----------------------------ERROR-------------------------------\n");
        System.out.printf("|   USUARI@ %S usted introdujo un año incorrecto         |\n", userName);
        System.out.printf(" ----------------------------------------------------------------- \n");
    }
    public static void optionsToFindBook() {
        System.out.print(" -------------------------------------------------------------");
        System.out.print("|                  ¿Como desea buscar?                        |");
        System.out.print("|-------------------------------------------------------------|");
        System.out.print("| 1. Por titulo                                               |");
        System.out.print("|-------------------------------------------------------------|");
        System.out.print("| 2. Por año de publicacion                                   |");
        System.out.print("|-------------------------------------------------------------|");
        System.out.print("| 3. Por numero de ISBN                                       |");
        System.out.print("|-------------------------------------------------------------|");
        System.out.print("| 4. Por nombre de autor                                      |");
        System.out.print("|-------------------------------------------------------------|");
        System.out.print("| 5. Cancelar operacion                                       |");
        System.out.print(" ------------------------------------------------------------- ");
      

    }
    public static void optionsUser(String userName) {
        System.out.printf(" -------------------------------------------------------------\n");
        System.out.printf("|       ¿que opcion deseas realizar  %S                       |\n" , userName);
        System.out.printf("|-------------------------------------------------------------|\n");
        System.out.printf("| 1. Agregar revista                                          |\n");
        System.out.printf("|-------------------------------------------------------------|\n");
        System.out.printf("| 2. Agregar libro                                            |\n");
        System.out.printf("|-------------------------------------------------------------|\n");
        System.out.printf("| 3. Mostrar todos los revistas                               |\n");
        System.out.printf("|-------------------------------------------------------------|\n");
        System.out.printf("| 4. Mostrar todas las libros                                 |\n");
        System.out.printf("|-------------------------------------------------------------|\n");
        System.out.printf("| 5. Buscar revista                                           |\n");
        System.out.printf("|-------------------------------------------------------------|\n");
        System.out.printf("| 6. Buscar libro                                             |\n");
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
