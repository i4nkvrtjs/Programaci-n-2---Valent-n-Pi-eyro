
import java.util.Scanner;

/*
Valentín Piñeyro DNI: 35.140.195
3. Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente" 
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor"
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        if (edad > 0 && edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad < 18) {
            System.out.println("Eres un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else if (edad >= 60) {
            System.out.println("Eres un Adulto mayor.");
        } else {
            System.out.println("Edad inválida.");
        }
    }
}
