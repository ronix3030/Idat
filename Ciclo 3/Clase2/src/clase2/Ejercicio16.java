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
public class Ejercicio16 {
     public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
   
     int base,altura,lado,num1,area;
     double radio,are2;
    
         System.out.println("Ingrese numero de Figura 1=triangulo,2=cuadrado/n,3=circulo");
     
     num1=entrada.nextInt();
         if(num1==1){
             System.out.println("Ingrese base de triangulo");
             base=entrada.nextInt();
             System.out.println("Ingrese altura de triangulo");
             altura=entrada.nextInt();
             area=base*altura;
             System.out.println("El area del triangulo es: "+area);          
         }
         
         else if(num1==2){
             System.out.println("Ingrese lado de Cuadrado");
             lado=entrada.nextInt();
             area=lado*lado;
             System.out.println("El area del Cuadrado"+area);
            
         }
         else if(num1==3){
             System.out.println("Ingrese radio de Cirulo");
             radio=entrada.nextDouble();
             are2=(Math.PI*2)*radio;
             System.out.println("Area del  Cirulo es: ");
         }         
         
         else{
             System.out.println("Numero ingresado Incorrecto");
         }
         
         
         
         
         
         
         
         
     }
    
}
