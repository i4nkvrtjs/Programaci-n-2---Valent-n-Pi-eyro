package trabajo.practico.pkg1.introduccion.a.java;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Ingresa el segundo número: ");
        int b = Integer.parseInt(input.nextLine());
        
        int suma = a + b;
        System.out.println("Suma (a + b): " + suma);
        int resta1 = a - b;
        System.out.println("Resta (a - b): " + resta1);
        int resta2 = b - a;
        System.out.println("Resta (b - a): " + resta2);
        int multi = a * b;
        System.out.println("Multiplicación (a * b): " + multi);
        if (b != 0) {
            double division1 = (double) a / b;
            System.out.println("División (a / b): " + division1);
	} else {
            System.out.println("No se puede dividir entre 0 (a / b).");
	}

	if (a != 0) {
            double division2 = (double) b / a;
            System.out.println("División (b / a): " + division2);
	} else {
            System.out.println("No se puede dividir entre 0 (b / a).");
	}
    }
}
