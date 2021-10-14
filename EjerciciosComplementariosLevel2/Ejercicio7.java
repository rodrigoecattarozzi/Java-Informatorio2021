package EjerciciosComplementariosLevel2;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el valor Inicial: ");
        Integer base = scan.nextInt();
        System.out.print("Ingrese el valor Final: ");
        Integer top = scan.nextInt();
        scan.close();

        if (base < top){
            ArrayList<String> output = new ArrayList<String>();
            output = functionFizzBuzz(base, top);
            System.out.println(output);
        }
        else{
            System.out.print("El primer valor (" + base + ") es mayor o igual al segundo ("+ top + ")");
        }
    }

    public static ArrayList<String> functionFizzBuzz  (Integer base, Integer top){
        ArrayList<String> output = new ArrayList<String>();
        for (int i=base;i<top;i++){
             if(i % 2 == 0 && i % 3 ==0){
                output.add("FizzBuzz");
            }
            else if(i % 2 == 0){
                output.add("Fizz");
            }
            else if(i % 3 == 0){
                output.add("Buzz");
            }
            else {
                output.add(String.valueOf(i));
            }
        }
        return output;
    }
}
