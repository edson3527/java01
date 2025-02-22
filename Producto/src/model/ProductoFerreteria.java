/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class ProductoFerreteria extends producto {
    protected String objeto_vendido_fer;
    protected String codigo_ferreteria;
    
    
      public ProductoFerreteria(String tipo , double precio ,String objeto_vendido_fer , String codigo_ferreteria ,String fecha_venta ){
        super(tipo , precio ,fecha_venta);
        this.objeto_vendido_fer = objeto_vendido_fer;
        this.codigo_ferreteria = codigo_ferreteria;
    }

    @Override
    public String toString() {
        return "ProductoFerreteria{" + "objeto_vendido_fer=" + objeto_vendido_fer + ", codigo_ferreteria=" + codigo_ferreteria + '}';
    }
    
}
