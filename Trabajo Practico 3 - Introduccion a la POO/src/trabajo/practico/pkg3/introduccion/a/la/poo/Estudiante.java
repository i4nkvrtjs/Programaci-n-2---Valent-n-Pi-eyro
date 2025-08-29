/*
Valentín Piñeyro DNI 35.140.195 
*/
package trabajo.practico.pkg3.introduccion.a.la.poo;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
    }
    
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
}
