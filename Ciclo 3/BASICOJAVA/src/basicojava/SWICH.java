/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicojava;

import java.util.Scanner;

/**
 *
 * @author ronald
 */
public class SWICH {
        public static void main(String[] args) {
            Scanner entrada =new Scanner(System.in);
            int a,b;
            char R;
            System.out.println("Ingrese que operacion desea realizar");
            System.out.println("Suma=1 , Resta=2,Division=3,Multiplicacion=4");
            R=(char) entrada.nextInt();
            System.out.println("Ingrese el 1er numero" );
            a=entrada.nextInt();
            System.out.println("Ingrese el 2do numero" );
            b=entrada.nextInt();
            switch (R) {
                case 1:
                    System.out.println("La Suma es:" + (a+b));    
                
                break;
                case 2:
                    System.out.println("La Resta es:" + (a-b));    
                
                break;
                case 3:
                    System.out.println("La Division es:" + (a/b));    
                break;
                case 4:
                    System.out.println("La Multipliacion es:" + (a*b));    
                
                break;
                
                default:{
                    System.out.println("Numero invalido");
                }
                    throw new AssertionError();
            }

            
        }
    
}
