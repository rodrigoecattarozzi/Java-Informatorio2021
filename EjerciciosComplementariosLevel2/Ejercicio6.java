package EjerciciosComplementariosLevel2;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Boolean option = false;
        Set<Worker> empSet = new HashSet<Worker>();

        while (option == false){
            empSet.add(loadWorker(scan));
            System.out.print("¿Desea ingresar otro empleado?\n1- Sí\n0- No\nOpción: ");
            int opt = scan.nextInt();
            if (opt == 0){
                option = true;
            }
        }

        Map<Integer, Integer> workerMap =  new HashMap<Integer, Integer>();
        for (Worker worker: empSet){
            workerMap.put(worker.getDni(), (worker.getValue()*worker.getHours()));
        }
        for (Map.Entry<Integer, Integer> worker: workerMap.entrySet()){
            System.out.println("Empleado: " + worker.getKey() + " - Sueldo: " + worker.getValue());
        }

        scan.close();
    }

    public static Worker loadWorker(Scanner scan){
        Worker worker = new Worker();
        System.out.print("Ingrese DNI: ");
        worker.setDni(scan.nextInt());
        System.out.print("Ingrese Nombre: ");
        scan.nextLine();
        worker.setName(scan.nextLine());
        System.out.print("Ingrese cantidad de horas trabajadas: ");
        worker.setHours(scan.nextInt());
        System.out.print("Ingrese valor por hora: ");
        worker.setValue(scan.nextInt());

        return worker;
    }
}
