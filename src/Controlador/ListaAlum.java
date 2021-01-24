/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.NodoAlum;
import Modelo.Alumno;

/**
 *
 * @author Usuario iTC
 */
public class ListaAlum {
    private NodoAlum Inicio;
    
    //Constructor
    public void Lista(){
        Inicio = null;
    }
    //Verificar si esta vacia
    public boolean esVacia(){
        return Inicio==null;
    }
    public void Agregar(Alumno p){
        NodoAlum NuevoAlum = new NodoAlum();
        NuevoAlum.setAlum(p);
        if(esVacia()){
            //Si la lista esta vacia agg el nodo como el primero
            Inicio = NuevoAlum;
        }else{
            //Agg los nodos al final uno tras otro
            NodoAlum aux = Inicio;
            //Recorre la lista
            while(aux.getSig()!= null){
                aux = aux.getSig();
            }
            aux.setSig(NuevoAlum);
        }
        
    }
    
    
}
