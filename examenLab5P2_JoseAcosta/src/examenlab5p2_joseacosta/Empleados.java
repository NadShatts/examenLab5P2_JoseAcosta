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
public class Empleados extends Usuarios {
    
    String carrera;
    String puestoLaboral;
    int años;

    public Empleados() {
    }

    public Empleados(String carrera, String puestoLaboral, int años) {
        this.carrera = carrera;
        this.puestoLaboral = puestoLaboral;
        this.años = años;
    }

    public Empleados(String carrera, String puestoLaboral, int años, String nombre, String apellido, String contraseña, Date fechaNacimiento, String sexo, String departamento, String numeroIdentidad) {
        super(nombre, apellido, contraseña, fechaNacimiento, sexo, departamento, numeroIdentidad);
        this.carrera = carrera;
        this.puestoLaboral = puestoLaboral;
        this.años = años;
    }

    
    
    
    
}
