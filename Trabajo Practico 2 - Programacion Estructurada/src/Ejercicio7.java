
import java.util.Scanner;

/*
Valentín Piñeyro DNI: 35.140.195
 7. Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. 
Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.
*/

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(input.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.print("Error: Nota inválida. ");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
    }
}
