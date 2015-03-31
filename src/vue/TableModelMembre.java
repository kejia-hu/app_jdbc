/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Membre;
import model.RegistreMembre;

/**
 * TP1_JDBC
 * Cours 821
 * @author 1495636 Kejia HU
 * Date:2015-02-26
 */

public class TableModelMembre extends AbstractTableModel{
    private List<Membre> liste;
    //private String[] columnNames = {"Code membre", "Nom", "Prenom","Adresse","Statut","Revenul annuel"};
    private String[] columnNames = {"Code membre", "Nom", "Prenom"};
    
    public TableModelMembre(List<Membre> liste) {
        this.liste = liste;
    }

        public String getColumnName(int column) {
        return columnNames[column];
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return liste.size();
    }

//    public Object getValueAt(int rowIndex, int columnIndex) {
//        if(columnIndex==0){
//            return liste.get(rowIndex).getCodeMembre();
//        }
//        else if(columnIndex==1){
//            return liste.get(rowIndex).getNom();
//        }else if(columnIndex==2){
//            return liste.get(rowIndex).getPrenom();
//        }else if(columnIndex==3){
//            return liste.get(rowIndex).getAdresse();
//        }else if(columnIndex==4){
//            return liste.get(rowIndex).getStatut();
//        }
//        else if(columnIndex==5){
//            return liste.get(rowIndex).getRevenue_annuel();
//        }
//        return null;
//    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex==0){
            return liste.get(rowIndex).getCodeMembre();
        }else if(columnIndex==1){
            return liste.get(rowIndex).getNom();
        }else if(columnIndex==2){
            return liste.get(rowIndex).getPrenom();
        }
        return null;
    }
}
