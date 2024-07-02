package library_inventory;

public enum SwitchEnum {


     CREATE_MAGAZINE(1),
     CREATE_BOOK(2),
     SHOW_ALL_MAGAZINES(3),
     SHOW_ALL_BOOKS(4),
     SHOW_SPECIFIC_MAGAZINE(5),
     SHOW_SPECIFIC_BOOK(6),
     GO_OUT(7)
     ;

     private int option;

     public int getSwitchEnum(){
        return option;
     }

     private SwitchEnum(int option){
        this.option=option;

     }

    public static SwitchEnum fromInt(int valor){
        for(SwitchEnum option : SwitchEnum.values()){
            if( option.option==valor){
                return option;

            }
            
        }
        System.out.println("valor incorrecto: "+ valor);
        return null;

    }
   

}
