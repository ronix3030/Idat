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
public class ManejoExcepciones {
        public static void main(String[] args) {
             Scanner scaner = new Scanner(System.in);
            
      //Utiliza Integer. parseInt() para convertir una cadena en un n�mero entero
      //JOptionPane tiene diferentes ventanas de dialogo,
      //JOptionPane.showMessageDialog() nos permite mostrar un mensaje.
      //JOptionPane.showInputDialog() nos permite la entrada de datos 
      //JOptionPane.ConfirmDialog() nos permite hacer preguntas con var�as confirmaciones. Por ejemplo: S�, No, Cancelar.
      //JOptionPane.showOptionDialog() engloba/unifica los 3 anteriores di�logos.
      //Interger.parseInt()Convierte una cadena de texto en un n�mero entero.
     
            int numero;
            int numero2;
            int suma;
            
            
           
            numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
       
             numero2 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
         
             
             suma= numero+numero2;
             
             
            JOptionPane.showMessageDialog(null, "su suma es "+ suma);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
             
             
            
            
            
            
            
        
        }
    
    
}
