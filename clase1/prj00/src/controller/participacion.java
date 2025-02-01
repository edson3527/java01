/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
public class participacion {
    public static void main(String[] args ){
       int califinal = 15;
       
       
        if (califinal<0 || califinal>20) {
            System.out.println("CALIFICACION INVALIDA");
        }else {
        if (califinal>0 && califinal<10 ) {
            System.out.println("DESAPROBADO");
        }else if (califinal>10 && califinal <14) {
            System.out.println("PARA SUSTITUTORIO");
        }else if(califinal>14 && califinal <=20) {
            System.out.println("APROBADO");
        } }
         
            
        
       
       
        
        
        
    }
}
