package br.com.EnventoNoSitio.usuarioservice.model;

import java.util.Date;

public class Evento {

    private Long id;
    private String nomeEvento;
    private Date dataCriacao;
    private Long idCliente;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Evento(Long id, String nomeEvento, Date dataCriacao, Long idCliente) {
        this.id = id;
        this.nomeEvento = nomeEvento;
        this.dataCriacao = dataCriacao;
        this.idCliente = idCliente;
    }
}
