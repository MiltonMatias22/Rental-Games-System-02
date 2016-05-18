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
public class Jogo {
    private Integer idJogo;
    private String nomeJogo;
    private String categoriaJogo;
    private String fabricanteJogo;
    private String anoLancamentoJogo;
    private Integer statusJogo;
    private String dataCadastro;
    private double valorAluguelJogo;
    private String ExemplaresJogo;

    public Jogo() {
    }

    public Jogo(Integer idJogo, String nomeJogo, String categoriaJogo,
            String fabricanteJogo, String anoLancamentoJogo, Integer statusJogo,
            String dataCadastro, double valorAluguelJogo, String ExemplaresJogo) {
        this.idJogo = idJogo;
        this.nomeJogo = nomeJogo;
        this.categoriaJogo = categoriaJogo;
        this.fabricanteJogo = fabricanteJogo;
        this.anoLancamentoJogo = anoLancamentoJogo;
        this.statusJogo = statusJogo;
        this.dataCadastro = dataCadastro;
        this.valorAluguelJogo = valorAluguelJogo;
        this.ExemplaresJogo = ExemplaresJogo;
    }

    public Integer getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(Integer idJogo) {
        this.idJogo = idJogo;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public String getCategoriaJogo() {
        return categoriaJogo;
    }

    public void setCategoriaJogo(String categoriaJogo) {
        this.categoriaJogo = categoriaJogo;
    }

    public String getFabricanteJogo() {
        return fabricanteJogo;
    }

    public void setFabricanteJogo(String fabricanteJogo) {
        this.fabricanteJogo = fabricanteJogo;
    }

    public String getAnoLancamentoJogo() {
        return anoLancamentoJogo;
    }

    public void setAnoLancamentoJogo(String anoLancamentoJogo) {
        this.anoLancamentoJogo = anoLancamentoJogo;
    }

    public Integer getStatusJogo() {
        return statusJogo;
    }

    public void setStatusJogo(Integer statusJogo) {
        this.statusJogo = statusJogo;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    
    public String getExemplaresJogo() {
        return ExemplaresJogo;
    }

    public void setExemplaresJogo(String ExemplaresJogo) {
        this.ExemplaresJogo = ExemplaresJogo;
    }

    public double getValorAluguelJogo() {
        return valorAluguelJogo;
    }

    public void setValorAluguelJogo(double valorAluguelJogo) {
        this.valorAluguelJogo = valorAluguelJogo;
    }

   
}
