/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_joseacosta;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author josed
 */
public class Usuarios {
    
    String nombre;
    String apellido;
    String contraseña;
    Date fechaNacimiento;
    String sexo;
    String departamento;
    String numeroIdentidad;

    public Usuarios() {
    }

    
    
    public Usuarios(String nombre, String apellido, String contraseña, Date fechaNacimiento, String sexo, String departamento, String numeroIdentidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.departamento = departamento;
       this.numeroIdentidad = numeroIdentidad;
    }

        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
            
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
this.numeroIdentidad = numeroIdentidad;

}
    
    public void generarIdentidadEspecial() {
        String identificadorDepartamento = "";
        String identificadorMunicipio = "";
        Random random = new Random();

        if (departamento.equals("Fransisco Morazan")) {
            identificadorDepartamento = "01";
            identificadorMunicipio = String.format("%02d", random.nextInt(28) + 1);
        } else if (departamento.equals("Cortés")) {
            identificadorDepartamento = "02";
            identificadorMunicipio = String.format("%02d", random.nextInt(12) + 1);
        } else if (departamento.equals("Comayagua")) {
            identificadorDepartamento = "03";
            identificadorMunicipio = String.format("%02d", random.nextInt(21) + 1);
        }
        String año = String.format("%04d", fechaNacimiento.getYear() + 1900);
        String digitos = String.format("%05d", random.nextInt(100000));
        numeroIdentidad = identificadorDepartamento + identificadorMunicipio + año + digitos;
    }
}

    

    

