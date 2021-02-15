/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario iTC
 */
public class CtrlTxt {
 //Guadar y Leer las listas de alumnos
    public void GuardarTxt(ListaAlum Li, String Nombre) {
        try {
            FileOutputStream fos = new FileOutputStream(Nombre+".txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Li);
            oos.close();
            
        } catch (IOException e) {
        }
    }   
    public ListaAlum CargarTxt(String Nombre){
        try {
            FileInputStream fis = new FileInputStream(Nombre+".txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ListaAlum Aux ;
            
           Aux = (ListaAlum) ois.readObject();
           ois.close();
           // System.out.println(" "+Aux.tamaño());
            return Aux;
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "El archivo no se ah encontrado");
        }
        return null;
    }
   //Guadar y Leer Nombres de Listas
        public void GuardarNombresTxt(ListaNombresTxt Li, String Nombre) {
        try {
            FileOutputStream fos = new FileOutputStream(Nombre+".txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Li);
            oos.close();
            
        } catch (IOException e) {
        }
    }
           public ListaNombresTxt CargarNombresTxt(String Nombre){
        try {
            FileInputStream fis = new FileInputStream(Nombre+".txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ListaNombresTxt Aux ;
            
           Aux = (ListaNombresTxt) ois.readObject();
           ois.close();
           // System.out.println(" "+Aux.tamaño());
            return Aux;
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "El archivo no se ah encontrado");
        }
        return null;
    }
   //Guardar y Leer Lista de Actividades
             public void GuardarListaAc(CtrlListaActividades Li, String Nombre) {
        try {
            FileOutputStream fos = new FileOutputStream(Nombre+".txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Li);
            oos.close();
            
        } catch (IOException e) {
        }
    }   
    public CtrlListaActividades CargarListaActividadeAc(String Nombre){
        try {
            FileInputStream fis = new FileInputStream(Nombre+".txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            CtrlListaActividades Aux ;
            
           Aux = (CtrlListaActividades) ois.readObject();
           ois.close();
           // System.out.println(" "+Aux.tamaño());
            return Aux;
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "El archivo no se ah encontrado");
        }
        return null;
    }
        
}
