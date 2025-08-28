
import java.util.Scanner;

/*
Valentín Piñeyro DNI: 35.140.195
5. Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los números pares. 
El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 0;
        System.out.print("Ingrese un número (0 para terminar): ");
        int num = Integer.parseInt(input.nextLine());
        
        while (num != 0) {
            if (num % 2 == 0) {
                suma += num;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("La suma de los números es: " + suma);
    }
}
