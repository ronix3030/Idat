/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;

/**
 *
 * @author ronald
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        saludarPrivado();
        saludarPublico();
        saludarProtejido();
        saludarPredeterminado();
        //METODOS DE OTRA CLASE
        claseSaludar cS= new claseSaludar();
        cS.saludarPublico();
        cS.saludarProtejido();
        cS.saludarPredeterminado();
        cS.otroSaludo();}
    private static void saludarPrivado(){
        System.out.println("Hola Privado(misma clase");}
    private static void saludarPublico(){
        System.out.println("Hola Publico (misma clase");}
    private static void saludarProtejido(){
        System.out.println("Hola Protejido(misma clase");}
    private static void saludarPredeterminado(){
        System.out.println("Hola Predetermina (misma clase");}
    
}
    class claseSaludar{
        public void saludarPublico(){
            System.out.println("Hola publico(otra clase)");}
              
         public void saludarPrivado(){
            System.out.println("Hola publico(otra clase)");}
        
         public void saludarProtejido(){
            System.out.println("Hola publico(otra clase)");}
        
         public void saludarPredeterminado(){
            System.out.println("Hola publico(otra clase)");}
         
         public void otroSaludo(){
         saludarPrivado();
         
         }             
        
    }
        
        
        
        
        
  
    

