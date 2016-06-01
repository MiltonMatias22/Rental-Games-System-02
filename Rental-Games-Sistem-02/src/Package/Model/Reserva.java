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
public class Reserva {
    private Integer idReserva;
    private String dataReserva;
    private String dataPrevista;
    private double valorReserva;
    private Integer idItemReserva;
    private Integer idCliente;

    public Reserva() {
    }

    public Reserva(Integer idReserva, String dataReserva, String dataPrevista, double valorReserva, Integer idItemReserva, Integer idCliente) {
        this.idReserva = idReserva;
        this.dataReserva = dataReserva;
        this.dataPrevista = dataPrevista;
        this.valorReserva = valorReserva;
        this.idItemReserva = idItemReserva;
        this.idCliente = idCliente;
    }

    

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(String dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public double getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(double valorReserva) {
        this.valorReserva = valorReserva;
    }

    public Integer getIdItemReserva() {
        return idItemReserva;
    }

    public void setIdItemReserva(Integer idItemReserva) {
        this.idItemReserva = idItemReserva;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }
    
}
