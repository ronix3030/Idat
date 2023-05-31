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
public class Ejercicio10 {
     public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
      
        int num;
        
         System.out.println("Ingrese un numero de mes ");
        num=entrada.nextInt();
        
        
         switch (num) {
             case 1:
                 System.out.println("El numero seleccionado es Enero");
               break;
                  case 2:
                      
                 System.out.println("El numero seleccionado es Febrero");
               break;
                  case 3:
                 System.out.println("El numero seleccionado es Marzo");
             
                  case 4:
                 System.out.println("El numero seleccionado es Abril");
               break;
                  case 5:
                 System.out.println("El numero seleccionado es Mayo");
                   break;
              case '6':
                 System.out.println("El numero seleccionado es Junio");
                   break;
              case 7:
                 System.out.println("El numero seleccionado es Julio");
                   break;
              case 8:
                 System.out.println("El numero seleccionado es Agosto");
                   break;
              case 9:
                 System.out.println("El numero seleccionado es Septiembre");
                   break;
                case 10:
                 System.out.println("El numero seleccionado es Octubre");
                   break;
             case 11:
                 System.out.println("El numero seleccionado es Noviembre");
                   break;
                 case 12:
                 System.out.println("El numero seleccionado es Diciembre");
                   
                 break;
             default:
                 System.out.println("NUMERO INVALIDO");         }
        
        
        
     }
    
}
