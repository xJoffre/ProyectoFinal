/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Actividades;

/**
 *
 * @author Usuario iTC
 */
public class CtrlActividad {
    
    private Actividades A;

    public Actividades getA() {
        return A;
    }

    public void setA(Actividades A) {
        this.A = A;
    }
    
    
    public void Crear(String N, String T, String Ti, String E, Double No, String Ob){
       A = new Actividades();
        A.setNombre(N);
        A.setTema(T);
        A.setTipo(Ti);
        A.setEstado(E);
        A.setNota(No);
        A.setObervaciobes(Ob);
    }
    
}
