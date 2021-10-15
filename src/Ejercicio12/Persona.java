package ejercicio12;

import java.time.LocalDate;

public class Persona {

    private String Nombre;
    private String Apellido;
    private LocalDate FechaDeNacimiento;

    public Persona() {

        FechaDeNacimiento = LocalDate.now();
    }

    public Persona(String Nombre, String Apellido, LocalDate FechaDeNacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FechaDeNacimiento = FechaDeNacimiento;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "[ Persona ] \nNombre = " + Nombre + " \nApellido = " + Apellido + " \nFecha De Nacimiento = "
                + FechaDeNacimiento;
    }

}
