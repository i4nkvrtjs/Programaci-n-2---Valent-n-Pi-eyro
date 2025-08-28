
import java.util.Scanner;
//Valentín Piñeyro DNI: 35.140.195
//1. Verificación de Año Bisiesto.
//Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto.
//Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un año: ");
        int anio = Integer.parseInt(input.nextLine());
        
        esBisiesto(anio);
        
    }
    static void esBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }
    
}
