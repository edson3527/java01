/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
public class AreaCirculo {
    public static void main(String[] args) {
        // calcular el area de una
        // circunferencia de radio = 2.5
        float radio = 2.5f; //declaracion o definicion de la variable 
                      //Tipo_de_dato 
        float area;
        float pi = 3.141592f;
        
        area = pi*radio*radio;
        
        System.out.println("El area del circulo de radio " + radio + " es " + area );
               
    }
}
