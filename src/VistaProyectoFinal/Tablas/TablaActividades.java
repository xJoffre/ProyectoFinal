/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaProyectoFinal.Tablas;

import Controlador.CtrlListaActividades;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario iTC
 */
public class TablaActividades extends AbstractTableModel {
     private CtrlListaActividades List;

    public CtrlListaActividades getList() {
        return List;
    }

    public void setList(CtrlListaActividades List) {
        this.List = List;
    }


    @Override
    public int getRowCount() {
        return List.tamaño();

    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return List.ObtenerDato(rowIndex).getNombre();
            case 1:
                return List.ObtenerDato(rowIndex).getTema();
            case 2:
                return List.ObtenerDato(rowIndex).getTipo(); 
            case 3:
                return List.ObtenerDato(rowIndex).getEstado();    
            case 4:
                return List.ObtenerDato(rowIndex).getNota();
            case 5:
                return List.ObtenerDato(rowIndex).getObervaciobes();
            default:
                return null;
        }
    }

    public String getColumnName(int Column) {
        switch (Column) {
            case 0:
                return "Nombre";
            case 1:
                return "Tema";
            case 2:
                return "Tipo";
            case 3:
                return "Estado";
            case 4:
                return "Nota";
            case 5:
                return "Observacion";    
            default:
                return null;
        }
    } 
}
