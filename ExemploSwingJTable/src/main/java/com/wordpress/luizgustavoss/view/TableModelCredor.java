package com.wordpress.luizgustavoss.view;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.wordpress.luizgustavoss.model.Credor;

/**
 *
 * @author Luiz Gustavo
 */
public class TableModelCredor extends AbstractTableModel{
    
	private static final long serialVersionUID = 1L;
	
	private List<Credor> credores;
    

    public TableModelCredor(List<Credor> credores) {
        
        this.credores = credores;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        
        Credor umCredor = credores.get(rowIndex);
        
        switch(columnIndex){            
            case 0: return umCredor.getNome();
            case 1: return umCredor.getDocumento();
        }
        return null;       
    }
    
    public int getRowCount(){        
        return credores.size();
    }
    
    public int getColumnCount(){
        return 2;
    }
    
    public Credor getValues(int rowIndex){
        return credores.get(rowIndex);
    }
    
}
