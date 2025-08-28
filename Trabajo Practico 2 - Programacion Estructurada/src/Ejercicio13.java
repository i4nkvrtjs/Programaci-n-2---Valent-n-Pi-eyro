/*
Valentín Piñeyro DNI: 35.140.195
13. Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos. 
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.
*/

public class Ejercicio13 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);
        
    }
    static void mostrarPrecios(double[] precios, int i) {
        if (i < precios.length) {
            System.out.println("Precio: $" + precios[i]);
            mostrarPrecios(precios, i + 1);
        }
    }
}
