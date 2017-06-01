package com.wordpress.luizgustavoss.view;
import java.awt.FontMetrics;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Luiz Gustavo
 *
 */
public class ColumnModelCredor extends DefaultTableColumnModel{

	private static final long serialVersionUID = 1L;

	public ColumnModelCredor(FontMetrics fm) {
            
            int digito = fm.stringWidth("0");
            int letra = fm.stringWidth("M");
            addColumn(criaColuna(0, 100 * letra, fm, true, "Nome/Razão Social"));
            addColumn(criaColuna(1, 20 * digito, fm, false, "Documento"));          
    }
    
    private TableColumn criaColuna(int columnIndex, int largura, FontMetrics fm, boolean resizable, String titulo){
        
        int larguraTitulo = fm.stringWidth(titulo + "  ");
        if (largura < larguraTitulo){
            largura = larguraTitulo;            
        }
        
        TableColumn col = new TableColumn(columnIndex);
        col.setCellRenderer(new CellRenderer());
        col.setHeaderRenderer(null);
        col.setHeaderValue(titulo);
        col.setPreferredWidth(largura);
        if(!resizable){
            
            col.setMaxWidth(largura);
            col.setMinWidth(largura);
        }
        col.setResizable(resizable);
        return col;        
    }    
}
