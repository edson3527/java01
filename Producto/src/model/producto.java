/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



public abstract class producto {
    String tipo;
    double precio;
    String fecha_venta;
    
    public producto(String tipo , double precio , String fecha_venta){
        this.tipo = tipo;
        this.precio = precio;
        this.fecha_venta = fecha_venta;
    }
   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    @Override
    public String toString() {
        return "producto{" + "tipo=" + tipo + ", precio=" + precio + ", fecha_venta=" + fecha_venta + '}';
    }
    
    
}
