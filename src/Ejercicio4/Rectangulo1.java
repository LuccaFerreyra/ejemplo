
package ejercicio4;

public class Rectangulo1 {

    
    public static void main(String[] args) {
        Rectangulo rec1 = ServicioRectangulo.crearRectangulo();
        System.out.println("Superficie del rectangulo:" + rec1.calcularSuperficie());
        System.out.println("Perimetro del rectangulo:" + rec1.calcularPerimetro());
        rec1.dibujarRectangulo();
    }
    
}
