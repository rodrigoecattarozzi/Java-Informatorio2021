package EjerciciosComplementariosLevel2;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scan  = new Scanner(System.in);

        for (int i=1; i<=5;i++){
            System.out.print("Ingrese un número: ");
            int num = scan.nextInt();
            numbers.add(num);
        }
        int size = numbers.size();
        System.out.print("Números ingresados: ");
        System.out.println(numbers);
       
        System.out.print("Ingrese un número para agregar al inicio: ");
        int numI = scan.nextInt();
        numbers.add(0,numI);
        System.out.println(numbers);
        System.out.print("Ingrese un número para agregar al final: ");
        int numF = scan.nextInt();
        numbers.add(numF);
        System.out.println(numbers);
        for (Integer number: numbers){
            System.out.print(number + " ");
        }
        System.out.println(" ");
        System.out.println("El tamaño de la lista antes de cargar números era: " + size);
        System.out.println("El tamaño de la lista luego de cargar números es:  " + numbers.size());
        
        scan.close();
      
    }  

    
}
