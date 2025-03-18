package br.com.senai.futurodev.repositories;
import br.com.senai.futurodev.models.Localizacao;
import java.util.ArrayList;
import java.util.List;

public class LocalizacaoRepository {
    private static final List<Localizacao> LOCALIZACOES = new ArrayList<>();

    public void inserir (Localizacao novaLocalizacao){
        novaLocalizacao.setId(LOCALIZACOES.size() + 1);
        LOCALIZACOES.add(novaLocalizacao);
    }

    public static List<Localizacao> listaTodos(){
        List<Localizacao> listaTodos = new ArrayList<>(LOCALIZACOES);
        return listaTodos;
    }

    public Localizacao buscar(int idLocalizacao){
        for (Localizacao localizacao : LOCALIZACOES) {
            if (idLocalizacao == localizacao.getId()){
                return localizacao;
            }
        }
        return null;
    }

}
