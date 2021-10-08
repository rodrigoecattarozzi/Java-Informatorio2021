package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean value = false;
        System.out.print("Ingrese el primer valor: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int b = scan.nextInt();
        int mult = 0;

        while (value == false){
            if ((a <= 0) || (b <= 0)){
                System.out.println("ERROR: ambos valores deben ser enteros positivos.");
                System.out.print("Ingrese el primer valor: ");
                a = scan.nextInt();
                System.out.print("Ingrese el segundo valor: ");
                b = scan.nextInt();
            }
            else{
                value = true;
            }
        }

        for (int i = 1; i <= b; i++){
            mult = mult + a;
        }
        
        System.out.println(+ a + " * " + b + " = " + mult);
        scan.close();
    }
}
