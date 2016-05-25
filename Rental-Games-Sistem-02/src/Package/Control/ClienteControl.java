/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.Control;
import Package.Data.ClienteData;
import Package.Model.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Milton Matias
 */
public class ClienteControl {
    boolean resultato;
    public boolean salvarAtualizarRegistroCliente(Cliente cliente, int acao){
        ClienteData clienteData = new ClienteData(); 
        try {
            if(acao == 1){//salva novo registro de cliente              
             resultato = clienteData.inserirRegistro(cliente);
            }
            if(acao == 2){//atualiza registro de cliente
            resultato = clienteData.atualizar(cliente);
            }
            JOptionPane.showMessageDialog(null,"Cadastro Salvo Com Sucesso!");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
        }
        return resultato;
    }//fimalvarRegistroCliente
    
    public boolean excluirRegistroCliente(int idCliente){
        ClienteData clienteData = new ClienteData();      
        try {
            if(JOptionPane.showConfirmDialog(null,
                        "Deseja Excluir Esse Registro",
                        "Excluir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                
                if(clienteData.excluir(idCliente)){
                    resultato =  clienteData.excluir(idCliente);
                    JOptionPane.showMessageDialog(null,"Registro Excluido Com Sucesso!"+resultato);
                }
            }
         
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Excluir Registro: "+ex.getMessage());
        }
        return resultato;
    }
    
    
    
}//fim class ClienteControl
