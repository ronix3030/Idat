/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;
import java.util.Scanner;
/**
 *. Desarrollar una aplicación que solicite un número y muestre el doble de ese número.
 * @author ronald
 */
public class Ejercicio2 {
     public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
         
         double num1,res;
      
         System.out.println("INGRESE UN NUMERO ");
         num1=entrada.nextInt();
         res=num1*2;
         System.out.println("El doble del NUMERO INGRESADO ES: "+res);
         
         
         
     }
    
    
}
