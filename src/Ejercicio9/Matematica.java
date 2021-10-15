package ejercicio9;

public class Matematica {

    private double Numero1;
    private double Numero2;

    public Matematica() {

    }

    public Matematica(double Numero1, double Numero2) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
    }

    public double getNumero1() {
        return Numero1;
    }

    public void setNumero1(double Numero1) {
        this.Numero1 = Numero1;
    }

    public double getNumero2() {
        return Numero2;
    }

    public void setNumero2(double Numero2) {
        this.Numero2 = Numero2;
    }

    public void DevolverMayor() {
        this.Numero1 = Math.round(Numero1);
        this.Numero2 = Math.round(Numero2);

        if (this.Numero1 > this.Numero2) {
            System.out.println("El nuemro mayor es el Numero 1= [" + Numero1 + "]");

        } else if (this.Numero2 > this.Numero1) {

            System.out.println("El numero mayor es el Numero 2 = [" + Numero2 + "]");

        } else {
            System.out.println("Los numeros son iguales");
        }

    }

    public void CalcularPotencia() {
        double potencia = 0;
        this.Numero1 = Math.round(Numero1);
        this.Numero2 = Math.round(Numero2);

        if (this.Numero1 > this.Numero2) {
            potencia = Math.pow(Numero1, Numero2);
            System.out.println("La potencia del numero mayor es: [" + potencia + "]");
        } else if (this.Numero2 > this.Numero1) {
            potencia = Math.pow(Numero2, Numero1);
            System.out.println("La potencia del numero mayor es:[" + potencia + "]");
        } else {
            System.out.println("[ERROR] No se calculo la potencia");
        }
    }

    public void CalcularRaiz() {
        double raiz = 0;

        this.Numero1 = Math.abs(Numero1);
        this.Numero2 = Math.abs(Numero2);

        if (this.Numero1 < this.Numero2) {
            raiz = Math.sqrt(Numero1);
            System.out.println("La raiz cuadrada de [" + Numero1 + "] es [" + raiz + "]");

        } else if (this.Numero2 < Numero1) {
            raiz = Math.sqrt(Numero2);
            System.out.println("La raiz cuadrada de [" + Numero1 + "] es [" + raiz + "]");
        } else {
            System.out.println("[ERROR] No se pudo calcular la raiz");

        }
    }

}
