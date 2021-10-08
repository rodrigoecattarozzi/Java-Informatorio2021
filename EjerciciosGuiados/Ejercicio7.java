package EjerciciosGuiados;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int next = 1;
        int option;
        
        while (next == 1){
            System.out.println("Opción 1: ingresar 3 números y mostrarlos por pantalla.");
            System.out.println("Opción 2: evaluar una nota.");
            System.out.println("Opción 3: conocer día de la semana.");
            option = scan.nextInt();
            switch (option){
                case 1: 
                    int a = scan.nextInt();
                    int b = scan.nextInt();
                    int c = scan.nextInt();
                    Ejercicio2(a, b, c);
                    break;
                case 2:
                    System.out.println("Ingrese la nota a evaluar: ");
                    int cal = scan.nextInt();
                    Ejercicio3(cal);
                    break;
                case 3:
                    System.out.print("Ingrese el día de la semana: ");
                    int day = scan.nextInt();
                    Ejercicio4(day);
                    break;
            }
            System.out.println("Si desea continuar ingresando un valor, presione 1. Sino, cualquier otro número: ");
            next = scan.nextInt();
        }
        scan.close();
    }

    public static void Ejercicio2(int a, int b, int c){
   
        System.out.println("El primer número ingresado es " + a);
        System.out.println("El segundo número ingresado es " + b);
        System.out.println("El tercer número ingresado es " + c);

    }
    
    public static void Ejercicio3(int cal){
             
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
    
    }
    
    public static void Ejercicio4(int day){
                
        switch (day){
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
    
    }
}


