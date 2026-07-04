/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gremio;


public class Producto {
    private int id;
    private String nombre;
    private String tipo;
    private String calidad;
    private double precio;
    
    public Producto(int id, String nombre, String tipo, String calidad, double precio){
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.calidad = calidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setId(String nombre){
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getCalidad() {
        return calidad;
    }
    
    public void setCalidad(String calidad){
        this.calidad = calidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Producto{" +
            "id=" + id +
            ", nombre='" + nombre + '\'' +
            ", tipo='" + tipo + '\'' +
            ", calidad='" + calidad + '\'' +
            ", precio=" + precio +
            '}';
    }
}
