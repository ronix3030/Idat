/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;

/**
 *
 * @author ronald
 */
public class Ejercicio8 {
    
   static  int base=10,altura=20;
    public static void main(String[] args){
        int baseTri = 8,alturaTri = 4;
        Ejercicio8 tri =new Ejercicio8();
        tri.calcularArea(5,10);
        tri.calcularArea(baseTri,alturaTri);
        tri.calcularArea(Ejercicio8.base,Ejercicio8.altura);
        calcularArea();
        
    }
    
    public void calcularArea(int base, int altura){
        int area=base*altura/2;
        System.out.println("El area del triangulo es: "+area );
        
    }
        
        
        public static void calcularArea(){
        int area=base*altura/2;
        System.out.println("El area del triangulo es: "+area );
        
    }
      
        
    }
    

