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
public class Ejercicio9 {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
    
         String nom;
         int not1,not2,not3,not4;
   double promedio;      
         System.out.println("Ingrese su Nombre y apellido");
    nom =entrada.nextLine();
   
        System.out.println("Ingrese su 1era nota");
        not1=entrada.nextInt();
        System.out.println("Ingrese su 2da nota");
        not2=entrada.nextInt();
        System.out.println("Ingrese su 3er nota");
        not3=entrada.nextInt();
        System.out.println("Ingrese su 4ta nota");
        not4=entrada.nextInt();
        
        promedio=(not1*0.04)+(not2*0.12)+(not3*0.24)+(not4*0.60);
        
        if (promedio>12){
            System.out.println("Usted " + nom+" aprobo con nota :"+promedio);
        
    }
        else{
            System.out.println("Usted " +nom +" desaprobo con nota : "+  promedio);
        }
        
    
    
    
    }
    
    
}
