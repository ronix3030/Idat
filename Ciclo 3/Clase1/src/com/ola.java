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
public class ola {
      public static void main(String[] args) {
    String nombre,apellido;
        int not1,not2,not3,not4;
        double promedio;
        Scanner entrada=new Scanner(System.in);
        
       System.out.println("Ingrese su nombre");
       nombre=entrada.nextLine();
              System.out.println("Ingrese su Apellido");
              apellido=entrada.nextLine();
              System.out.println("Ingrese su 1era nota");
              not1=entrada.nextInt();
              System.out.println("Ingrese su 2era nota");
              not2=entrada.nextInt();
              System.out.println("Ingrese su 3era nota");
              not3=entrada.nextInt();
              System.out.println("Ingrese su 4era nota");
              not4=entrada.nextInt();
        promedio=(not1*0.04)+(not2*0.12)+(not3*0.24)+(not4*0.60);
        System.out.println("Su promedio final es " + promedio );
        
        if (promedio>=12){
            System.out.println("El Usuario: \n"+ nombre+ apellido+" Con promedio\n"+promedio+" Aprobo");
        }
        else{
            System.out.println("El Usuario: \n"+ nombre+ apellido+" Con promedio\n"+promedio+"Desaprobo");
        }
        
      }
}
