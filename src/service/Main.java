package service;

import model.Banco;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Instanciar:
            //Banco -> Cliente -> Conta
        System.out.println("*Registrando Banco*");
        Banco banco1 = new Banco();
        System.out.println("Digite o nome do banco a ser registrado: ");






        System.out.println("*Registrando Conta Bancária*");
        int agenciaConta;
        int numeroConta;
        double saldoConta;
        String tipoConta;
        double rendimentoJurosConta;
        System.out.println("Digite o número da agência do banco vinculado: ");
        agenciaConta = scanner.nextInt();
        System.out.println("Digite o número da conta: ");
        numeroConta = scanner.nextInt();
        saldoConta = 0;
        System.out.println("Tipos de conta disponíveis: ");
        System.out.println("Conta Corrente");
        System.out.println("Conta Poupança");
        System.out.println("Digite o tipo da conta desejada: ");
        tipoConta = scanner.nextLine();
        //Pegar o valor do rendimento dos juros do banco vinculado
        rendimentoJurosConta = banco1.getRendimentoJuros();

        //ContaCorrente conta1 = new ContaCorrente(agenciaConta, numeroConta, saldoConta, tipoConta);
        //ContaPoupanca conta1 = new ContaPoupanca(agenciaConta, numeroConta, saldoConta, tipoConta, rendimentoJurosConta);






    }
}
