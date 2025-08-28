/*
Valentín Piñeyro DNI: 35.140.195
12. Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos. 
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.

*/

public class Ejercicio12 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        mostrarPreciosOriginales(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        mostrarPreciosModificados(precios, 0);
    }
    static void mostrarPreciosOriginales(double[] precios, int i) {
        if (i < precios.length) {    
            for (double precio : new double[] {precios[i]}) {
                System.out.println("Precio: $" + precio);
            }
            mostrarPreciosOriginales(precios, i + 1);
        }    
    }
    static void mostrarPreciosModificados(double[] precios, int i) {
        if (i < precios.length) {    
            for (double precio : new double[] {precios[i]}) {
                System.out.println("Precio: $" + precio);
            }
            mostrarPreciosModificados(precios, i + 1);
        }  
    }
}
