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
public class Actividades implements Serializable{
    
    private String Nombre;
    private String Tema;
    private String Tipo;
    private String Estado; // Entrgado, no entregado , Di pueba, no dio prueba
    private Double Nota; //
    private String obervaciobes; 

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Double getNota() {
        return Nota;
    }

    public void setNota(Double Nota) {
        this.Nota = Nota;
    }

    public String getObervaciobes() {
        return obervaciobes;
    }

    public void setObervaciobes(String obervaciobes) {
        this.obervaciobes = obervaciobes;
    }

   
    
           
}
