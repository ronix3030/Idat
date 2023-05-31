/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author ronald
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
    
    
    int num1;
        System.out.println("Ingrese un año");
        num1=entrada.nextInt();
        
        if (num1%4==0 && num1%100==0 && num1%400==0) {
            System.out.println("Año  biciesto");
            
                    
                    
            
        } else {System.out.println("Año no biciesto");
        }
    
    
    
    
    
    
    
    }
    
}
