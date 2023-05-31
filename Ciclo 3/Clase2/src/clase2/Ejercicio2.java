/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;
import java.util.Scanner;
/**
 *Modificar el ejercicio 1, de tal forma que las variables sean ingresadas por 
 * teclado. Revisar como se modifican los resultados cuando 
 * ?a? es menor que ?b? y cuando ?a? es igual a ?b?.

 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int a,b;
        boolean condicion=true;
        
        System.out.println("Ingrese su variable A");
        a=entrada.nextInt();
        System.out.println("Ingrese su variable B");
        b=entrada.nextInt();
        
        
        System.out.println("A ==B :" + (a==b));
         System.out.println("a < b : " +(a<b));
          System.out.println("a <=b " + (a <= b));
           System.out.println("a>b :" + (a>b));
            System.out.println("a >=b : " +(a >= b));
             System.out.println(" a !=b :" + (a !=b));
              System.out.println("condicion ==true : "+ (condicion== true));
        
    }
    
}
