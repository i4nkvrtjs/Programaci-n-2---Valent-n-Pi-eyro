
import java.util.Scanner;

/*
Valentín Piñeyro DNI: 35.140.195
10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), 
que calcule el nuevo stock después de una venta y recepción de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida 
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.
*/

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
