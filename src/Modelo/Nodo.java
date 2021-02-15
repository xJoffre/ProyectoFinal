/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Usuario iTC
 */
public class Nodo implements Serializable {
    private String NombreTxt;
    private Actividades A;
    private Nodo Sig;

    public String getNombreTxt() {
        return NombreTxt;
    }

    public void setNombreTxt(String NombreTxt) {
        this.NombreTxt = NombreTxt;
    }

       
    
    public Actividades getA() {
        return A;
    }

    public void setA(Actividades A) {
        this.A = A;
    }

    public Nodo getSig() {
        return Sig;
    }

    public void setSig(Nodo Sig) {
        this.Sig = Sig;
    }

}
