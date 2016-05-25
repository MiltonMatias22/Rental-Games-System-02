/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.Control;

import Package.Model.Locacao;
import Package.Data.LocacaoData;
import javax.swing.JOptionPane;
/**
 *
 * @author Milton Matias
 */
public class LocacaoControl {
    boolean resultado;
    public boolean salvarAtualizarRegistroLocacao(Locacao locacao,int acao){
        LocacaoData locacaoData = new LocacaoData();
        try {
            if(acao == 1){
             resultado = locacaoData.inserirRegistroLocacao(locacao);
              JOptionPane.showMessageDialog(null,"Locação Realizada Com Sucesso!");
            }
            if(acao == 2){
            resultado = locacaoData.atualizarRegistroLocacao(locacao);
            JOptionPane.showMessageDialog(null,"Locação Atualizada Com Sucesso!");      
            }         
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());    
        }
        return resultado;
    }//fim salvarAtualizarRegistroLocacao ()
    
    public boolean exclirRegistroLocacao(int id_Locacao){
        LocacaoData locacaodata = new LocacaoData();
        try {
            if(JOptionPane.showConfirmDialog(null, "deseja excluir esse registro?",
                           "Excluir",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
                resultado = locacaodata.excluirRegistroLocacao(id_Locacao);
                JOptionPane.showMessageDialog(null,"Registro excluido Com Sucesso!");
            }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
        }
        return resultado;
    }
}
