package com.hoteldog.hoteldog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import static com.hoteldog.hoteldog.ClasseComOsMetodos.*;

public class DogScanner {

    static Logger log = LoggerFactory.getLogger(DogScanner.class);

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {


        imprimirMenu();
        int opcao = scn.nextInt();
        scn.nextLine();
        while (opcao != 0) {
            if (opcao == 1) {
                inserirCachorro();
            } else if (opcao == 2) {
                buscarCachorro();
            } else if (opcao == 3) {
                excluirCachorro();
            } else if (opcao == 4) {
                atualizarCachorro();
            }
            else if (opcao == 98){
                preCarregarBancoDeDados();
            }
            else if (opcao == 99) {
                imprimirBancoDeDados();
            } else {
                log.info("Opção {} não encontrada", opcao);
            }
            System.out.println();
            imprimirMenu();
            opcao = scn.nextInt();
            scn.nextLine();
        }
    }


}
