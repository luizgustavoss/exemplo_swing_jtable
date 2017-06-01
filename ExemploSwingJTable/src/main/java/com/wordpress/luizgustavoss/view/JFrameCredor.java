package com.wordpress.luizgustavoss.view;
import java.awt.*;

import javax.swing.*;

import com.wordpress.luizgustavoss.controller.ControladorFornecedor;

public class JFrameCredor extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private ControladorFornecedor controller;
	
	private JTable tableFornecedor;
	
	
	
	public JFrameCredor(){
		
		super("Exemplo");
		
		controller = new ControladorFornecedor();        
        Container container = getContentPane();
        tableFornecedor = new JTable();        
        container.add(new JScrollPane(tableFornecedor));           
        inicializarTabela();
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}	
	
	
	private void inicializarTabela(){
        
        tableFornecedor.setAutoCreateColumnsFromModel(false);
        tableFornecedor.setModel(new TableModelCredor(controller.getCredores())); 
        FontMetrics fm = tableFornecedor.getFontMetrics(tableFornecedor.getFont());
        tableFornecedor.setColumnModel(new ColumnModelCredor(fm));
        tableFornecedor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);        
    }
    
    
    
    public static void main(String args[]){
    	
    	JFrameCredor frame = new JFrameCredor();
    	
    }
	
}