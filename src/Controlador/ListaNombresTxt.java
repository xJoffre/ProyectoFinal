/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Nodo;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario iTC
 */
public class ListaNombresTxt implements Serializable{
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
      
       public void Agregar(String Nombre) {
        Nodo Nuevo = new Nodo();
        Nuevo.setNombreTxt(Nombre);
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
        public String ObtenerDato(int x) {
        String Dato = null;
        if (esVacia() == false && x >= 0) {
            Nodo Nuevo = Inicio;
            for (int i = 0; i < x; i++) {
                Nuevo = Nuevo.getSig();
                if (Nuevo == null) {
                    break;
                }
            }
            Dato = (Nuevo != null) ? Nuevo.getNombreTxt() : null;

        }
        return Dato;
    }
        
          public void Mostrar() {
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            Nodo Aux = Inicio;

            while (Aux != null) {
                System.out.println(Aux.getNombreTxt());
                Aux = Aux.getSig();
            }
        }
    }
          public void insertar(String dato, int pos) {
        Nodo Aux = Inicio;
        int i = 0;
        while (i < pos) {
            Aux = Aux.getSig();
            i++;
        }
        Aux.setNombreTxt(dato);
    }
           public boolean Buscar (ListaAlum L, String Nombre){
           if (esVacia()) {
               System.out.println("Lista Vacia");
        } else {
            Nodo Aux = Inicio;

            while (Aux != null) {
                if(Aux.getNombreTxt().equals(Nombre)){
                    return true;
                }
                Aux = Aux.getSig();
            }
        }
       return false;
    }
}
