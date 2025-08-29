/*
Valentín Piñeyro DNI 35.140.195
3. Encapsulamiento con la Clase Libro
a. Crear una clase Libro con atributos privados: titulo, autor,
añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final.

*/
package trabajo.practico.pkg3.introduccion.a.la.poo;

public class Ejercicio3 {
    public static void main(String[] args) {
        Libro l = new Libro();
        
        System.out.println(l.getAñoPublicacion());
        l.setAñoPublicacion(-2034);
        System.out.println(l.getAñoPublicacion());
        l.setAñoPublicacion(1990);
        System.out.println(l.getAñoPublicacion());
    }
}
