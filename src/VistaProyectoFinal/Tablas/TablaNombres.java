/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaProyectoFinal.Tablas;

import Controlador.ListaNombresTxt;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario iTC
 */
public class TablaNombres extends AbstractTableModel {

    private ListaNombresTxt List;

    public ListaNombresTxt getList() {
        return List;
    }

    public void setList(ListaNombresTxt List) {
        this.List = List;
    }

    @Override
    public int getRowCount() {
     return List.tamaño();

    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return List.ObtenerDato(rowIndex);
            
            default:
                return null;
        }
    }

    public String getColumnName(int Column) {
        switch (Column) {
            case 0:
                return "Nombre";
            default:
                return null;
        }
    }
    
}
