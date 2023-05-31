/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;

/**
 *
 * @author ronald
 */
public class Ejercicio7 {
    int base=10,altura=20;
    
public static void main(String[] args){
        int baseTri=8,alturaTri=4;
         
        Ejercicio7 tri=new Ejercicio7();
        tri.calcularArea(10, 20);
        tri.calcularArea(baseTri,alturaTri);
        tri.calcularArea(tri.base,tri.altura);
        
    }
    public void calcularArea(int base,int altura){
        int area =base*altura/2;
            System.out.println("El area del triangulo es:"+area);
    }
    
    


}
