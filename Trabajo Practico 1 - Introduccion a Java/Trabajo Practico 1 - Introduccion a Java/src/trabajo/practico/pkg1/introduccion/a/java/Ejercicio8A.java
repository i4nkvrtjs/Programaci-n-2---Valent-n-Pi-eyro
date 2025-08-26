package trabajo.practico.pkg1.introduccion.a.java;

import java.util.Scanner;

public class Ejercicio8A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Ingresa el segundo número: ");
        int b = Integer.parseInt(input.nextLine());
        
        if (b != 0) {
            int division1 = a / b;
            System.out.println("División (a / b): " + division1);
	} else {
            System.out.println("No se puede dividir entre 0 (a / b).");
	}

	if (a != 0) {
            int division2 = b / a;
            System.out.println("División (b / a): " + division2);
	} else {
            System.out.println("No se puede dividir entre 0 (b / a).");
	}
        
    }
}
