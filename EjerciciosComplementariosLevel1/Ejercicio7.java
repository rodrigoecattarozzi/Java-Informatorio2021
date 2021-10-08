package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Por favor, ingrese una palabra en minúsculas: ");
        String word = scan.nextLine();
        char[] charArray = word.toCharArray();
        
        for (int i = 0; i < word.length(); i++){
            charArray[i] &= 0x5f;
        }

        word = String.valueOf(charArray);
                
        System.out.println(word);
        scan.close();
    }
}
