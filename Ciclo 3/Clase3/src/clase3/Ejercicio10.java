/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;

/**
 *
 * @author ronald
 */
public class Ejercicio10 {
       public static void main(String[] args){
           
           
           int i=5; double d=8.5; char c='A';
         String cadena;
           
           Integer x=18;
           Double y=19.7;
           Character z='b';
           
           System.out.println("Datos Primitivos, int: "+i+"dobule "+d+"char" +c);
           System.out.println("Envoltorios,Iteger: "+x+"Double: "+y+"Character: "+z);
           System.out.println("int concatenado con duble: "+Integer.toString(i) + " - "+Double.toString(i));
           cadena=Integer.toString(i+x);//Suma de primitivo + envoltorio
           i=Integer.parseInt(cadena);//Conversion de String a primitivo int
           System.out.println("Suma de Primitivo+ envoltorio int: "+i);
           cadena=Double.toString(d+y);
           y=Double.valueOf(cadena);
           System.out.println("Suma de Primitivo+envoltorio int: "+y);
           System.out.println("Suma de Primitivo + envoltorio double "+y);
           System.out.println("Es digito"+Character.isDigit(c));
           System.out.println("Es espacio en blanco? " + Character.isWhitespace(z));
           System.out.println("Es mayucula "+Character.isUpperCase(c));
           System.out.println("Es minuscula " + Character.isLowerCase(z));
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
       }
    
}
