/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;
import java.util.Scanner;
/**
 *
 * @author ronald
 */
public class Hola {
     public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
         String nombre;
         String apellido;
         int num1,num2,num3,num4;
         double promedio,igb,total;
         
         System.out.println("Ingrese su nombre");
         nombre=entrada.next();
         System.out.println("Ingrese su Apellido");
         apellido=entrada.next();
         System.out.println("Ingrese cantidad de su Producto");
         num1=entrada.nextInt();
         
         System.out.println("Señor :"+nombre+apellido);
         System.out.println("Su subtotal es "+num1);
               igb=(num1*0.18);
               total=(num1+igb);
         System.out.println("Su IGB de 18% es "+igb);
         System.out.println("Su total es "+total);
      
         
         
         
         
         
         
         
         
     }
         
    
}
