package EjerciciosComplementariosLevel1;
import java.util.Scanner;


public class Ejercicio8 {
    public static void main (String[] args){
        String name, city, dir;
        int age;
        Person person = new Person();
        Scanner scan = new Scanner(System.in);
        System.out.print("Por favor, ingrese su nombre: ");
        name = scan.nextLine();
        System.out.print("Por favor, ingrese su ciudad: ");
        city = scan.nextLine();
        System.out.print("Por favor, ingrese su dirección: ");
        dir = scan.nextLine();
        System.out.print("Por favor, ingrese su edad: ");
        age = scan.nextInt();

        person.setName(name);
        person.setCity(city);
        person.setDir(dir);
        person.setAge(age);

        System.out.println(
            person.getCity() + " - " + 
            person.getDir() + " - " + 
            person.getAge() + " - " + 
            person.getName());
        
        scan.close();
    }

}
