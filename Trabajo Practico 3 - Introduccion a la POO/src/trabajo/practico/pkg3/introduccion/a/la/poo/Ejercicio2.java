/*
Valentín Piñeyro DNI 35.140.195
2. Registro de Mascotas
a. Crear una clase Mascota con los atributos: nombre, especie, edad.
Métodos requeridos: mostrarInfo(), cumplirAnios().
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
verificar los cambios.
*/
package trabajo.practico.pkg3.introduccion.a.la.poo;

public class Ejercicio2 {
    public static void main(String[] args) {
        Mascota a = new Mascota();
        
        a.mostrarInfo();
        
        a.cumplirAnios();
        a.mostrarInfo();
    }
}
