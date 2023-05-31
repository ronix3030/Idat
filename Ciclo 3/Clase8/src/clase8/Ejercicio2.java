/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author ronald
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Deportista depor=new Deportista();
        depor.nadaLibre();
        depor.nadaMariposa();
        depor.caminar();
        depor.correr();
    }
}


interface Nadable{
    void nadaLibre();
    void nadaMariposa();
}
interface Ejercitable{
    void caminar();
    void correr();
}

class Deportista implements Nadable,Ejercitable{
    @Override
    public void nadaLibre(){
        System.out.println("Nado libremente....");
    }
    @Override
    public void nadaMariposa(){
        System.out.println("Nado con estilo mariposa...");
    }
    @Override
    public void caminar(){
        System.out.println("Estoy caminando .......");
    }
    @Override
    public void correr(){
        System.out.println("Estoy corriendo...");
    }
    
    
    
   
        
    }
    

