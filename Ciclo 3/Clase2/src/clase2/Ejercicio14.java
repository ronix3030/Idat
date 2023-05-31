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
public class Ejercicio14 {
      public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
      
      int num1;
          System.out.println("Ingrese numero de la semana ");
          num1=entrada.nextInt();
          switch (num1) {
              case 1:
                  System.out.println("Dia Lunes");
                  break;
                  case 2:
                  System.out.println("Dia Martes");
                  break;
                  case 3:
                  System.out.println("Dia Miercoles");
                  break;
                  case 4:
                  System.out.println("Dia Jueves");
                  break;
                  case 5:
                  System.out.println("Dia Viernes");
                  break;
                  case 6:
                  System.out.println("Dia Savado");
                  break;
                  case 7:
                  System.out.println("Dia Domingo");
                  break;
              default:
                  System.out.println("Numero invalido!!");
          }
          
      
      
      
      
      
      
      }
    
}
