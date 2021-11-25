package EjerciciosComplementariosLevel3;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.Period;

public class Ejercicio5 {
    public static void main (String[] args){
        List<Alumno> listaAlumnos = cargarLista();
        Map<String,Integer> mapAlumnos = listaAlumnos.stream()
            .collect(Collectors.toMap(alumno -> alumno.nombre + alumno.apellido, 
                alumno -> Period.between(alumno.fechaDeNacimiento, LocalDate.now())
                .getYears()));
        System.out.println(mapAlumnos);
    }

    public static List<Alumno> cargarLista(){
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        Alumno alumno4 = new Alumno();
        Alumno alumno5 = new Alumno();
        alumno1.setData("Juan", "Pérez", "1990-10-05");
        alumno2.setData("Pedro", "López", "1992-12-18");
        alumno3.setData("Luis", "Gómez", "1995-05-31");
        alumno4.setData("Paula", "Morales", "1994-02-24");
        alumno5.setData("Romina", "Cardozo", "1997-09-27");
        List<Alumno> listaAlumnos = List.of(alumno1, alumno2, alumno3, alumno4, alumno5);

        return listaAlumnos;
    }
}

