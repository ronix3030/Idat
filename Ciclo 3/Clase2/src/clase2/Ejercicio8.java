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
public class Ejercicio8 {
      public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int num1;
        
          System.out.println("Ingrese un numero");
          num1=entrada.nextInt();
          
          
          if((num1>=1)&&(num1<=9)){
              System.out.println("el numero esta entre 1 al 9");
          }
          
          else if ((num1>=10)&&(num1<=19)){
              System.out.println("el numero esta entre 10 al 19");
      }
        
          else if ((num1>=20)&&(num1<=29)){
              System.out.println("el numero esta entre 20 al 29");
      }
          else {
              System.out.println("Resto de numeros");
          }
        
      }
    
    
}
