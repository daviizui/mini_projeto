package br.com.senai.futurodev.repositories;

import br.com.senai.futurodev.models.Avaliacao;


import java.util.ArrayList;
import java.util.List;

public class AvaliacaoRepository {
    private static final List<Avaliacao>AVALIACAOES = new ArrayList<>();

    public void inserir(Avaliacao novaAvaliacao){
        novaAvaliacao.setId(AVALIACAOES.size() + 1);
    }

    public static List<Avaliacao> listaTodos(){
       List<Avaliacao> listaTodos = new ArrayList<>(AVALIACAOES);
        return listaTodos;
    }

    public Avaliacao buscar(int idAvaliacao){
        for (Avaliacao avaliacao : AVALIACAOES) {
            if (idAvaliacao == avaliacao.getId()){
                return avaliacao;
            }
        }
        return null;
    }

}
