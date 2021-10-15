/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author TecnoSET
 */
class ServiciosOperaciones {
    private Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        System.out.println("Ingrese numero 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese numero 2");
        int num2 = leer.nextInt();
        return new Operacion(num1 , num2);
    }
    
    public int sumar(int num1 , int num2){
    int suma = num1 + num2;
    return suma;
    
    }
    public int restar(int num1 , int num2){
    int restar = num1 - num2;
    return restar;
    
    }
    
    public int multiplicar(int num1 , int num2){
    int multiplicacion = 0;
    if (num1!= 0 || num2!=0){
    
    }else{
            System.out.println("No se puede multiplicar por CERO");
            }
    return multiplicacion;
    
    }
   public double dividir(int num1 , int num2){
   double division = 0;
   if(num1!=0 || num2!=0){
   }else{
       System.out.println("No se puede divir por CERO");
   
   }
   return division;
   }
}
