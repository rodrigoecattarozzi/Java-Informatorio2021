package EjerciciosGuiados;
import java.util.Scanner;

public class Ejercicio6_0 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int next = 1;
        int num;
        while (next == 1){
            System.out.println("Por favor, ingrese un número: ");
            num = scan.nextInt();
            System.out.println("Valor ingresado: " + num);

            System.out.println("Si desea continuar ingresando un valor, presione 1. Sino, cualquier otro número: ");
            next = scan.nextInt();
        }
        scan.close();
    }
}
