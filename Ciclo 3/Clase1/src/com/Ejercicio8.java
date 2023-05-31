/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *sueldo basico 1000
 * @author ronald
 */
public class Ejercicio8 {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
     
         int horas;
         double brut,net1,tarif,base,netf;
         
         
         System.out.println("Ingrese su tarifa horaria");
         tarif=entrada.nextFloat();
         
         System.out.println("Sus horas trabajadas son ?");
         horas=entrada.nextInt();
         
         base=(tarif*horas);
         brut=(base*0.20)+base;
         net1=(brut*0.10);
         netf=(brut-net1);
         
         DecimalFormat df=new DecimalFormat(".0");
         
         
         
         
         
         
         System.out.println("Su sueldo basico es "+ df.format(base));
         System.out.println("Su sueldo bruto es "+df.format(brut));
         System.out.println("Su sueldo neto es "+df.format(netf));
         
    }
    
}
