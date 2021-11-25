package EjerciciosGuiados_Level1y2;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        int next = 1;

        while (next == 1){
            System.out.print("Ingrese el valor que desea multiplicar: ");
            int value = scan.nextInt();

            for (int i = 1; i <= 10; i++){
                System.out.println(value + " x " + i + " = " + value*i);
            }
            
            System.out.println("Si desea continuar ingresando un valor, presione 1. Sino, cualquier otro número: ");
            next = scan.nextInt();
        }
        scan.close();
    }
}
