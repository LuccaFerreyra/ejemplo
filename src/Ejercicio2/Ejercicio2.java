
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
  private double Radio;
  private double Area = 0.0;
  private double Longitud = 0.0;
  
  
  public Ejercicio2(double Radio){
  this.Radio=Radio;
  }

 public Ejercicio2(){
 }
    
  

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
  
  
  
    public  void  crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Radio de la circunferencia");
        double Circunferencia = leer.nextDouble();
        this.Radio = Circunferencia;
        
        
        
        }
    public void Area(){
     double Area = (Math.PI*(Math.pow(this.Radio,2)));
     this.Area = Area;
       
        
    }
    
    public void Longitud(){
    double Longitud = ((2*(Math.PI*this.Radio)));
    this.Longitud=Longitud;
       
    }
    
    public void MostrarDatos(){
        System.out.println("El Radio de la circunferencia es:" + Radio);
        System.out.println("El Area de la circunferencia es:" + Area);
        System.out.println("La Longitud de la circunferencia es:" + Longitud);
    }
   
}
        

        
        
    
    

