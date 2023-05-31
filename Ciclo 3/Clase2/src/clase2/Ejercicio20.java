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
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
  
        String letra;
        System.out.println("Ingrese una vocal o consonante");
        letra=entrada.nextLine();
        
        switch (letra) {
            case "a":{
                System.out.println("Ingreso una vocal");
            }
             break;
            case "e":{
                System.out.println("Ingreso una vocal");
            }
             break;
            case "i":{
                System.out.println("Ingreso una vocal");
            }
             break;
            case "o":{
                System.out.println("Ingreso una vocal");
            }
             break;
            case "u":{
                System.out.println("Ingreso una vocal");
            } 
                break;
            default:
                System.out.println("Usted ingreso una consonante");
        }
    
    
    
    
    }
}
