/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;

/**
 *
 * @author ronald
 */
public class Ejercicio4 {
     public static void main(String[] args) {
         
         metodoEstatico();
         ClasePadre CP=new ClasePadre();
         CP.metodoFinal();
         
     }


     static void metodoEstatico()
{
         System.out.println("Metodo Estatico");
     
      
}
}
     
class ClasePadre{
         final void metodoFinal(){
             System.out.println("Metodo Final");
         }
         
         
}
     

    

