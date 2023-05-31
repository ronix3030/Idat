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
public class Ejercicio17 {
     public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int n1,n2,n3;
         System.out.println("Ingrese 1 lado de triangulo");
         n1=entrada.nextInt();
         System.out.println("Ingrese 2do lado de triangulo");
         n2=entrada.nextInt();
         System.out.println("Ingrese 3er lado de triangulo");
         n3=entrada.nextInt();
        
         if (n1==n2 && n2==n3 && n3==n1) {
             System.out.println("Tres lados iguales  es Equilatero");
             
         }
         else if (n1==n2 && n3==n1) {
             System.out.println("Dos lados iguales  es Isosceles");
             
         }
         else{
             System.out.println("Ningun lado es igual  es Escaleno");
         }
        
        
        
     }
    
}
