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
public class Ejercicio9 {
        public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        char letra;
        
            System.out.println("Ingrese una letra");
            letra=entrada.next().toUpperCase().charAt(0);
            
          switch(letra){
              case 'V':
                  System.out.println("La ESTACION ES VERANO");
                  break;
                  case 'P':
                  System.out.println("La ESTACION ES PRIMAVER");
                  break;
                  case 	'I':
                  System.out.println("La ESTACION ES INVIERNO");
                  break;
                  case 	'O':
                  System.out.println("La ESTACION ES OTOÑO");
                  break;
              default:
                  System.out.println("NO ES UNA ESTACION");



          }
            
            

        
        
        
        }
    
}
