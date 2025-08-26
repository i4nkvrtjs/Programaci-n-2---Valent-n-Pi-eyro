package trabajo.practico.pkg1.introduccion.a.java;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad + ".");
    }
}
