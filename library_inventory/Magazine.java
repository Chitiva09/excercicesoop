package library_inventory;

public class Magazine extends Material {

    private int numEdition;

 public Magazine (String title, int publicationYear, int numEdition){
    super(title, publicationYear);
    this.numEdition=numEdition;

 }




 

public void showInfo(){
    System.out.println("Número de edición: "+ numEdition );

}




public int getNumEdition() {
    return numEdition;
}

public void setNumEdition(int numEdition) {
    this.numEdition = numEdition;
}


}
