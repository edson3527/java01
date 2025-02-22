/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class ProductoFarmacia extends producto {
     protected String objeto_vendido_Far;
    protected String codigo_farmacia;
    
    
    public ProductoFarmacia(String tipo , double precio ,String objeto_vendido_Far , String codigo_farmacia ,String fecha_venta ){
        super(tipo , precio ,fecha_venta);
        this.objeto_vendido_Far = objeto_vendido_Far;
        this.codigo_farmacia = codigo_farmacia;   
    }

    @Override
    public String toString() {
        return "Productofarmacia{" + "objeto_vendido_Far=" + objeto_vendido_Far + ", codigo_farmacia=" + codigo_farmacia + '}';
    }
    
}
