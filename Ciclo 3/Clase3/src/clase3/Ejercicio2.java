/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;
import java.util.Scanner;
/**
 *
 * @author ronald
 */
public class Ejercicio2 {
     static String ingresarNombre(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        return entrada.next();
    }
    public static void main(String[] args) {
        String nombre=ingresarNombre();
        System.out.println("Hola"+ nombre);
        
    }
    
   
    
}
