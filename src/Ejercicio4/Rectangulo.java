
package ejercicio4;


public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
        super();
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calcularSuperficie() {
        int superficie = base * altura;
        return superficie;
    }

    public int calcularPerimetro() {
        int perimetro = (base + altura) * 2;
        return perimetro;
    }

    public void dibujarRectangulo() {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {
                if ((i > 1 || i < altura) && (j > 1 && j < base)) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
