package com.poli.safehouse.safehouse;

import java.util.Date;

public class PedidoAutenticacao {
    private Integer id;
    private Condominio condominio;
    private Usuario usuario;
    private Date data;
    private Integer idUser;
    private Integer idCond;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdCond() {
        return idCond;
    }

    public void setIdCond(Integer idCond) {
        this.idCond = idCond;
    }
}
