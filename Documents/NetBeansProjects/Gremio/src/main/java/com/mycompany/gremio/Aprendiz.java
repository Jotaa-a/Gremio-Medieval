/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gremio;

public class Aprendiz extends Miembro {
    private int timepoAprendizaje;
    private Maestro tutor;
    
    public Aprendiz(int id, String nombre, int edad, int tiempoAprendizaje, Maestro tutor){
        super(id, nombre, edad, RolMiembro.APRENDIZ);
        this.timepoAprendizaje = tiempoAprendizaje;
        this.tutor = tutor;
    }

    public int getTimepoAprendizaje() {
        return timepoAprendizaje;
    }
    
    public void setTiempoAprendizaje(int tiempo){
        this.timepoAprendizaje = tiempo;
    }

    public Maestro getTutor() {
        return tutor;
    }
    
    public void setTutor(Maestro tutor){
        this.tutor = tutor;
    }
    
    public void practicar() {
        System.out.println(getNombre() + " está practicando.");
    }

    public void completarAprendizaje() {
        System.out.println(getNombre() + " ha completado su aprendizaje.");
    }
}
