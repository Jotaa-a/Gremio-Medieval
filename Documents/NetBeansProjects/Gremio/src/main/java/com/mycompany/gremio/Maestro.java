
package com.mycompany.gremio;


public class Maestro extends Miembro {
    private String especialidad;
    private  int aniosExperiencia;
    
    public Maestro(int pId, String pNombre, int pEdad, String pEspecialidad, int pAniosExperiencia){
        super(pId, pNombre, pEdad, RolMiembro.MAESTRO);
        this.especialidad = pEspecialidad;
        this.aniosExperiencia = pAniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    
    public void setAniosExperiencia(int aniosExperiencia){
        this.aniosExperiencia = aniosExperiencia;
    }
    
    public void crearProducto() {
        System.out.println(getNombre() + " ha creado un producto.");
    }
    
    public void enseñar() {
        System.out.println(getNombre() + " está enseñando a un aprendiz.");
    }
}
