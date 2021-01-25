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
public class CtrlAlumno {
    private Alumno A ;
    
    public void CrearAlumno(String M, String G, String E, String A, String C, String T ){
    Alumno Al = new Alumno ();
    Al.setNombre(E);
    Al.setApellido(A);
    Al.setCelular(T);
    Al.setCorreo(C);
    Al.setMateria(M);
    Al.setCurso(G);

    this.A = Al;
    }
    
    
}
