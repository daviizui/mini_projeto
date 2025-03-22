package br.com.senai.futurodev.main;

import br.com.senai.futurodev.models.AreaVerde;
import br.com.senai.futurodev.models.Avaliacao;
import br.com.senai.futurodev.models.Localizacao;
import br.com.senai.futurodev.repositories.AreaVerdeRepository;
import br.com.senai.futurodev.repositories.AvaliacaoRepository;
import br.com.senai.futurodev.repositories.LocalizacaoRepository;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LocalizacaoRepository localizacaoRepository = new LocalizacaoRepository();
        Localizacao l1 = new Localizacao("234343", 2);
        Localizacao l2 = new Localizacao("234343", 2);
        Localizacao l3 = new Localizacao("234343", 2);
        localizacaoRepository.inserir(l1);
        localizacaoRepository.inserir(l2);
        localizacaoRepository.inserir(l3);
        //System.out.println(l1.getId());
        //System.out.println(l2.getId());
       // System.out.println(l3.getId());

        AvaliacaoRepository avaliacaoRepository = new AvaliacaoRepository();
        Avaliacao av1 = new Avaliacao(5,5,5,5,5);
        Avaliacao av2 = new Avaliacao( 3, 3, 3, 3, 3);
        Avaliacao av3 = new Avaliacao(4,4, 4,4 , 4);
        avaliacaoRepository.inserir(av2);
        avaliacaoRepository.inserir(av1);
        avaliacaoRepository.inserir(av3);
        //System.out.println(AvaliacaoRepository.listaTodos());
        //System.out.println(avaliacaoRepository.buscar(1));
       // System.out.println(avaliacaoRepository.buscar(2));
        //System.out.println(avaliacaoRepository.buscar(4));
        //System.out.println(av1.mediaTodosCriterios());

        AreaVerdeRepository areaVerdeRepository = new AreaVerdeRepository();

        AreaVerde areaVerde01 = new AreaVerde("praça01",l1, "areia", "8/20","volei");
        AreaVerde areaVerde02 = new AreaVerde("praça02", l2, "grama", "7/18", "corrida");
        AreaVerde areaVerde03 = new AreaVerde("praça02", l3, "grama", "7/18", "corrida");

        areaVerde02.getListaAvaliacoes().add(av1);
        areaVerde02.getListaAvaliacoes().add(av2);
        areaVerde02.getListaAvaliacoes().add(av3);
        System.out.println(areaVerde02.mediaTodasAvaliacoes());

        areaVerdeRepository.inserir(areaVerde01);
        areaVerdeRepository.inserir(areaVerde02);
        areaVerdeRepository.inserir(areaVerde03);

        System.out.println(areaVerde01.getLocalizacao());
        System.out.println(areaVerdeRepository.buscar(1));
        System.out.println(areaVerdeRepository.buscar(2));
        System.out.println(areaVerde01.detalhe());
        System.out.println(areaVerde03.listagem());
        System.out.println(areaVerde02.mediaTodasAvaliacoes());



        System.out.println("Bem vindo ao Projeto Mapeamento de Áreas Verdes de Joinville");
        Scanner entrada = new Scanner(System.in);
        int operacao;

        do {
            String menu = """
                    ** Digite a opção que deseja acessar: **
                    1 - Listar Áreas Verdes
                    2 - Avaliar Áreas Verdes
                    3 - Ver detalhe de uma Área Verde
                    4 - Cadastrar nova Área Verde
                    0 - Sair
                    """;
            System.out.println(menu);
            operacao = Integer.parseInt(entrada.nextLine());
            switch (operacao){
                case 1 -> {
                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 0 ->{
                    System.out.println("Encerrando sessão.");
                }
            }
        }   while (operacao != 0);














































    }
}