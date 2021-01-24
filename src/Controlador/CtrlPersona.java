/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;

/**
 *
 * @author Usuario iTC
 */
public class CtrlPersona {
    
    public Alumno CrearAlumno(String Nombre, String Apellido, String Correo, String Celular){
        Alumno p = new Alumno();
        p.setNombre(Nombre);
        p.setApellido(Apellido);
        p.setCorreo(Correo);
        p.setCelular(Celular);
        return p;
    }
}
