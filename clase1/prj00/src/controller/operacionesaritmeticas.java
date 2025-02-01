/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
public class operacionesaritmeticas {
    public static void main(String[] args) {
        double a =147 , b = 39;
        
        System.out.println("la suma de a+b es " + (a+b));
        System.out.println("la resta de a-b es " + (a-b));
        System.out.println("la multiplicacion de a*b es " + (a*b));
        System.out.println("la division de a/b es " + (a/b));
        System.out.println("el resto de a%b es " + (a%b));
        
        a++;
        System.out.println("la sucesion de a es " + (a));
        a-=2;
        System.out.println("el anterior de a es " + (a));
    }
}
