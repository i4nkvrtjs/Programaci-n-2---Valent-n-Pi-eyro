/*
Valentín Piñeyro DNI 35.140.195
*/
package trabajo.practico.pkg3.introduccion.a.la.poo;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public void ponerHuevo() {
        huevosPuestos++;
    }
    public void envejecer() {
        edad++;
    }
    public void mostrarEstado() {
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
