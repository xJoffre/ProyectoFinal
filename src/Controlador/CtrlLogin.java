/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Docente;

import java.io.*;
/**
 *
 * @author Usuario iTC
 */


public class CtrlLogin {
    private Docente Do;

    public void crearDocente(String N, String A, String U, String P) {
        Docente D = new Docente();
        D.setNombre(N);
        D.setApellido(A);
        D.setUser(U);
        D.setPasword(P);
        this.Do = D;
    }

    public void GuardarFichero() {
        File Archivo = new File("Credenciales.txt");
        if (!Archivo.exists()) {
            try {
                Archivo.createNewFile();
                System.out.println("Se creo el Archivo" + Archivo.getName());
//                 FileWriter Fw = new FileWriter(Archivo,true);    
//                  Fw.append(Do.getUser()+";"+ Do.getPasword());
//                  Fw.close();
                     PrintWriter Pw = new PrintWriter(Archivo,"utf-8");
                     Pw.println(Do.getUser());
                     Pw.println(Do.getPasword());
                     Pw.close();
                     
            } catch (IOException e) {
                System.out.println("Error mientras se ejecuta la instruccion");
            }
        }

    }
    
    public boolean comprobarCuenta(){
          File Archivo = new File("Credenciales.txt");
          return Archivo.exists();
    }
    
    public boolean Autenticacion(String Usuario, String Contraseña){
        int c=0;
        try {
            FileReader Fr = new FileReader("Credenciales.txt");
            BufferedReader br = new BufferedReader(Fr);
            String txt = br.readLine();
            if(txt.equals(Usuario))
                c++;
            while(txt != null){
                System.out.println("txt = "+txt);
                txt = br.readLine();
                if(!txt.equals(Contraseña)){
                    break;
                } else {
                    c++;
                    txt = null;
                  
                }
            }
            
        } catch (IOException e) {
        }
        return c==2;
    }

}
