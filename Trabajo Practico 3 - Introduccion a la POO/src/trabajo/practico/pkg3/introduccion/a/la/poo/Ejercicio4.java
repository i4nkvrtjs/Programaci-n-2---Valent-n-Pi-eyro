/*
Valentín Piñeyro DNI 35.140.195
4. Gestión de Gallinas en Granja Digital
a. Crear una clase Gallina con los atributos: idGallina, edad,
huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
*/
package trabajo.practico.pkg3.introduccion.a.la.poo;

public class Ejercicio4 {
    public static void main(String[] args) {
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();
        
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        g1.envejecer();
        g1.ponerHuevo();
        g2.envejecer();
        g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
