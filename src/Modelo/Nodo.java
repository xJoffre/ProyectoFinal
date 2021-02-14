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
    private String Nombre;
    private Nodo Sig;
    
      public void NodoAlum(){
        this.Nombre = null;
        this.Sig = null;
    } 

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Nodo getSig() {
        return Sig;
    }

    public void setSig(Nodo Sig) {
        this.Sig = Sig;
    }
      
}
