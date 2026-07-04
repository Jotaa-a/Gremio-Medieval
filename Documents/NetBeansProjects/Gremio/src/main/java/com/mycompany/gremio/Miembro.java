/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gremio;


public class Miembro {
    private  int id;
    private String nombre;
    private int edad;
    private RolMiembro rol;
    
    public Miembro(int id, String nombre, int edad, RolMiembro rol){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.rol = rol;
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
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }

    
    public RolMiembro getRol() {
        return rol;
    }
    
    protected void setRol(RolMiembro rol) {
        this.rol = rol;
    }
    
    
    public void realizarTrabajo() {
        System.out.println(nombre + " está realizando su trabajo.");
    }

    public void ascender() {
        System.out.println(nombre + " ha sido ascendido.");
    }
}
