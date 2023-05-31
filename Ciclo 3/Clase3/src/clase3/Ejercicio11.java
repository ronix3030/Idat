/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;
import java.util.Scanner;
/**
 *
 * @author ronald
 *///Desarrollar una aplicación que solicite ingresar dos números y que solicite ingresar que operación desea realizar (
//suma, resta, multiplicación, división y módulo). Las operaciones deben realizarse mediante métodos por cada operación. Realizar el ejercicio para cada uno de los siguientes casos:
//	Usando variables globales y sin paso de argumentos. Los métodos deben estar en la misma clase.

public class Ejercicio11 {
      
     public static void main(String[] args){
         Scanner entrada=new Scanner(System.in);
       
          int ope;
        int num1,num2;
         System.out.println("1=Suma,2=Resta,3=Multi,4=Division");
         System.out.println("Que operacion desea realizar");
         ope=entrada.nextInt();
         
         switch (ope) {
             case 1:
                 System.out.println("Selecciono la Suma");
                 System.out.println("Ingrese su 1er numero");
                 num1=entrada.nextInt();
                 System.out.println("Ingrese su 2do numero");
                 num2=entrada.nextInt();
                 suma(num1, num2);
                 break;
                 
             case 2:
                  System.out.println("Selecciono la Resta");
                 System.out.println("Ingrese su 1er numero");
                 num1=entrada.nextInt();
                 System.out.println("Ingrese su 2do numero");
                 num2=entrada.nextInt();
                 resta(num1, num2);
                 break;
                 
             case 3:
                 System.out.println("Selecciono la Multiplicacion");
                 System.out.println("Ingrese su 1er numero");
                 num1=entrada.nextInt();
                 System.out.println("Ingrese su 2do numero");
                 num2=entrada.nextInt();
                
                 multiplicacion(num1, num2);
                 break;
                
             case 4:
                  System.out.println("Selecciono la Division");
                 System.out.println("Ingrese su 1er numero");
                 num1=entrada.nextInt();
                 System.out.println("Ingrese su 2do numero");
                 num2=entrada.nextInt();
                 
                 division(num1, num2);
                 break;

             default:
                 System.out.println("Seleccione numero del 1 al 4");
         }
         
     }
   
      static void suma(int num1,int num2){
          int s;
           s=num1+num2;
           System.out.println("La suma es: "+s);
}
   
        static void resta(int num1,int num2){
            int r;
            r=num1-num2;
            System.out.println("La resta es:" +r);

}
        static void multiplicacion(int num1 ,int num2){
            int m;
            m=num1*num2;
            System.out.println("La multiplicacion es: " +m);
    
}

        static void division(int num1, int num2){
            int d;
            d=num1/num2;
            System.out.println("La division es: "+d);
    
}

     }
    


