package Ejercicio13;


import java.util.Scanner;

public class Tiempo {

    Scanner leer = new Scanner(System.in);

    void DameHora() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void MostrarHora(TipoHorario tipoHorario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    enum TipoHorario {

        H24, H12
    };

    private int Hora, Minutos, Segundo;

    public Tiempo() {
     
    }

    public Tiempo(int Hora, int Minutos, int Segundo)  throws Exception{
        this.Hora = Hora;
        this.Minutos = Minutos;
        this.Segundo = Segundo;
    
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    public int getMinutos() {
        return Minutos;
    }

    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    public int getSegundo() {
        return Segundo;
    }

    public void setSegundo(int Segundo) {
        this.Segundo = Segundo;
    }

    
}
