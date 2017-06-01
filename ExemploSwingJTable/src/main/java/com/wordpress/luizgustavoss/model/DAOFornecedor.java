package com.wordpress.luizgustavoss.model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz Gustavo
 */
public class DAOFornecedor {
    
    private List<Credor> credores;
    private Credor credor;
    

    public DAOFornecedor() {        
        credores = new ArrayList<Credor>();        
        for(int index = 0; index < 100; index++){            
            credor = new Credor();
            credor.setNome("Nome " + String.valueOf(index));
            credor.setDocumento(String.valueOf(index));            
            credores.add(credor);            
            credor = null;
        }
    }
    
    
    /**
     * Aqui na Classe DAO, os métodos cadastrar(), remover(), listar() e
     * alterar() seriam implementados com códigos SQL
     * @param credor
     * @return
     * @throws Exception
     */
    public String cadastrar(Credor credor) throws Exception{        
        String msg = "";        
        credores.add(credor);        
        return msg;
    }    
    
    

    public String remover(Credor credor) throws Exception{
        
        String msg = "";        
        for(int index = 0; index < credores.size(); index++){            
            if(credores.get(index).getDocumento().equals(credor.getDocumento())){                
                credores.remove(index);
            }
        }        
        return msg;
    }
    
    

    public List<Credor> listar() throws Exception {        
        return credores;
    }
    


    public String alterar(Credor credor)  throws Exception {
        String msg = "";        
        for(int index = 0; index < credores.size(); index++){            
            if(credores.get(index).getDocumento().equals(credor.getDocumento())){                
                credores.add(index, credor);
            }
        }        
        return msg;
    }
    
    
}
