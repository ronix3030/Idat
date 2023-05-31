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
public class Swich {
     public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
         int dia ;
         String nomDia;
         
         
         System.out.println("Ingrese numero del dia del 1 al 7");
         dia =entrada.nextInt();
         
         
         switch(dia){
             case 1 :nomDia="Lunes";
             break;
             case 2 :nomDia="Martes";
              break;
             case 3 :nomDia="Martes";
              break;
             case 4 :nomDia="Martes";
              break;
             case 5 :nomDia="Martes";
              break;
             case 6 :nomDia="Martes";
              break;
             case 7 :nomDia="Doming";
             break;
             default:nomDia="Numero Invalido";
         }
         
         System.out.println("El dia seleccionado es "+ nomDia);
         
     }
    
}
