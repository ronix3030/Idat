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
public class Ejercicio13 {
     public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
     
     int num1,num2;
     
     double suma,res,multi,divi;
     
         System.out.println("Ingrese numero 1 ");
         num1=entrada.nextInt();
         System.out.println("Ingrese numero 2");
         num2=entrada.nextInt();
         
         suma=num1+num2;
         res=num1-num2;
         multi=num1*num2;
   
         System.out.println("La suma es: "+suma);
         System.out.println("La resta es: "+res);
         System.out.println("La multiplicacion  es: "+multi);
         
     if(num1>=num2){
         divi=num1/num2;
         System.out.println("La division es: "+divi);
     }
     else {
         System.out.println("No se puede procesar la division");
     }
     
     
     }
    
}
