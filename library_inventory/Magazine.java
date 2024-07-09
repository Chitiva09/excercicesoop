package library_inventory;

public class Magazine extends Material {

    private String numEdition;

 public Magazine (String title, String publicationYear, String numEdition){
    super(title, publicationYear);
    this.numEdition=numEdition;

 }




 

public void showInfo(){
    System.out.println("Número de edición: "+ numEdition );

}




public String getNumEdition() {
    return numEdition;
}

public void setNumEdition(String numEdition) {
    this.numEdition = numEdition;
}


}
