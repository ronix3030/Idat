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
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
    
    
    int num1;
    int total;
        System.out.println("Ingrese un numero del mes");
        num1=entrada.nextInt();
        
        switch (num1) {
            case 1:
        
            {
                System.out.println("Enero tiene  31 días");
            }
                break;
            
            
            case 2:
                {
                System.out.println("Febrero tiene 28 días ");
            }
                break;
            
            
            case 3:
                {
                System.out.println("Marzo tiene 31 días ");
            }
                break;
                       
            case 4:
                {
                System.out.println("Abril tiene 30 días");
            }
                break;
            
            case 5:
                {
                System.out.println("Mayo tiene  31 días");
            }
                break;
            
            case 6:
                {
                System.out.println("Junio tiene 30 días");
            }
                break;
            case 7:
                {
                System.out.println("Julio tiene 31 días ");
            }
                break;
            case 8:
                {
                System.out.println("Agosto tiene 31 días ");
            }
                break;
            case 9:
                {
                System.out.println("Septiembre tiene 30 días ");
            }
                break;
            
                case 10:
                {
                System.out.println("Octubre tiene 31 días");
            }
                break;
            
                case 11:
                {
                System.out.println("Noviembre tiene 30 días ");
            }
                break;
            
                case 12:
                {
                System.out.println("Diciembre tiene 31 días ");
            }
                break;
            
            
            default:
                System.out.println("No existe tal mes");
                
                
                
                
        }
    
    
    
    
    
    
    }
    
}
