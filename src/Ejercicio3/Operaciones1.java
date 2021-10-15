package ejercicio3;

public class Operaciones1 {

    public static void main(String[] args) {
        ServiciosOperaciones servicio = new ServiciosOperaciones();
        Operacion nuevaOperacion = servicio.crearOperacion();
        System.out.println("El resultado de la suma es:" + servicio.sumar(nuevaOperacion.getNumero1(), nuevaOperacion.getNumero2()));
        System.out.println("El resultado de la restar es:" + servicio.restar(nuevaOperacion.getNumero1(), nuevaOperacion.getNumero2()));
        System.out.println("El resultado de la multiplicacion es:" + servicio.multiplicar(nuevaOperacion.getNumero1(), nuevaOperacion.getNumero2()));
        System.out.println("El resultado de la Division es:" + servicio.dividir(nuevaOperacion.getNumero1(), nuevaOperacion.getNumero2()));

    }

}
