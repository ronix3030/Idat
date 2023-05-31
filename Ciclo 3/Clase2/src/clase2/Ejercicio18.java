/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author ronald
 */
public class Ejercicio18 {
     public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
     int n1,n2,n3;
     int acu,rec,ob;
         System.out.println("Ingrese 3 angulos de un triangulo");
         System.out.println("Ingrese 1er angulo");
         n1=entrada.nextInt();
         System.out.println("Ingrese 2do angulo");
            n2=entrada.nextInt();
         System.out.println("Ingrese 3er angulo");
            n3=entrada.nextInt();
            
          
          if(n1<90 && n2<90 && n3<90){
               System.out.println("Su triangulo es Acutangulo");
           }// Si todos sus ángulos son agudos, o sea, miden menos de 90
           else if (n1==90){
               System.out.println("Su triangulo es Rectangulo");               
           } // Es aquel que tiene un ángulo interior que es recto, es decir, mide 90.
           else if (n1>90 ){
               System.out.println("Su triangulo es Obtusangulo");
           }
           //  Los triángulos con ángulos obtusos se llaman triángulos obtusángulos.
           //Esto quiere decir que un ángulo de triángulo mide más de  90
           else{
               System.out.println("tiene que sumar 180");
           }
        
        
        
        
        
     
     
     }
    
}
