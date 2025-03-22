package br.com.senai.futurodev.main;

import br.com.senai.futurodev.models.AreaVerde;
import br.com.senai.futurodev.models.Avaliacao;
import br.com.senai.futurodev.models.Localizacao;
import br.com.senai.futurodev.repositories.AreaVerdeRepository;
import br.com.senai.futurodev.repositories.AvaliacaoRepository;
import br.com.senai.futurodev.repositories.LocalizacaoRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AvaliacaoRepository avaliacaoRepository = new AvaliacaoRepository();
        AreaVerdeRepository areaVerdeRepository = new AreaVerdeRepository();
        LocalizacaoRepository localizacaoRepository = new LocalizacaoRepository();

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
                    List<AreaVerde> areaVerdeLista = AreaVerdeRepository.listatodos();
                    if (areaVerdeLista.isEmpty()){
                        System.out.println("Ainda não temos áreas verdes cadastradas.");
                        System.out.println("Siga para a opção 4 (Cadastrar nova Área Verde).");
                    }
                        for (AreaVerde areaVerde : areaVerdeLista){
                        System.out.println(areaVerde.listagem());
                    }
                }
                case 2 -> {
                    System.out.println("Para iniciar o cadastro, informe o id da área verde que deseja avaliar: ");
                    int identrada =  Integer.parseInt(entrada.nextLine());
                    AreaVerde areaVerdebusca = areaVerdeRepository.buscar(identrada);
                    if (areaVerdebusca != null){
                        System.out.println("Digite uma nota de 1 a 5 para a quantidade de árvores." );
                        int quantidadeArvoreEntrada = Integer.parseInt(entrada.nextLine());
                        System.out.println("Digite uma nota de 1 a 5 para a qualidade do ar." );
                        int qualidadeArEntrada = Integer.parseInt(entrada.nextLine());
                        System.out.println("Digite uma nota de 1 a 5 para a ausência de poluição sonora." );
                        int ausenciaPoluicaoSonoraEntrada = Integer.parseInt(entrada.nextLine());
                        System.out.println("Digite uma nota de 1 a 5 para a coleta de resíduos." );
                        int coletaResiduosEntrada = Integer.parseInt(entrada.nextLine());
                        System.out.println("Digite uma nota de 1 a 5 para a facilidade de chegar com transporte público." );
                        int chegarTransportPublicoEntrada = Integer.parseInt(entrada.nextLine());
                        Avaliacao novaAvaliacao = new Avaliacao(quantidadeArvoreEntrada,qualidadeArEntrada,ausenciaPoluicaoSonoraEntrada,coletaResiduosEntrada,chegarTransportPublicoEntrada,identrada);
                        avaliacaoRepository.inserir(novaAvaliacao);
                        areaVerdebusca.getListaAvaliacoes().add(novaAvaliacao);
                        System.out.println("Avaliação registrada com sucesso.");

                    }else {
                        System.out.println("Área verde inexistente.");
                    }
                }
                case 3 -> {
                    System.out.println("Para visualizar os detalhes, informe o id da área verde que deseja: ");
                    int identrada =  Integer.parseInt(entrada.nextLine());
                    AreaVerde areaVerdebusca = areaVerdeRepository.buscar(identrada);
                    if (areaVerdebusca.getId() ==identrada){
                        System.out.println(areaVerdebusca.detalhe());
                    }
                }
                case 4 -> {
                    System.out.println("Informe as coordenadas geograficas da nova área verde, latitude e longitude:");
                    String coordenadasEntrada = entrada.nextLine();
                    Localizacao novalocalizacao = new Localizacao(coordenadasEntrada);
                    localizacaoRepository.inserir(novalocalizacao);
                    System.out.println("Informe o nome da nova área verde:");
                    String nomeEntrada = entrada.nextLine();
                    System.out.println("Informe o tipo de vegetação da área (Ex.: árvores, arbustos, grama):");
                    String tipoVegetacaoEntrada = entrada.nextLine();
                    System.out.println("Informe o horário de funcionamento");
                    String horarioFuncionamentoentrada = entrada.nextLine();
                    System.out.println("Informe as atividades dispoiníveis desta área (Ex.:caminhada, ciclismo, futebol, vôlei, quadras de areia, piquenique, parquinho infantil, pedalinho, etc.):");
                    String atividadesDisponiveisEntrada = entrada.nextLine();
                    AreaVerde novaAreaVerde = new AreaVerde(nomeEntrada,novalocalizacao,tipoVegetacaoEntrada,horarioFuncionamentoentrada,atividadesDisponiveisEntrada);
                    areaVerdeRepository.inserir(novaAreaVerde);
                    System.out.println("Área verde cadastrada com sucesso!");
                }
                case 0 ->{
                    System.out.println("Encerrando sessão.");
                }
            }
        }   while (operacao != 0);














































    }
}