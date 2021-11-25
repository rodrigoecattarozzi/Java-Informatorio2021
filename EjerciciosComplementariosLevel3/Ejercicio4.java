package EjerciciosComplementariosLevel3;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main (String[] args){
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5);   
        List<Integer> newNumbers = numbers.stream()
            .map(num -> factorial(num))
            .distinct()
            .collect(Collectors.toList());
        System.out.println(newNumbers);
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
