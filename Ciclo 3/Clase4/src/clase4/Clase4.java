/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4;

/**
 *
 * @author ronald
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Nadador nadador=new Nadador();
        nadador.nadaLibre();
        nadador.nadaMariposa();
    }
}

interface Nadable{
    void nadaLibre();
    void nadaMariposa();
    
}


class Nadador implements Nadable {
    @Override
    
    public void nadaLibre(){
        System.out.println("Nado Libremente.....");
    }
        @Override
        public void nadaMariposa(){
        System.out.println("Nado con estilo marip�sa..... ");
        
    }
    }
    
        
    




        
        
        
        
        
        
        
        
    
    

