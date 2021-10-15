
package ejercicio5;


public class Cuenta {
private int numeroCuenta;
private int dni;
private int SaldoActual;

public Cuenta(){
}

public Cuenta(int numeroCuenta, int dni , int SaldoActual){
this.numeroCuenta=numeroCuenta;
this.dni=dni;
this.SaldoActual=SaldoActual;

}

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }
    
    public void consultarSaldo(){
        System.out.println("[SALDO ACTUAL DE LA CUENTA]");
        System.out.println("Su saldo es: $" + getSaldoActual());
    }
public void consultarDatos(){
    System.out.println("[DATOS DE LA CUENTA]");
    System.out.println("Su numero de cuenta es: " + getNumeroCuenta());
    System.out.println("Su DNI es:" + getDni());
    System.out.println("El total en el saldo de su cuenta es: $" + getSaldoActual());
    

}
    
    
    
}
