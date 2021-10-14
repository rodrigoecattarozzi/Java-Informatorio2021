package EjerciciosComplementariosLevel2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        List<String> cities = new ArrayList<String>();
        loadCities(cities);
        scan.close();   

        Integer count=1;
        for (String city: cities) {
            System.out.println("#" + count + " " + city);
            count=count+1;
        }

    }
    public static void loadCities(List<String> cities){
        cities.add("El Chaltén");
        cities.add("Córdoba");
        cities.add("Pto. Iguazú");
    }
   
}
