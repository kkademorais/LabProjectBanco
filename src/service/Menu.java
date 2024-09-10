package service;

import model.Banco;
import model.Cliente;
import model.Conta;

import java.util.*;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;

public class Menu {

    public Scanner criarScanner(){
        return new Scanner(System.in).useLocale(Locale.US);
    }

    //Métodos
    public void exibirOpcoes(){
        System.out.println("[1] Exibir informações da sua conta");
        System.out.println("[2] Sacar");
        System.out.println("[3] Depositar");
        System.out.println("[4] Transferir");
        System.out.println("[5] Conferir extrato");
        System.out.println("[0] Sair do caixa eletrônico");
        System.out.println();

        //Exibir info - Sacar - Depositar - Transferir - Conferir extrato
    }

    public void buscarContaDestinoTransferencia(int agenciaDestino, int numeroContaDestino, String tipoContaDestino, HashMap<Integer, Banco> bancosMap){


        for(int i = 0; i < bancosMap.size(); i++){
            if(agenciaDestino == bancosMap.values().iterator().next().getNumeroAgencia()){
                if(numeroContaDestino == bancosMap.values().iterator().next().getListaContas().iterator().next().getNumero()){
                    if(tipoContaDestino.equalsIgnoreCase(bancosMap.values().iterator().next().getListaContas().iterator().next().getTipoConta())){
                        System.out.println("Conta encontrada! ");
                        //Conta contaDestino =
                        //bancosMap.values().iterator().next().getListaContas()[i];
                    }
                }
            }
        }


    }




}
