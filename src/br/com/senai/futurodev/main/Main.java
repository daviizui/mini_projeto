package br.com.senai.futurodev.main;

import br.com.senai.futurodev.models.Avaliacao;
import br.com.senai.futurodev.models.Localizacao;
import br.com.senai.futurodev.repositories.LocalizacaoRepository;

public class Main {
    public static void main(String[] args) {

        LocalizacaoRepository localizacaoRepository = new LocalizacaoRepository();

        Avaliacao av1 = new Avaliacao(5,4,5,3,5,5);

        System.out.println( av1.mediaTodosCriterios());

        Localizacao l1 = new Localizacao(3,"234343", 2);
        System.out.println(l1);
    }
}