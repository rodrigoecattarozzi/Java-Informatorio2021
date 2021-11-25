package EjerciciosComplementariosLevel3;
import java.time.LocalDate;

public class Alumno {
    String nombre, apellido;
    LocalDate fechaDeNacimiento;

    public void setData(String nombre, String apellido, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = LocalDate.parse(fechaDeNacimiento);
    }
}
