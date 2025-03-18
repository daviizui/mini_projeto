package br.com.senai.futurodev.main;

import br.com.senai.futurodev.models.Localizacao;
import br.com.senai.futurodev.repositories.LocalizacaoRepository;

public class Main {
    public static void main(String[] args) {

        LocalizacaoRepository localizacaoRepository = new LocalizacaoRepository();

        Localizacao localizacao01 = new Localizacao();

        System.out.println(localizacao01);
    }
}