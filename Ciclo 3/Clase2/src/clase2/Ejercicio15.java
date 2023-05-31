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
public class Ejercicio15 {
     public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
     
     char letra=entrada.next().charAt(0);
             
         //Este metodo determina si el valor de char esta en mayuscula
         
       if (Character.isUpperCase(letra)) {
             System.out.println("La letra es "+letra+ "es Mayuscula");
             
         }
         else
         {
             System.out.println("La letra es "+letra+"es Minuscula");
         }
     
     }
    
}
