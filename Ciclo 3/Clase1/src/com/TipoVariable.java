/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com;

import java.util.Scanner;

/**
 *
 * @author ronald
 */
public class TipoVariable {

    /**
     * @param args the command line arguments
     * int,float,double
     * char=caracter boolean =verdader o falso
     * 
     */
    public static void main(String[] args) {
         Scanner scaner = new Scanner(System.in);
         
        
      
        //  INT TODOS LOS NUMEROS ENTEROS
        int numero1;
        int numero2;
        int fin;
      System.out.println("Ingrese un numero");
      numero1=scaner.nextInt();
      System.out.println("Ingrese un numero");
      numero2=scaner.nextInt();
      
      fin=(numero1+numero2)*2;
      
      System.out.println("La suma + multiplicacion es =" + fin);
      
      
      
      /// DOUBLE SI O SI SE NECESITA PARA DECIMALES SINO TE DARA ERROR
      /// FLOAT TAMBIEN DA DECIMALES PERO MENOS
      double costo;
      double finn;
      
      System.out.println("Ingrese el costo del producto");
      costo=scaner.nextInt();
      
      finn= costo*1.8;
      
      System.out.println("El costo del producto + IGV"+ fin);
      

      
      
      
       
       
                
        
        
    }
    
}
