
import java.util.Scanner;

/*
Valentín Piñeyro DNI: 35.140.195
11. Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.
*/

public class Ejercicio11 {
    final static double EJEMPLO_DE_ENTRADA_SALIDA = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        int precio = Integer.parseInt(input.nextLine());
        
        calcularDescuentoEspecial(precio);
    }
    static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * EJEMPLO_DE_ENTRADA_SALIDA;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
