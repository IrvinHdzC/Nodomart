/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.io.Serializable;
/**
 *
 * @author irvihernande
 */
public class Producto implements Serializable{
 private int id;
 private String nombre;
 private double precio;
 private String descripcion;
 private String marca;
    
    public Producto(int id, String nombre, double precio, String descripcion, String marca){
       
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
        this.descripcion=descripcion;
        this.marca=marca;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "\nID: " + this.getId() + "\nNombre: " + this.getNombre() + "\nDescripcion: " + this.getDescripcion() + "\nPrecio: " + this.getPrecio() + "\nMarca: " + this.getMarca();
    }
    
    
    
}
