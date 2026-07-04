/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gremio;


public class Oficial extends Miembro {
    private int aniosServicio;
    private double salario;
    
    public Oficial(int pId, String pNombre, int pEdad, RolMiembro rol, int pAniosServicio, double pSalario){
        super(pId, pNombre, pEdad, RolMiembro.OFICIAL);
        aniosServicio = pAniosServicio;
        salario = pSalario;
    }

    public int getAniosServicio() {
        return aniosServicio;
    }
    
    public void setAniosServicio(String aniosServicio){
        this.aniosServicio = this.aniosServicio;
    }

    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void apoyarTrabajo() {
        System.out.println(getNombre() + " está apoyando el trabajo.");
    }

    public void aprender() {
        System.out.println(getNombre() + " continúa aprendiendo.");
    }
}
