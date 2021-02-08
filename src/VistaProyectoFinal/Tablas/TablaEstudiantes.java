/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaProyectoFinal.Tablas;


import javax.swing.table.AbstractTableModel;
import Controlador.ListaAlum;
/**
 *
 * @author Usuario iTC
 */
public class TablaEstudiantes extends AbstractTableModel {

    private ListaAlum List;

    public ListaAlum getList() {
        return List;
    }

    public void setList(ListaAlum List) {
        this.List = List;
    }

    @Override
    public int getRowCount() {
        return List.tamaño();

    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return List.ObtenerDato(rowIndex).getNombre();
            case 1:
                return List.ObtenerDato(rowIndex).getApellido();
            case 2:
                return List.ObtenerDato(rowIndex).getMateria();
            case 3:
                return List.ObtenerDato(rowIndex).getCurso();    
            case 4:
                return List.ObtenerDato(rowIndex).getCorreo();
            case 5:
                return List.ObtenerDato(rowIndex).getCelular();
            default:
                return null;
        }
    }

    public String getColumnName(int Column) {
        switch (Column) {
            case 0:
                return "Nombre";
            case 1:
                return "Apellido";
            case 2:
                return "Materia";
            case 3:
                return "Curso";
            case 4:
                return "Correo";
            case 5:
                return "Celular";    
            default:
                return null;
        }
    }

}
