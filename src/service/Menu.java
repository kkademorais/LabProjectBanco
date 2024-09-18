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
        System.out.println("[6] Verificar saldo atual");
        System.out.println("[7] Cadastrar nova conta");
        System.out.println("[0] Sair do caixa eletrônico");
        System.out.println();

        //Exibir info - Sacar - Depositar - Transferir - Conferir extrato
    }

        //Código do GPT -> primeira vez que utilizei -> me senti um bosta
    public void transferirSaldo(int agenciaOrigem, int numeroContaOrigem, String tipoContaOrigem,
                                int agenciaDestino, int numeroContaDestino, String tipoContaDestino,
                                double valorTransferir, HashMap<Integer, Banco> bancosMap) {

        // Buscar a conta de origem
        Conta contaOrigem = buscarConta(agenciaOrigem, numeroContaOrigem, tipoContaOrigem, bancosMap);
        if (contaOrigem == null) {
            System.out.println("Conta de origem não encontrada.");
            return;
        }

        // Buscar a conta de destino
        Conta contaDestino = buscarConta(agenciaDestino, numeroContaDestino, tipoContaDestino, bancosMap);
        if (contaDestino == null) {
            System.out.println("Conta de destino não encontrada.");
            return;
        }

        // Verificar se há saldo suficiente para a transferência
        if (contaOrigem.getSaldo() < valorTransferir) {
            System.out.println("Saldo insuficiente para realizar a transferência.");
            return;
        }

        // Realizar a transferência
        contaOrigem.transferir(contaDestino, valorTransferir);
        System.out.println("Transferência realizada com sucesso.");
    }

    public Conta buscarConta(int agencia, int numeroConta, String tipoConta, HashMap<Integer, Banco> bancosMap) {
        return bancosMap.values().stream()
                .filter(banco -> banco.getNumeroAgencia() == agencia)
                .flatMap(banco -> banco.getListaContas().stream())
                .filter(conta -> conta.getNumero() == numeroConta && conta.getTipoConta().equalsIgnoreCase(tipoConta))
                .findFirst()
                .orElse(null);
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
