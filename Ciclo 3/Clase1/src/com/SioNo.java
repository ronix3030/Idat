/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ronald
 */
public class SioNo {
     public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          
         int num;
         
         num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
                  
         if (num % 2 ==0){
         JOptionPane.showMessageDialog(null,"Su numero es par");
         }
         else {
         JOptionPane.showMessageDialog(null,"No es par");
                 }
         
         
          
         
         
         
         
         
         
         
         
         
     }
    
}
