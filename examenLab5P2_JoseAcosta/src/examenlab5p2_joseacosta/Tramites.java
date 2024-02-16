/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_joseacosta;

import java.util.Date;

/**
 *
 * @author josed
 */
public class Tramites {
    
    String nombre;
    String descripcion;
    String id;
    Date fechaTramite;

    public Tramites() {
    }

    
    public Tramites(String nombre, String descripcion, String id, Date fechaTramite) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
        this.fechaTramite = fechaTramite;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaTramite() {
        return fechaTramite;
    }

    public void setFechaTramite(Date fechaTramite) {
        this.fechaTramite = fechaTramite;
    }
    


    
    
    
}
