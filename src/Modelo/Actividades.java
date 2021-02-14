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
public class Actividades {
    
    private String Numero;
    private String Tema;
    private String Estado; // Entrgado, no entregado , Di pueba, no dio prueba
    private double Nota; //
    private String obervaciobes; 

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }



    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    public String getObervaciobes() {
        return obervaciobes;
    }

    public void setObervaciobes(String obervaciobes) {
        this.obervaciobes = obervaciobes;
    }
    
           
}
