package EjerciciosGuiados;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int next = 1;
        
        while (next == 1){
            System.out.print("Ingrese el día de la semana: ");
            int dia = scan.nextInt();

            switch (dia){
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Lunes");
                    break;
                case 3:
                    System.out.println("Martes");
                    break;
                case 4:
                    System.out.println("Miércoles");
                    break;
                case 5:
                    System.out.println("Jueves");
                    break;
                case 6:
                    System.out.println("Viernes");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
            }
            System.out.println("Si desea continuar ingresando un valor, presione 1. Sino, cualquier otro número: ");
            next = scan.nextInt();
        }

        scan.close();
    }
}
