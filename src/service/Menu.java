package service;

import java.util.Scanner;
import java.util.Locale;

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


}
