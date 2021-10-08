package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean value = false;
        System.out.print("Ingrese un valor: ");
        int num = scan.nextInt();
        while (value == false){
            if (num < 0){
                System.out.print("Un número negativo no tiene factorial. Ingrese otro valor: ");
                num = scan.nextInt();
            }
            else{
                value = true;
            }
        }
        System.out.println("El factorial de " + num + " es: " + factorial(num));
        scan.close();
    }

    public static int factorial(int num){
        if (num == 0){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
}

