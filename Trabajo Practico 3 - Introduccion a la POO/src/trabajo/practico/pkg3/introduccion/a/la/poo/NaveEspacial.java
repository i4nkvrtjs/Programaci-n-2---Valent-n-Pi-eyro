/*
Valentín Piñeyro DNI 35.140.195
*/
package trabajo.practico.pkg3.introduccion.a.la.poo;

public class NaveEspacial {
    private String nombre;
    private double combustible;
    
    public void despegar() {
        if (combustible > 0) {
            System.out.println("Despegando...");
        } else {
            System.out.println("Combustible insuficiente.");
            System.out.println("Combustible disponible: " + combustible);
        }
    }
    public void avanzar(double distancia) {
        if (combustible >= distancia) {
            System.out.println("Avanzando " + distancia + " años luz.");
            combustible -= distancia;
        } else {
            System.out.println("Combustible insuficiente.");
            System.out.println("Combustible disponible: " + combustible);
        }
    }
    public void recargarCombustible(double cantidad) {
        if (combustible <= 100) {
            System.out.println("Combustible disponible: " + combustible);
            System.out.println("Recargando " + cantidad);
            combustible += cantidad;
            System.out.println("Combustible disponible: " + combustible);
        } else {
            System.out.println("Tanque de combustible lleno.");
        }
    }
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible);
    }
}
