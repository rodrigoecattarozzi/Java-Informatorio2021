package EjerciciosGuiados_Level1y2;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String [] args){
    
        Scanner scan = new Scanner(System.in);
        
        int next = 1;
        
        while (next == 1){
            System.out.println("Ingrese la nota a evaluar: ");
            int cal = scan.nextInt();

            if (cal > 92){
                System.out.println("Excelente");
            } else if (cal > 84){
                System.out.println("Sobresaliente");
            } else if (cal > 74){
                System.out.println("Distinguido");
            } else if (cal > 59){
                System.out.println("Bueno");
            } else{
                System.out.println("Desaprobado");
            }
            System.out.println("Si desea continuar ingresando un valor, presione 1. Sino, cualquier otro número: ");
            next = scan.nextInt();
        }

        scan.close();
    }
}
