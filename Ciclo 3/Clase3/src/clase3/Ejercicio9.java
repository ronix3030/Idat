/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;

/**
 *
 * @author ronald
 */
public class Ejercicio9 {
    public static void main(String[] args){
        int dado;
        String cadena;
        //Medotos de la clase Math
        dado=(int)(Math.random()*6+1);
        System.out.println("Valor del dado"+dado);
        System.out.println("Redondeo"+Math.round(15.89));
        System.out.println("Redondeo"+Math.round(15.45));
        //Metodos de la Clase String
        
        cadena="Cuando las aves vuelan es porque el cielo esta despejado";
        System.out.println("aves se encuentra en la posicion:"+cadena.indexOf("aves"));   
        System.out.println("cielo se encuentra en la oracion:"+cadena.contains("cielo"));
        System.out.println(""+cadena.replace("las aves","los pajaros"));
        System.out.println(cadena);
        
        
        
        
        
        
   
        
        
    }
    
}
