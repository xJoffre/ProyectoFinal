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

    public void GuardarTxt(ListaAlum Li, String Nombre) {
        try {
            FileOutputStream fos = new FileOutputStream(Nombre+".txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Li);
            oos.close();
            
        } catch (Exception e) {
        }
    }
    
    public ListaAlum CargarTxt(String Nombre){
        try {
            FileInputStream fis = new FileInputStream(Nombre+".txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ListaAlum Aux ;
            
           Aux = (ListaAlum) ois.readObject();
           ois.close();
            System.out.println(" "+Aux.tamaño());
            return Aux;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El archivo no se ah encontrado");
        }
        return null;
    }
}
