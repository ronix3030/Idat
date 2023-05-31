/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicojava;

import java.util.Scanner;

/**
 *
 * @author ronald
 */
public class OPERADORES {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Aritmeticos = +,-,*,/
        // Relacionales = <,>(menoro o M) , <=>=(menor o igual) , != (distinto)
       
    Scanner entrada = new Scanner(System.in);
  int a,b,r;
    
        System.out.println("Ingrese un numero");
        a=entrada.nextInt();
        System.out.println("Ingrese otro numero");
        b=entrada.nextInt();
        
        System.out.println("La suma de A y B es "+ (a+ b));
        System.out.println("La resta de A y B es " + (a-b));
        System.out.println("La multi de A y B es " + (a*b));
        System.out.println("La division de A y B es " + (a/b));
        System.out.println("A es igual a B? " + (a==b));
        System.out.println(" A es mayor a B? " + (a>b));
        System.out.println("A es menor o igual a B? " + (a<=b));
        System.out.println("A es distinto a B? " +(a!=b));
    
        // Estos operadores Condicionales Aplican en otra Estructura  pero 
        // tambien se podrian implementar dependiendo el problema
        
         // Condicionales = && (y) , || (o) , ! (negacion) 
        
        
        
    }
    
  
    
    
}
