
package ejercicio12;

public class PersonaMain {
  public static void main(String[]args){
  ServicioPersona s = new ServicioPersona();
  
  Persona p1 = s.CrearPersona();
  Persona p2 = s.CrearPersona();
  s.MostrarPersona(p1);
  s.MostrarPersona(p2);
  
      System.out.println("\n" + p1.getNombre() + "tine" + s.CalcularEdad(p1) + " años" );
      System.out.println("\n" + p2.getNombre() + "tine" + s.CalcularEdad(p2) + "años");
      
      System.out.println();
      
      if(s.MenorQue(p1, s.CalcularEdad(p2)) == true){
          System.out.println(p1.getNombre() + " es menor que " + p2.getNombre());
     
      }else{
          System.out.println(p2.getNombre() + "es menor que " + p1.getNombre());
      
      }
  
   }
}
