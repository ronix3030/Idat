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
public class Metodos {
    
 
      public static void main(String[] args){
            Scanner entrada=new Scanner(System.in);
          int num1;
          int num,num2;
          
          mostrarEdad();
          mostrarResultado(4, 4);
          mostrarResultado(5, 5, 2);
          System.out.println("Ingrese un numero");
          num1=entrada.nextInt();
          
          switch (num1) {
              case 1:
                   System.out.println("Ingrese 1er numero");
                   num=entrada.nextInt();
                     System.out.println("Ingrese 2d numero");
                     num2=entrada.nextInt();
                  Suma(num, num2);
                  break;
              default:
                  throw new AssertionError();
          }
           
      }
          

          static void Suma(int a,int b){
             int resul;
             resul=a+b;
              System.out.println("La suma es "+ resul);   
}
          static void mostrarEdad(){
              System.out.println("Mi edad es 15 años");
 }
          static void mostrarNom(){
              System.out.println("Mi nombre es Ronald");
              
          }
          static void mostrarResultado(int a,int b){
              int resul;
              resul=a+b;
              
              System.out.println("El resultado es A+B: "+resul);
          }
          
          static void mostrarResultado(int a, int b,int c){
              int resul;
              resul=a+b/c;
              System.out.println("La suma de A+B /2 es: "+resul);
          }
          
          
      }

