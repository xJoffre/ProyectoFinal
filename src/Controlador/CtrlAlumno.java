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
    
    public void CrearAlumno( String E, String A, String C, String T, String Co ){
    Alumno Al = new Alumno ();
    Al.setNombre(E);
    Al.setApellido(A);
    Al.setCelular(T);
    Al.setCorreo(C);
    Al.setCodigo(Co);

    this.A = Al;
    }

    public Alumno getA() {
        return A;
    }

    public void setA(Alumno A) {
        this.A = A;
    }
    
    
}
