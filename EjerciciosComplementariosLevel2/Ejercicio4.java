package EjerciciosComplementariosLevel2;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
    ArrayList<String> students = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);

    for(int i=0; i<=11;i++){
        System.out.print("Nombre del alumno: ");
         String student = scan.nextLine();
         students.add(student);
     }

    ArrayList<String> courseOne = new ArrayList<String>(students.subList(0, 4));
    ArrayList<String> courseTwo = new ArrayList<String>(students.subList(4, 8));
    ArrayList<String> CourseThree = new ArrayList<String>(students.subList(8, 12));
    mostrarCurso(courseOne,"A");
    mostrarCurso(courseTwo,"B");
    mostrarCurso(CourseThree,"C");
    
    scan.close();
}

public static void mostrarCurso(ArrayList<String> course, String division){
    System.out.println("Lista de alumnos de la división: " + division);
    for (String student: course){
        System.out.println(student);   
    } 
}
} 