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
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
    
        int num1;
        
        System.out.println("Ingrese la edad ");
        num1=entrada.nextInt();
        
        
        if(num1<=5){
            System.out.println("Grupo Etario: Primera  Infancia ");
        }
            else if (num1>=6 && num1<=11){
                    System.out.println("Grupo Infancia ");
                    }
        else if (num1>=12 && num1<=18){
                    System.out.println("Grupo Adolecencia");
                    }
        else if (num1>=14 && num1<=26){
                    System.out.println("Grupo Juventud");
                    }
        else if (num1>=27 && num1<=59){
                    System.out.println("Grupo Adultes  ");
                    }
        else if (num1>=60 && num1<=120){
                    System.out.println("Grupo Adultes Mayor ");
                    }
        else{
            System.out.println("Edad imposible");
        }
            
          
        
        
        
    
   
   
        }
}