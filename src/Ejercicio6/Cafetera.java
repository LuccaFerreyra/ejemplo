
package ejercicio6;


public class Cafetera {
   private int CantidadMax;
   private int CantidadActual;
   
   public Cafetera(){
   }
   public Cafetera( int CantidadMax , int CantidadActual){
  this.CantidadMax = CantidadMax;
  this.CantidadActual = CantidadActual;
   
   } 

    public int getCantidadMax() {
        return CantidadMax;
    }

    public void setCantidadMax(int CantidadMax) {
        this.CantidadMax = CantidadMax;
    }

    public int getCantidadActual() {
        return CantidadActual;
    }

    public void setCantidadActual(int CantidadActual) {
        this.CantidadActual = CantidadActual;
    }
  
    
}
