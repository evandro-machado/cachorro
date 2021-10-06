package com.hoteldog.hoteldog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClasseComOsMetodos {

    static Logger log = LoggerFactory.getLogger(ClasseComOsMetodos.class);
    static int id = 4;
    static Map<Integer, Cachorro> cachorroBd = new HashMap<>();
    static Scanner scn = new Scanner(System.in);
    public static void imprimirMenu() {
        log.info("MENU DE OPCOES");
        log.info("1 -- Criar Cachorro");
        log.info("2 -- Carregar Cachorro");
        log.info("3 -- Deletar Cachorro");
        log.info("4 -- Atualizar Cachorro");
        log.info("98 -- Pre Carregar Banco de Dados");
        log.info("99 -- Imprimir banco de dados");
        log.info("0 -- Sair");
    }

    public static void inserirCachorro() {
        log.info("Insira o nome:");
        String nome = scn.nextLine();
        log.info("Insira o porte:");
        String porte = scn.nextLine();
        log.info("Insira o raca:");
        String raca = scn.nextLine();

        Cachorro cachorro = new Cachorro(id++, nome, porte, raca);

        log.info("Cachorro criado " + cachorro);
        cachorroBd.put(cachorro.getId(), cachorro);
    }

    public static void buscarCachorro() {
        log.info("Insira o id do cachorro desejado");
        int chave = scn.nextInt();
        scn.nextLine();
        Cachorro cachorroDoBanco = cachorroBd.get(chave);
        if(cachorroDoBanco == null){
            log.info("Cachorro com id {} nao encontrado", chave);
        }else {
            log.info("Cachorro encontrado: {}", cachorroDoBanco);
        }
    }

    public static void excluirCachorro() { log.info("Insira o id do cachorro a ser excluido do banco");
        int chave = scn.nextInt();
        scn.nextLine();

        Cachorro cachorroRemovido = cachorroBd.remove(chave);
        if(cachorroRemovido == null){
            log.info("Cachorro com id {} nao encontrado", chave);
        }else{
            log.info("Cachorro removido: {}", cachorroRemovido);
        }

    }

    public static void atualizarCachorro() {
        log.info("Insira o id do cachorro desejado para atualizar");
        int chave = scn.nextInt();
        scn.nextLine();
        Cachorro cachorroDoBanco = cachorroBd.get(chave);
        if(cachorroDoBanco == null){
            log.info("Cachorro com id {} nao encontrado, utilize a opcao 1 para inserir novo cachorro", chave);
        }else {
            log.info("Insira o nome:");
            String nome = scn.nextLine();
            log.info("Insira o porte:");
            String porte = scn.nextLine();
            log.info("Insira o raca:");
            String raca = scn.nextLine();

            cachorroDoBanco.setNome(nome);
            cachorroDoBanco.setPorte(porte);
            cachorroDoBanco.setRaca(raca);

            log.info("Cachorro alterado " + cachorroDoBanco);
            cachorroBd.put(cachorroDoBanco.getId(), cachorroDoBanco);
        }
    }

    public static void imprimirBancoDeDados() {
        log.info("Banco de dados:");
        cachorroBd.keySet().forEach(key -> {
            Object obj = cachorroBd.get(key);
            log.info(obj.toString());
        });
    }

    public static void preCarregarBancoDeDados(){
        Cachorro charlie = new Cachorro(1, "Charlie", "Médio", "Vira-Lata");
        Cachorro steve = new Cachorro(2, "Steve", "Grande", "Husky");
        Cachorro boni = new Cachorro(3, "Boni", "Grande", "Labrador");
        cachorroBd.put(charlie.getId(), charlie);
        cachorroBd.put(steve.getId(), steve);
        cachorroBd.put(boni.getId(), boni);
    }
}
