package EjerciciosGuiados_Level1y2;
import java.util.Scanner;

public class Ejercicio6_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num, next;

        do{
            System.out.println("Por favor, ingrese un número: ");
            num = scan.nextInt();
            System.out.println("Valor ingresado: " + num);

            System.out.println("Si desea continuar ingresando un valor, presione 1. Sino, cualquier otro número: ");
            next = scan.nextInt();
        }while (next == 1);

        scan.close();
    }
}
