package EjerciciosGuiados_Level1y2;
import java.util.*;

;public class Ejercicio2 {
    public static void main (String[] arngs){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("El primer número ingresado es " + a);
        System.out.println("El segundo número ingresado es " + b);
        System.out.println("El tercer número ingresado es " + c);
        scan.close();
    }
}
