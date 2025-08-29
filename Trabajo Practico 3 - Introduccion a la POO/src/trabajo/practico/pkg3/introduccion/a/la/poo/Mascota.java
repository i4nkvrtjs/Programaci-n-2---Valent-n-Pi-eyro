/*
Valentín Piñeyro DNI 35.140.195
*/
package trabajo.practico.pkg3.introduccion.a.la.poo;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    public void cumplirAnios() {
        edad++;
    }
}
