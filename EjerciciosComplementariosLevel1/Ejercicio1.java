package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Por favor, ingrese su nombre: ");
        String name = scan.nextLine();
        System.out.println("¡HOLA " + name + "!");
        scan.close();
    }
}
