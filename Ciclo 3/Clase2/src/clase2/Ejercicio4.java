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
public class Ejercicio4 {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        int nuA,nuB,nuC;
        
            System.out.println("Ingrese su valorA");
            nuA =entrada.nextInt();
             System.out.println("Ingrese su valorB");
            nuB =entrada.nextInt();
             System.out.println("Ingrese su valorC");
            nuC =entrada.nextInt();
        
            System.out.println("El resultado de (a>b) && (b<c) es :" + ((nuA>nuB ) && (nuB<nuC)));
         System.out.println("El resultado de ((a+b) <c)|| ((a-c) >b)) es :" + (((nuA+nuB )<nuC )||((nuA-nuC)>nuB)));
         System.out.println("El resultado de ((a+b) <c)|| ((a-c) >b)) es :" + (((nuA+nuB )>nuB )||!((nuA+nuC)==nuC)));
        
        
            
            
            
            
        
        
        
        
        }
    
}
