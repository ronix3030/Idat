/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author ronald
 */
public class Ejercicio3 {
      public static void main(String[] args) {
          
          Gato cat =new Gato("Dora", 0, "Angora");
          cat.hacerRuido();
          Perro dog=new Perro("ola",2,"ola2");
          dog.hacerRuido();
          GatoMontes catm=new GatoMontes("Issa", 12, "Europero");
          catm.hacerRuido();
          
      }
}
          
          interface Expresable{
              void hacerRuido();
              
          }
          
          abstract class Animal implements Expresable{
              String nombre;
              int edad;
              String raza;
              public Animal(String nombre,int edad, String raza){
                  this.nombre= nombre;
                  this.edad=edad;
                  this.raza=raza;
                  
              }
              
              @Override
              abstract public void hacerRuido();
          }
          
              class Gato extends Animal{
                  public Gato(String nombre, int edad,String raza){
                      super(nombre,edad,raza);
                  }
                  @Override
                  public void hacerRuido(){
                      System.out.println(nombre+"hace miau....");
                  }
              }
               class GatoMontes extends Animal{
                  public GatoMontes(String nombre, int edad,String raza)
                  {
                      super(nombre,edad,raza);
                  }
                  @Override
                  public void hacerRuido(){
                      System.out.println(nombre+"wuiggggggg....");
                  }
               }
                   class Perro extends Animal{
                  public Perro(String nombre, int edad,String raza){
                      super(nombre,edad,raza);
                  }
                  @Override
                  public void hacerRuido(){
                      System.out.println(nombre+"hgua guao guao...");
                  }
              
              
              
              
              
              
          }
          
          
          
          
          
          
          
 
