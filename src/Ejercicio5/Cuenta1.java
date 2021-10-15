
package ejercicio5;

public class Cuenta1 {

    public static void main(String[] args) {
        ServiciosCuenta servicio = new ServiciosCuenta();
        
        Cuenta cuenta1 = servicio.crearCuenta();
        cuenta1.consultarDatos();
        cuenta1.consultarSaldo();
        servicio.ingresarDinero(5000);
        servicio.retirDinero(3000);
        servicio.extraccionRapida();
        
        
    }
    
}
