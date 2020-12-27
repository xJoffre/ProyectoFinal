/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;

/**
 *
 * @author Usuario iTC
 */
public class CtrlPersona {
    
    public Persona CrearAlumno(String Nombre, String Apellido, String Correo, String Celular){
        Persona p = new Persona();
        p.setNombre(Nombre);
        p.setApellido(Apellido);
        p.setCorreo(Correo);
        p.setCelular(Celular);
        return p;
    }
}
