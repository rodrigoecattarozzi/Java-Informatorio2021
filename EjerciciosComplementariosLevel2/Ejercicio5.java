package EjerciciosComplementariosLevel2;
import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[]args){
        ArrayList<Integer> workedHours = new ArrayList<Integer>();
        ArrayList<Integer> hourlyPay = new ArrayList<Integer>();
        ArrayList<Integer> totals = new ArrayList<Integer>();
        loadHourlyPay(hourlyPay);
        loadWorkedHours(workedHours);

        System.out.print("Pago por hora trabajada: ");
        System.out.println(hourlyPay);
        System.out.print("Horas trabajadas en la semana: ");
        System.out.println(workedHours); 
        
        int total=0;
        for (int i=0;i<5;i++){
            int subtotal= workedHours.get(i)*hourlyPay.get(i);
            totals.add(subtotal);
            total=total+subtotal;
        }  
        System.out.print("Pagos por día: ");   
        System.out.println(totals);
        System.out.println("Pago total: "+ "$ " + total);
    }

    public static ArrayList<Integer> loadWorkedHours(ArrayList<Integer> workedHours){
        workedHours.add(6);
        workedHours.add(7);
        workedHours.add(8);
        workedHours.add(4);
        workedHours.add(5);
        return workedHours;
    }

    public static ArrayList<Integer> loadHourlyPay(ArrayList<Integer> hourlyPay){
        hourlyPay.add(350);
        hourlyPay.add(345);
        hourlyPay.add(550);
        hourlyPay.add(600);
        hourlyPay.add(320);
        return hourlyPay; 
    }
    
}
