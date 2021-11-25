package EjerciciosComplementariosLevel3;
import java.util.List;

public class Ejercicio3 {
    public static void main (String[] args){
        List<String> words = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

        Long wordCounter = words.stream()
            .filter(word -> startsWithIgnoreCase(word, "b"))
            .count();
        System.out.println(wordCounter);
    }

    public static boolean startsWithIgnoreCase(String word, String letter){
        return word.regionMatches(true, 0, letter, 0, 1);
    }
}


