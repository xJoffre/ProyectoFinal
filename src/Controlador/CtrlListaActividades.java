/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Actividades;
import Modelo.Nodo;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario iTC
 */
public class CtrlListaActividades implements Serializable {

    private Nodo Inicio;

    public void Lista() {
        Inicio = null;
    }

    //Verificar si esta vacia
    public boolean esVacia() {
        return Inicio == null;
    }

    public int tamaño() {
        int c = 0;
        Nodo Aux = Inicio;

        while (Aux != null) {
            c++;
            Aux = Aux.getSig();
        }
        return c;
    }

    public void Agregar(Actividades A) {
        Nodo Nuevo = new Nodo();
        Nuevo.setA(A);
        if (esVacia()) {
            //Si la lista esta vacia agg el nodo como el primero
            Inicio = Nuevo;
        } else {
            //Agg los nodos al final uno tras otro
            Nodo aux = Inicio;
            //Recorre la lista
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(Nuevo);
        }
    }

    public Actividades ObtenerDato(int x) {
        Actividades Dato = null;
        if (esVacia() == false && x >= 0) {
            Nodo Nuevo = Inicio;
            for (int i = 0; i < x; i++) {
                Nuevo = Nuevo.getSig();
                if (Nuevo == null) {
                    break;
                }
            }
            Dato = (Nuevo != null) ? Nuevo.getA() : null;

        }
        return Dato;
    }

    public void Mostrar() {
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            Nodo Aux = Inicio;

            while (Aux != null) {
                System.out.println(Aux.getA().toString());
                Aux = Aux.getSig();
            }
        }
    }

    public void insertar(Actividades dato, int pos) {
        Nodo Aux = Inicio;
        int i = 0;
        while (i < pos) {
            Aux = Aux.getSig();
            i++;
        }
        Aux.setA(dato);
    }

    /**
     *
     * @param Nombre
     * @return
     */
    public boolean Buscar(String Nombre) {
        if (esVacia()) {
            System.out.println("Lista Vacia");
        } else {
            Nodo Aux = Inicio;

            while (Aux != null) {
                if (Aux.getA().getNombre().equals(Nombre)) {
                    return true;
                }
                Aux = Aux.getSig();
            }
        }
        return false;
    }

    public double Promedio(String Nombre) {
        double P = 0.0;
        int c;
        c = 0;
        if (esVacia()) {
            System.out.println("Lista Vacia");
        } else {
            Nodo Aux = Inicio;
            while (Aux != null) {
                if (Aux.getA().getTipo().equals(Nombre)) {
                    c++;
                    P = P + Aux.getA().getNota();
                }
                Aux = Aux.getSig();
            }
        }
        return P / c;
    }

}
