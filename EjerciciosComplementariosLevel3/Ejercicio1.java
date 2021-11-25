package EjerciciosComplementariosLevel3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Ejercicio1 {
    public static void main (String[] args){
        List<String> words = new ArrayList<>();
            words.add("Hola");
            words.add(null);
            words.add("Informatorio");
            words.add("");    

        ArrayList<String> newWords = words.stream()
            .filter(word -> word != null && word != "")
            .collect(Collectors
            .toCollection(ArrayList::new));

        System.out.println(newWords);
    }
}
