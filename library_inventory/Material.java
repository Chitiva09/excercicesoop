package library_inventory;

public class Material {
    private String title;
    private int publicationYear;

    public Material(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }



public void showInfo (){

System.out.println("Tu material tiene la siguiente informacion: " );
System.out.println("Titulo: "+ title );
System.out.println("Año de publicacion: "+ publicationYear );

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
      
}
