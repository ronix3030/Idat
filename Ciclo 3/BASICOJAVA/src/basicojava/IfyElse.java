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
public class IfyElse {
        public static void main(String[] args) {
            Scanner entrada=new Scanner(System.in);
            
    // Desarrollar una aplicación que solicite ingresar una figura geometrica y 
    //dependiendo de que figura geométrica es solicite ingresar los datos necesarios para calcular su área:        
            // Triangulo Área = base * altura
          // Cuadrado Área = lado * lado
                // Circulo  Área = 2 * PI * radio
    int R;
            System.out.println("Porfabor digite que Figura desea ");
            System.out.println("Triangulo es = 1, Cuadrado es =2 ,Circulo es =3");
            R=entrada.nextInt();
            
            if (R==1){
                int a,b;
                System.out.println("Ingrese la Base ");
                a=entrada.nextInt();
                System.out.println("Ingrese la Altura");
                b=entrada.nextInt();
                System.out.println("El Area del Triangulo es " +(a*b) );      
            }
            else if(R==2){
                int a,b;
                System.out.println("Ingrese lado");
                a=entrada.nextInt();
                System.out.println("Ingrese lado");
                b=entrada.nextInt();
                System.out.println("El Area del Cuadrado es " + (a*b));
            }
            else if(R==3){
                int a,b;
                System.out.println("Ingrese el radio");
                a=entrada.nextInt();
                System.out.println("El Area del Circulo es " + ((Math.PI*2)*a));
                
            }
     
            else {
                System.out.println("Error Vuelva a Digitar");
            }
    
        }
        
 
        
        
}
