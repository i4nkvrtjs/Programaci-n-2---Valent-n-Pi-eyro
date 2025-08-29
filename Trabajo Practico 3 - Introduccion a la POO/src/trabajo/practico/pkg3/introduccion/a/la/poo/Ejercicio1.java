/*
Valentín Piñeyro DNI 35.140.195
1. Registro de Estudiantes
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.
*/
package trabajo.practico.pkg3.introduccion.a.la.poo;

public class Ejercicio1 {

    public static void main(String[] args) {
        Estudiante a = new Estudiante();
        
        a.mostrarInfo();
        
        a.subirCalificacion(3);
        a.mostrarInfo();
        
        a.bajarCalificacion(2);
        a.mostrarInfo();
    }
    
}
