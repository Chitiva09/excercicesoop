package library_inventory;

public class Material {
    private String title;
    private String publicationYear;

    public Material(String title, String publicationYear) {
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
    public String getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }
      
}
