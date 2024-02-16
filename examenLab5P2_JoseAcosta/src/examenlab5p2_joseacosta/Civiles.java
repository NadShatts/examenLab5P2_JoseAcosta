/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_joseacosta;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author josed
 */
public class Civiles extends Usuarios {
    
    
    ArrayList<Tramites> tramites = new ArrayList();

    public Civiles() {
    }

    
    public Civiles(String nombre, String apellido, String contraseña, Date fechaNacimiento, String sexo, String departamento, String numeroIdentidad) {
        super(nombre, apellido, contraseña, fechaNacimiento, sexo, departamento, numeroIdentidad);
    }

}
