package ejercicio5;

import java.util.Scanner;

public class ServiciosCuenta {

    private Scanner leer = new Scanner(System.in);
    Cuenta nuevaCuenta = new Cuenta();

    public Cuenta crearCuenta() {
        System.out.println("Ingrese numero de cuenta:");
        int numCuenta = leer.nextInt();
        System.out.println("Ingrese DNI:");
        int dni = leer.nextInt();
        System.out.println("Ingrese el saldo actual:");
        int saldo = leer.nextInt();
        nuevaCuenta.setNumeroCuenta(numCuenta);
        nuevaCuenta.setDni(dni);
        nuevaCuenta.setSaldoActual(saldo);
        return nuevaCuenta;

    }

    public void ingresarDinero(double ingreso) {
        int saldo = nuevaCuenta.getSaldoActual();
        saldo += ingreso;
        nuevaCuenta.setSaldoActual(saldo);
    }

    public void retirDinero(double retiro) {
        int saldo = nuevaCuenta.getSaldoActual();
        if (retiro <= saldo) {
            saldo -= retiro;
            nuevaCuenta.setSaldoActual(saldo);
            System.out.println("USTED HA RETIRADO: $ " + retiro + " de su cuenta, saldo actual");
        } else {
            System.out.println("[ERROR] IMPOSIBLE REALIZAR EL RETIRO, FONDOS INSUFICIENTES.Saldo actual: $" + nuevaCuenta.getSaldoActual());
        }

    }

    public void extraccionRapida() {
        int saldo = nuevaCuenta.getSaldoActual();
        double extraccion = saldo * 0.2; //es el 20%

        if (extraccion < saldo || saldo > 0) {
            saldo -= extraccion;
            nuevaCuenta.setSaldoActual(saldo);
            System.out.println("USTED HA RETIRADO EL 20% DE SUELDO:$" + extraccion + ",saldo actual:$" + nuevaCuenta.getSaldoActual());

        }else{
        
            System.out.println("[ERROR] NO SE PUEDO REALIZAR LA EXTRACCION DE DINERO:" );
            
        }
    }
}
