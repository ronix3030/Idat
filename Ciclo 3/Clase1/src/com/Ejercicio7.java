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
public class Ejercicio7 {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
         
         int num1,num2;
         double area,peri;
      
         System.out.println("Ingrese la base ");
         num1=entrada.nextInt();
         
         System.out.println("Ingrese la altura");
         num2=entrada.nextInt();
         
         area=(num1*num2);
         peri=(num1+num2)*2;
         
         System.out.println("Su area de rectangulo es "+area+" y su perimetro es "+peri);
         
         
         
         
         
         
    
}
}
