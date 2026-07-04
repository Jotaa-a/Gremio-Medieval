
package com.mycompany.gremio;
import java.util.ArrayList;
import java.util.List;

public class Gremio {
    private String nombre;
    private String ciudad;
    private int fechaFundacion;
    
    private final List<Miembro> miembros;
    private final List<Producto> productos;
    
    public Gremio(String nombre, String ciudad, int fechaFundacion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaFundacion = fechaFundacion;
        this.miembros = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public int getFechaFundacion() {
        return fechaFundacion;
    }
    
    public void setFechaFundacion(int fechaFundacion){
        this.fechaFundacion = fechaFundacion;
    }

    public List<Miembro> getMiembros() {
        return miembros;
    }
    
    public void agregarMiembro(Miembro miembro) {
        miembros.add(miembro);
        System.out.println(miembro.getNombre() + " ha sido agregado al gremio.");
    }
    
    public void eliminarMiembro(Miembro miembro) {
        if (miembros.remove(miembro)) {
            System.out.println(miembro.getNombre() + " ha sido eliminado del gremio.");
        } else {
            System.out.println("El miembro no pertenece al gremio.");
        }
    }

    public List<Miembro> listarMiembros() {
        return miembros;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println(producto.getNombre() + " ha sido agregado al gremio.");
    }

    public void eliminarProducto(Producto producto) {
        if (productos.remove(producto)) {
            System.out.println(producto.getNombre() + " ha sido eliminado del gremio.");
        } else {
            System.out.println("El producto no pertenece al gremio.");
        }
    }

    public List<Producto> listarProductos() {
        return productos;
    }
}
