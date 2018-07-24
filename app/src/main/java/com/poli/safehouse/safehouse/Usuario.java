package com.poli.safehouse.safehouse;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private Integer id;
    private Condominio condominio;
    private Integer condominioId;
    private EnumTipoUsuario enumTipoUsuario;
    private String nome;
    private String login;
    private String senha;
    private Boolean ativo;
    private String email;
    private List<Veiculo> veiculos = new ArrayList<Veiculo>(0);
    private List<AgendamentoVisita> agendamentoVisitas = new ArrayList<AgendamentoVisita>(0);
    private List<PedidoAutenticacao> pedidoAutenticacaos = new ArrayList<PedidoAutenticacao>(0);

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

    public Integer getCondominioId() {
        return condominioId;
    }

    public void setCondominioId(Integer condominioId) {
        this.condominioId = condominioId;
    }

    public EnumTipoUsuario getEnumTipoUsuario() {
        return enumTipoUsuario;
    }

    public void setEnumTipoUsuario(EnumTipoUsuario enumTipoUsuario) {
        this.enumTipoUsuario = enumTipoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public List<AgendamentoVisita> getAgendamentoVisitas() {
        return agendamentoVisitas;
    }

    public void setAgendamentoVisitas(List<AgendamentoVisita> agendamentoVisitas) {
        this.agendamentoVisitas = agendamentoVisitas;
    }

    public List<PedidoAutenticacao> getPedidoAutenticacaos() {
        return pedidoAutenticacaos;
    }

    public void setPedidoAutenticacaos(List<PedidoAutenticacao> pedidoAutenticacaos) {
        this.pedidoAutenticacaos = pedidoAutenticacaos;
    }
}
