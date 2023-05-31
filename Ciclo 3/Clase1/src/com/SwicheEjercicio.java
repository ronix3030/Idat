/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;
import java.util.Scanner;
/**
 *

 * La asignación familiar por hijo de un trabajador es la siguiente:

Si no tiene hijos no le corresponde asignación familiar
Si tiene un hijo le corresponde 50 soles
Si tiene dos hijos le corresponde 75 soles por sus dos hijos
Y si tiene más de dos hijos le corresponde 100 soles
 */
public class SwicheEjercicio {
     public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
         String nom;
         int hijos,asig;
         
         
         System.out.println("Ingrese su Nombre");
         nom=entrada.nextLine();
         
         System.out.println("Ingrese el numero de Hijos");
         hijos=entrada.nextInt();
         
         switch (hijos) {
              case 0:asig =0;
               System.out.println("El señor@ "+nom+" Recibe\n "+asig);
                
             case 1:asig =50;
             System.out.println("El señor@ "+nom+" Recibe\n "+asig);
                 
                 case 2:asig =75;
                 System.out.println("El señor@ "+nom+" Recibe\n "+asig);
                 
                 case 3:asig =100;
                 System.out.println("El señor@ "+nom+" Recibe\n "+asig);
                
                     
                 break;
             default:
                 throw new AssertionError();
                 
                 
         }
                 
         }
         
         
         
     }

    
