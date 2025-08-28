
import java.util.Scanner;

/*
Valentín Piñeyro DNI: 35.140.195
9. Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar.
*/

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        int precioProducto = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProducto, calcularCostoEnvio(peso, zona));
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
        
    }
    static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else {
            return peso * 10;
        }
    }
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
