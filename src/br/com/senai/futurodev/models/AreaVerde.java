package br.com.senai.futurodev.models;

import br.com.senai.futurodev.repositories.AvaliacaoRepository;

import java.util.ArrayList;
import java.util.List;

public class AreaVerde {
    private int id;
    private String nome;
    private Localizacao localizacao = new Localizacao();
    private String tipoDeVegetacao;
    private String horarioFuncionamento;
    private String atividadesDisponiveis;
    private List<Avaliacao> listaAvaliacoes = new ArrayList<>();

    public AreaVerde(String nome, Localizacao localizacao, String tipoDeVegetacao, String horarioFuncionamento, String atividadesDisponiveis) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tipoDeVegetacao = tipoDeVegetacao;
        this.horarioFuncionamento = horarioFuncionamento;
        this.atividadesDisponiveis = atividadesDisponiveis;
    }

    public AreaVerde() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public String getTipoDeVegetacao() {
        return tipoDeVegetacao;
    }

    public void setTipoDeVegetacao(String tipoDeVegetacao) {
        this.tipoDeVegetacao = tipoDeVegetacao;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getAtividadesDisponiveis() {
        return atividadesDisponiveis;
    }

    public void setAtividadesDisponiveis(String atividadesDisponiveis) {
        this.atividadesDisponiveis = atividadesDisponiveis;
    }

    public List<Avaliacao> getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    public void setListaAvaliacoes(List<Avaliacao> listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }

    public double mediaTodasAvaliacoes(){
        if (listaAvaliacoes.isEmpty()){
            return 0.0;
        }
        double media = 0.0;
        for (Avaliacao avaliacao : listaAvaliacoes){
            media += avaliacao.mediaTodosCriterios();
        }
        return media / listaAvaliacoes.size();
    }

    public String listagem(){
        return "Área Verde: { " +
                "nome: " + this.nome + " " +
                ", tipo vegetação: " + this.tipoDeVegetacao + " " +
                ", média das avaliações: " + mediaTodasAvaliacoes() + " " +
                ", id:" + this.id + " " +
                "}";
    }


    public String detalhe() {
        return "Área Verde: {" +
                "id: " + id + " " +
                ", nome: " + nome + " " +
                ", localizacao: " + localizacao + " " +
                ", tipoDeVegetacao: " + tipoDeVegetacao + " " +
                ", horarioFuncionamento: " + horarioFuncionamento + " " +
                ", atividadesDisponiveis: " + atividadesDisponiveis +   " " +
                "}";
    }
}
