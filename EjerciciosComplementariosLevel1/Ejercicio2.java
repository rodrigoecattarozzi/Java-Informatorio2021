package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("SUMA - RESTA - MULTIPLICACIÓN - DIVISIÓN");
        System.out.print("Ingrese el primer valor: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int b = scan.nextInt();
        System.out.println("");
        System.out.println("SUMA: " + add(a, b));
        System.out.println("RESTA: " + subs(a, b));
        System.out.println("MULTIPLICACIÓN: " + mult(a, b));
        System.out.println("DIVISIÓN: " + div(a, b));
        System.out.println("MÓDULO: " + mod(a, b));
        scan.close();

    }

    public static int add(int a, int b){
        return (a + b);
    }
    
    public static int subs(int a, int b){
        return (a - b);
    }
    
    public static int mult(int a, int b){
        return (a * b);
    }
    
    public static int div(int a, int b){
        return (a / b);
    }
    
    public static int mod(int a, int b){
        return (a % b);
    }

}


