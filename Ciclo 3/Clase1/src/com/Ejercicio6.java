/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import java.util.Scanner;

/**
 *Desarrollar una aplicación que permita ingresar una cantidad de dinero en dólares y 
 * el tipo de cambio y muestre como resultado la cantidad de dinero convertida a soles.
 * @author ronald
 */
public class Ejercicio6 {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
    double num1,num2,pro;
         
         
         
         
         System.out.println("INGRESE SU CANTIDAD EN DOLARES");
         num1=entrada.nextInt();
         
         pro=num1*3.92;
         
         System.out.println("SU CANTIDAD EN SOLES  es : " + pro);
         
         
    }
    
}
