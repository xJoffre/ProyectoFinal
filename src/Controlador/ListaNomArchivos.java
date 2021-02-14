/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Nodo;
import java.io.Serializable;

/**
 *
 * @author Usuario iTC
 */
public class ListaNomArchivos implements Serializable{
      
     private Nodo Inicio;
    
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
        Nodo Aux = Inicio;

        while (Aux != null) {
            c++;
            Aux = Aux.getSig();
        }
        return c;
    }
        public void Agregar(String Dato) {
      Nodo Nuevo = new Nodo();
      Nuevo.setNombre(Dato);
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
        
        public String buscar (String Nombre){
        Nodo Aux = Inicio;

        while (!Aux.getNombre().equals(Nombre)) {
            Aux = Aux.getSig();
        }
        
        return Aux.getNombre();
        }
        
}
