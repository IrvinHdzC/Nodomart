
package Clases;

import java.io.Serializable;


public class Desgloce implements Serializable{
    private int idProducto;
    private double cantidad,subtotal, precio;
    private String nombre;

    public Desgloce(int idProducto, String nombre, double precio, double cantidad, double subtotal) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.precio= precio;
        this.nombre=nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    @Override
    public String toString() {
        return "ID Producto: " + this.getIdProducto() + "\nNombre: " + this.getNombre() + "\nPrecio: " + this.getPrecio() + "\nCantidad: " + this.getCantidad() + "\nSubtotal: " + this.getSubtotal();
    }
    
    
}
