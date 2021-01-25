/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.NodoAlum;
import Modelo.Alumno;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario iTC
 */
public class ListaAlum {

    private NodoAlum Inicio;

    //Constructor
    public void Lista() {
        Inicio = null;
    }

    //Verificar si esta vacia
    public boolean esVacia() {
        return Inicio == null;
    }

    public int tamaño() {
        int c = 0;
        NodoAlum Aux = Inicio;

        while (Aux != null) {
            c++;
            Aux = Aux.getSig();
        }
        return c;
    }

    public void Agregar(Alumno p) {
        NodoAlum NuevoAlum = new NodoAlum();
        NuevoAlum.setAlum(p);
        if (esVacia()) {
            //Si la lista esta vacia agg el nodo como el primero
            Inicio = NuevoAlum;
        } else {
            //Agg los nodos al final uno tras otro
            NodoAlum aux = Inicio;
            //Recorre la lista
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(NuevoAlum);
        }
    }

    public Alumno ObtenerDato(int x) {
        Alumno Dato = null;
        if (esVacia() == false && x >= 0) {
            NodoAlum Nuevo = Inicio;
            for (int i = 0; i < x; i++) {
                Nuevo = Nuevo.getSig();
                if (Nuevo == null) {
                    break;
                }
            }
            Dato = (Nuevo != null) ? Nuevo.getAlum() : null;

        }
        return Dato;
    }

    /*public void Eliminar(String Cod) {
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "Lista Vacia");
        } else if (Inicio.getMateria().getCodigo().equals(Cod)) {
            Inicio = Inicio.getSiguiente();
        } else {

            Nodo Actual = Inicio;
            while (Actual != null && Actual.getSiguiente().materia.getCodigo() != Cod) {
                Actual = Actual.getSiguiente();
            }
            if (Actual.getSiguiente() == null) {
                JOptionPane.showMessageDialog(null, "El elemento con el codigo " + Cod + " \nNo se encuentra en la lista");
            } else {
                Actual.setSiguiente(Actual.getSiguiente().getSiguiente());
            }

        }
    }*/
    public void Mostrar() {
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            NodoAlum Aux = Inicio;

            while (Aux != null) {
                System.out.println(Aux.getAlum().toString());
                Aux = Aux.getSig();
            }
        }
    }
    
       public void insertar(Alumno dato, int pos) {
        NodoAlum Aux = Inicio;
        int i = 0;
        while (i < pos) {
            Aux = Aux.getSig();
            i++;
        }
        Aux.setAlum(dato);
    }
      /*     //Ordenar QuickSort
      public void Ordenar(ListaAutos Li, int inf, int sup) {
        int i = inf;
        int j = sup;
        int y = (inf + sup) / 2;

        int x = Li.obtenerDato(y).getAño();

        while (i <= j) {
            while (Li.obtenerDato(i).getAño() > x) {
                i++;
            }
            while (Li.obtenerDato(j).getAño() < x) {
                j--;
            }
            if (i <= j) {
                Auto Aux = Li.obtenerDato(i);
                Li.insertar(Li.obtenerDato(j), i);
                Li.insertar(Aux, j);
                i++;
                j--;
            }
        }
        if (inf < j) {
            Ordenar(Li, inf, j);
        }
        if (i < sup) {
            Ordenar(Li, i, sup);
        }
    }*/

}
