/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;
import java.util.Scanner;
/**
 *Desarrollar una aplicación que solicite su nombre y edad y
 * muestre el mensaje ?[nombre] tiene [edad] años?
 * @author ronald
 */
public class Ejercicio3 {
        public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
         
         String nom,ape;
         
         int edad;
         
            System.out.println("Ingrese su nombre");
            nom=entrada.nextLine();
            System.out.println("Ingrese su EDAD ");
            edad=entrada.nextInt();
            
            
            System.out.println("El usuario: " +nom + " tiene la edad: "+ edad);
           
            
         
         
         
         
         
         
         
         
         
         
         
         
        }
    
}
