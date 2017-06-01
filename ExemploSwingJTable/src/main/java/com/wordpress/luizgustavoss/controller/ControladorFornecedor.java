package com.wordpress.luizgustavoss.controller;
import java.util.List;

import com.wordpress.luizgustavoss.model.Credor;
import com.wordpress.luizgustavoss.model.DAOFornecedor;

/**
 *
 * @author Luiz Gustavo
 */
 
public class ControladorFornecedor {
    
    private DAOFornecedor daoFornecedor;
    private List<Credor> credores;
    

    public ControladorFornecedor() {     
       
        daoFornecedor = new DAOFornecedor();                
        try{
            setCredores(daoFornecedor.listar());
        }
        catch(Exception e){            
            // mensagem de erro
        }
    }
    
    

    public String cadastrar(Credor credor){        
        String success = "";        
        try{
            success = daoFornecedor.cadastrar(credor);
            setCredores(daoFornecedor.listar());
        }
        catch(Exception e){            
            success = "Erro!";
        }        
        return success;
    }
    
    

    public String excluir(Credor credor){        
        String success = "";        
        try{
            success = daoFornecedor.remover(credor);
            setCredores(daoFornecedor.listar());
        }
        catch(Exception e){            
            success = "Erro!";
        }        
        return success;
    }
    
    

    public String alterar(Credor credor){        
        String success = "";        
        try{
            success = daoFornecedor.alterar(credor);
            setCredores(daoFornecedor.listar());
        }
        catch(Exception e){            
            success = "Erro!";
        }        
        return success;
    }
    


    public List<Credor> getCredores() {
        return credores;
    }



    public void setCredores(List<Credor> credores) {
        this.credores = credores;
    }
    
}
