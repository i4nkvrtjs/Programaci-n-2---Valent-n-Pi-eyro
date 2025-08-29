/*
Valentín Piñeyro DNI 35.140.195
5. Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
*/
package trabajo.practico.pkg3.introduccion.a.la.poo;

public class Ejercicio5 {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        
        nave.mostrarEstado();
        nave.avanzar(50);
        nave.recargarCombustible(50);
        nave.avanzar(50);
        nave.mostrarEstado();
    }
}
