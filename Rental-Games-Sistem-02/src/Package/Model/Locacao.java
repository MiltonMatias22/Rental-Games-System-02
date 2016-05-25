/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.Model;

/**
 *
 * @author Milton Matias
 */
public class Locacao {
    private Integer idLocacao;
    private double valorTotalLocacao;
    private String dataLocacao;
    private String dataDevolucao;
    private Integer idCliente;
    private Integer idItensLocacao;

    public Locacao() {
    }

    public Locacao(Integer idLocacao, double valorTotalLocacao, String dataLocacao, 
                   String dataDevolucao, Integer idCliente, Integer idItensLocacao) {
        this.idLocacao = idLocacao;
        this.valorTotalLocacao = valorTotalLocacao;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.idCliente = idCliente;
        this.idItensLocacao = idItensLocacao;
    }

    /**
     * @return the idLocacao
     */
    public Integer getIdLocacao() {
        return idLocacao;
    }

    /**
     * @param idLocacao the idLocacao to set
     */
    public void setIdLocacao(Integer idLocacao) {
        this.idLocacao = idLocacao;
    }

    /**
     * @return the valorTotalLocacao
     */
    public double getValorTotalLocacao() {
        return valorTotalLocacao;
    }

    /**
     * @param valorTotalLocacao the valorTotalLocacao to set
     */
    public void setValorTotalLocacao(double valorTotalLocacao) {
        this.valorTotalLocacao = valorTotalLocacao;
    }

    /**
     * @return the dataLocacao
     */
    public String getDataLocacao() {
        return dataLocacao;
    }

    /**
     * @param dataLocacao the dataLocacao to set
     */
    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    /**
     * @return the dataDevolucao
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the idCliente
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the idItensLocacao
     */
    public Integer getIdItensLocacao() {
        return idItensLocacao;
    }

    /**
     * @param idItensLocacao the idItensLocacao to set
     */
    public void setIdItensLocacao(Integer idItensLocacao) {
        this.idItensLocacao = idItensLocacao;
    }
}
