/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;
import java.util.Scanner;
/**
 *
 * @author ronald
 * 
 * CREAR UN PROGRAMA QUE PERMITA INGRESAR POR TECLADO
 * EL NOMBRE DE UN ALUMNO , SUS 3 NOTAS,HALLAR EL PROMEDIO Y EL TIPO DE BECA QUE OBTENDRA
 * PROMEDIO 0-15 SIN BECA
 * PROMEDIO 16 A 17 1/4 BECA
 * PROMEDIO 18 A 19 1/2 BECA
 * PROMEDIO 20 BECA INTEGRAL
 *
 */
public class ejercicioIFELSE {
     public static void main(String[] args) {
         
         Scanner entrada=new Scanner(System.in);
         String nombre;
        int not1,not2,not3;
        double promedio;
         
         System.out.println("Ingrese su Nombre");
          nombre = entrada.next();
          
          System.out.println("Ingrese su 1er Nota");
          not1=entrada.nextInt();
          
          System.out.println("Ingrese su 2da Nota");
          not2=entrada.nextInt();
          
          System.out.println("Ingrese su 3era Nota");
          not3=entrada.nextInt();
          
          promedio=(not1+not2+not3)/3;
         
         if(promedio<=15){
             System.out.println("El alumno "+ nombre +" Con promedio "+promedio+ "\nNo obtiene beca");
             
         }
         
         else if ( promedio >16 && promedio <17){
            System.out.println("El alumno "+ nombre +" Con promedio "+promedio+ "\n Obtiene 1/4 beca");
         }
         else if (promedio >18 && promedio <19){
            System.out.println("El alumno "+ nombre +" Con promedio "+promedio+ "\n Obtiene beca 1/2");
         }
         
         else {
              System.out.println("El alumno "+ nombre +" Con promedio "+promedio+ "\n Obtiene beca ");
         }
          
          
         
         
         
         
         
         
         
         
         
     }
    
}
