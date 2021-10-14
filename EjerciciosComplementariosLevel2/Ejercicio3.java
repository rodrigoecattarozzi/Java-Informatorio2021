package EjerciciosComplementariosLevel2;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<String>();

        for (int i=1; i<=10; i++){
            cards.add(i+"♧");
        }
        for (int i=1; i<=10; i++){
            cards.add(i+"♢");
        }
        for (int i=1; i<=10; i++){
            cards.add(i+"♡");
        }
        for (int i=1; i<=10; i++){
            cards.add(i+"♤");
        }

        System.out.println("Baraja en orden creciente: ");
        System.out.println(cards);
        System.out.println("Baraja en orden decreciente: ");
        Collections.reverse(cards);
        System.out.println(cards);
        System.out.println("Baraja mezclada ");
        Collections.shuffle(cards);
        System.out.println(cards);
    }
}
