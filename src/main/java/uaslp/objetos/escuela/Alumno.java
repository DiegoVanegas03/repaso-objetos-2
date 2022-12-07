package uaslp.objetos.escuela;

import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anio;
    private LocalDate fechaNacimiento;

    public static AlumnoBuilder builder(){
        return new AlumnoBuilder();
    }

    public Alumno(String nombre, String clave, String claveDeCarrera, int anio, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.clave = clave;
        this.claveDeCarrera = claveDeCarrera;
        this.anio = anio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
