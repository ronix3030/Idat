/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author ronald
 */
public class Ejercicio6 {
      public static void main(String[] args){
          
          
      }
}
interface Realizable{
    
    int MINIMANOTA =13;
    void marcarAsistencia();
    void asistirCharla();
    
}
class PersonaIdat implements Realizable{
    int id;
    String nombre;
    @Override
    public void marcarAsistencia(){
        System.out.printf("%s marcar asistencia" + this.nombre);
    }
    @Override
    public void asistirCharla(){
        System.out.printf("%s asiste a la charla " + this.nombre); 
    }
    
}

class Alumno extends PersonaIdat{
    int escala;
    
    public Alumno (int id, String nombre, int escala){
        super(id,nombre);
        this.escala=escala;
        
    }
    public void pagarPension(){
        System.out.printf("%s paga su pension " +this.nombre);
    }
    
    public void consultarNotas(){
        System.out.printf("%s consulta sus notas"+ this.nombre);
        
    }
    
    }
    
