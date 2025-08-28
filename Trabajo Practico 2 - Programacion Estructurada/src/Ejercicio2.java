
import java.util.Scanner;
//Valentín Piñeyro DNI: 35.140.195
//2. Determinar el Mayor de Tres Números.
//Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Ingrese el primer número: ");
        a = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo número: ");
        b = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el tercer número: ");
        c = Integer.parseInt(input.nextLine());
        
        System.out.println("El mayor es: " + mayor(a, b, c));
    }
    static int mayor(int a, int b, int c) {
        int mayor = a;
        if (b > mayor) {
            mayor = b;
        } 
        if (c > mayor) {
            mayor = c;
        }
        return mayor;
    }
}
