
import java.util.Scanner;

/*
Valentín Piñeyro DNI: 35.140.195
6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros.
*/

public class Ejercicio6 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 1; i < 11; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = Integer.parseInt(input.nextLine());
            
            if (num == 0) {
                ceros++;
            } else if (num > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
