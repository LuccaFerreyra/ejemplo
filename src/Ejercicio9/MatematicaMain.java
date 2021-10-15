
package ejercicio9;


public class MatematicaMain {

  
    public static void main(String[] args) {
        Matematica Mate1 = new Matematica();
    int NumeroMin = 5 ;
    int NumeroMax = 30;
    Mate1.setNumero1(Math.random()*(NumeroMin - NumeroMax)+NumeroMax );
    Mate1.setNumero2(Math.random()*(NumeroMin - NumeroMax) + NumeroMax);
     
        System.out.println("Valor asignado a Numero1:[" + Mate1.getNumero1() + " ]");
        System.out.println("Valor asignado a Numero2:[" + Mate1.getNumero2() + " ]");
    
        Mate1.DevolverMayor();
        Mate1.CalcularPotencia();
        Mate1.CalcularRaiz();
        
    }
    
}
