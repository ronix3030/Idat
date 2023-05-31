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
public class Ejercicio12 {
      public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int num1,num2;
          System.out.println("Ingrese un numero");
          num1=entrada.nextInt();
          System.out.println("Ingrese 2do numero");
          num2=entrada.nextInt();
          
          if(num1>num2){
              System.out.println("Numero 1 es mayor a numero 2");
          }
          
          else if (num1==num2){
              System.out.println("Los numeros son iguales");
          }
          
          else{
              System.out.println("Numero 2 es mayor a numero 1");
          }
        
        
      }
    
}
