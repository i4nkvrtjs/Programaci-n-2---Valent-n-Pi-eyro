
import java.util.Scanner;

/*
Valentín Piñeyro DNI: 35.140.195
4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
Luego, aplique los siguientes descuentos: 
Categoría A: 10% de descuento 
Categoría B: 15% de descuento 
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el precio final
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        int precio = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = input.next().charAt(0);
        
        double precioFinal = precio - aplicarDescuento(precio, categoria);
        System.out.println("Descuento aplicado: " + descuento(precio, categoria) + "%");
        System.out.println("Precio final: " + precioFinal);
    }   
    static int descuento(int precio, char categoria) {
        if (Character.toLowerCase(categoria) == 'a') {
            return 10;
        } else if (Character.toLowerCase(categoria) == 'b') {
            return 15;
        } else if (Character.toLowerCase(categoria) == 'c') {
            return 20;
        } else {
            return 0;
        }
    }
    static double aplicarDescuento(int precio, char categoria) {
        return switch (Character.toLowerCase(categoria)) {
            case 'a' -> precio * 0.1;
            case 'b' -> precio * 0.15;
            case 'c' -> precio * 0.2;
            default -> precio;
        };
    }
}
