package service;

import model.*;

import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Instanciar:
            //Banco -> Conta -> Cliente
        System.out.println("*Registrando Banco*");
        String nomeBanco;
        double rendimentoJurosBanco;
        int numeroAgenciaBanco;
        System.out.println("Digite o nome do banco a ser registrado: ");
        nomeBanco = scanner.nextLine();
        System.out.println("Digite a taxa de rendimento dos juros ativo no banco (%): ");
        rendimentoJurosBanco = scanner.nextDouble();
        System.out.println("Digite o número de agência: ");
        numeroAgenciaBanco = scanner.nextInt();
        Banco banco1 = new Banco(nomeBanco, rendimentoJurosBanco, numeroAgenciaBanco);


        System.out.println("*Registrando Conta Bancária*");


        System.out.println("Deseja criar uma conta no último banco registrado? ");
        System.out.println("(Y) -> Criar conta nova no último banco registrado");
        System.out.println("(N) -> Registrar novo banco");
        System.out.println("Digite sua opção desejada: ");
        String opcaoBanco = scanner.next();
        //if Y => Criar conta normalmente e atrelar ao último banco registrado
        //else if N => Chamar método pra registrar novo banco e em seguida registrar conta nele




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


        System.out.println("*Registrando cliente do banco e dono da conta registrada*");
        String nomeCliente;
        System.out.println("Digite seu nome enquanto cliente: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Deseja registrar a última conta criada no seu nome? ");
        System.out.println("(Y) -> Registrar a última conta criada no seu nome");
        System.out.println("(N) -> Criar nova conta");
        System.out.println("Digite sua opção desejada: ");
        String opcaoConta = scanner.next();
        //if Y => Atrelar conta
        //else if N => Chamar método pra criar nova conta



    }
}
