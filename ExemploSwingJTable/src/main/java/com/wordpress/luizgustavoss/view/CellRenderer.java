package com.wordpress.luizgustavoss.view;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import com.wordpress.luizgustavoss.model.Credor;

public class CellRenderer extends DefaultTableCellRenderer {

	private static final long serialVersionUID = 1L;

	public CellRenderer() {
        super();        
    }
    
    private Color getCellColor(Credor credor){
        
        // este é um teste qualquer que faço para decidir 
        // a cor da fonte de cada linha.
        // substitua por qualquer outro teste, se achar necessário
        
        int doc = Integer.parseInt(credor.getDocumento());
        
        if((doc % 2) == 0)
            return Color.GREEN;
        else
            return Color.BLACK;
    }
    
    public Component getTableCellRendererComponent(javax.swing.JTable table,
            Object value, boolean isSelected, boolean hasFocus, int row, int column){
        
        
        JLabel label = (JLabel)super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);
        
        Credor credor = ((TableModelCredor)table.getModel()).getValues(row);
        
        if (column != 0){
            label.setHorizontalAlignment(JLabel.CENTER);
        }
        if((row % 2) == 0){
            
            label.setBackground(Color.WHITE);  
            
            if(column != 0){
                label.setForeground(getCellColor(credor));   
            }
        }
        else{
        	
            label.setBackground(new Color(240, 240, 240));   

            if(column != 0){
                label.setForeground(getCellColor(credor));
            }
        }
        
        if(column == 0){
        
        	label.setHorizontalAlignment(SwingConstants.CENTER);
        }
        else if(column == 1){
        
        	label.setHorizontalAlignment(SwingConstants.LEFT);
        }
        return label;
    }
    
}