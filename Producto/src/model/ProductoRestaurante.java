/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class ProductoRestaurante extends producto {
     protected String objeto_vendido_Res;
     protected String codigo_restaurante;
    
    
   public ProductoRestaurante(String tipo , double precio ,String objeto_vendido_Res , String codigo_Restaurante ,String fecha_venta ){
        super(tipo , precio ,fecha_venta);
        this.objeto_vendido_Res = objeto_vendido_Res;
        this.codigo_restaurante = codigo_restaurante;
    }

    @Override
    public String toString() {
        return "ProductoRestaurante{" + "objeto_vendido_Res=" + objeto_vendido_Res + ", codigo_restaurante=" + codigo_restaurante + '}';
    }
    
}
