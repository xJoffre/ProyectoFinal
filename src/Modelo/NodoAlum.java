/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario iTC
 */
public class NodoAlum {
    private Alumno Alum;
    private NodoAlum Sig;    
    
    public void NodoAlum(){
        this.Alum = null;
        this.Sig = null;
    } 

    public Alumno getAlum() {
        return Alum;
    }

    public void setAlum(Alumno Alum) {
        this.Alum = Alum;
    }

    public NodoAlum getSig() {
        return Sig;
    }

    public void setSig(NodoAlum Sig) {
        this.Sig = Sig;
    }
    
}

