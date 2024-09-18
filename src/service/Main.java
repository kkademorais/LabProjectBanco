package service;

import model.*;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Instanciar:
            //Banco -> Conta -> Cliente

        System.out.println("*Registrando Banco*");
            //Variáveis de transferência para instanciação
        String nomeBanco;
        double rendimentoJurosBanco;
        int numeroAgenciaBanco;

        System.out.println("Digite o nome do banco a ser registrado: ");
        nomeBanco = scanner.nextLine();
        System.out.println("Digite a taxa de rendimento dos juros ativo no banco (%): ");
        rendimentoJurosBanco = scanner.nextDouble();
        scanner.nextLine(); //Evita travamento
        System.out.println("Digite o número de agência: ");
        numeroAgenciaBanco = scanner.nextInt();
        scanner.nextLine(); //Evita travamento
        Banco banco1 = new Banco(nomeBanco, rendimentoJurosBanco, numeroAgenciaBanco);
        int indexBanco = 0; //Olhar bug que vai ser gerado -> Esse número é atualizado para todos dentro do hashmap

        //Cria hashmap para mapear todos os bancos registrados
        HashMap<Integer, Banco> bancosMap = new HashMap<>();
        bancosMap.put(indexBanco, banco1);

        /*System.out.println("Deseja criar uma conta no último banco registrado? ");
        System.out.println("(Y) -> Criar conta nova no último banco registrado");
        System.out.println("(N) -> Registrar novo banco");
        System.out.println("Digite sua opção desejada: ");
        String opcaoBanco = scanner.next();*/
        //if Y => Criar conta normalmente e atrelar ao último banco registrado
        //else if N => Chamar método pra registrar novo banco e em seguida registrar conta nele


        System.out.println();
        System.out.println("*Registrando Conta Bancária*");
        System.out.println();
            //Variáveis de transferência para instanciação
        int agenciaConta;
        int numeroConta;
        String tipoConta;
        double rendimentoJurosConta;

        //Atrela o número de agência da conta ao número de agência do banco vinculado
        agenciaConta = numeroAgenciaBanco;

        //Primeira conta = Recebe número 1
        numeroConta = 1;

        System.out.println("Tipos de conta disponíveis: ");
        System.out.println("Conta Corrente");
        System.out.println("Conta Poupança");
        System.out.println("Digite o tipo da conta desejada: ");
        tipoConta = scanner.nextLine();

        //Pegar o valor do rendimento dos juros do banco vinculado
        rendimentoJurosConta = banco1.getRendimentoJuros();

        ContaCorrente conta1 = new ContaCorrente(agenciaConta, numeroConta, tipoConta, banco1);
        //ContaPoupanca conta1 = new ContaPoupanca(agenciaConta, numeroConta, saldoConta, tipoConta, rendimentoJurosConta);

        System.out.println();
        System.out.println("*Registrando cliente do banco e dono da conta registrada*");
        String nomeCliente;
        System.out.println("Digite seu nome enquanto cliente: ");
        nomeCliente = scanner.nextLine();

        Cliente cliente1 = new Cliente(nomeCliente, conta1);
        //System.out.println("Deseja registrar a última conta criada no seu nome? ");
        //System.out.println("(Y) -> Registrar a última conta criada no seu nome");
        //System.out.println("(N) -> Criar nova conta");
        //System.out.println("Digite sua opção desejada: ");
        //String opcaoConta = scanner.next();
        //if Y => Atrelar conta
        //else if N => Chamar método pra criar nova conta

        System.out.println();
        System.out.println("*Registrando primeiro cliente ao banco!*");
        banco1.registrarCliente(cliente1);
        System.out.println();

        //Testar métodos da Conta -> depositar -> sacar
        Menu menu = new Menu();

        while(true){
            System.out.println();
            menu.exibirOpcoes();
            System.out.println("Digite a opção desejada: ");
            int opcaoMenu = scanner.nextInt();
            System.out.println();

            if(opcaoMenu == 0){ //Sair do caixa -> Interrompe programa
                return;
            }
            else if (opcaoMenu == 1){   //Exibir info da conta
                System.out.println("* Opção selecionada: Exibir informações da sua conta *");
                System.out.println();
                cliente1.exibirInfoCliente();
            }
            else if (opcaoMenu == 2){   //Saque
                System.out.println("* Opção selecionada: Realizar saque *");
                System.out.println();
                System.out.println("Insira o valor que deseja sacar: ");
                double valorSacar = scanner.nextDouble();

                if(valorSacar >= conta1.getSaldo()){
                    System.out.println("Saldo insuficiente! Necessário depósito");
                }
                else{
                    System.out.println("Dinheiro fisico: R$" + conta1.sacar(valorSacar));
                }
            }
            else if (opcaoMenu == 3){   //Depósito
                System.out.println("* Opção selecionada: Realizar depósito *");
                System.out.println();
                System.out.println("Insira o valor que deseja depositar: ");
                double valorDepositar = scanner.nextDouble();
                System.out.println("Saldo atual: R$" + conta1.depositar(valorDepositar));
            }
            else if (opcaoMenu == 4){   //Transferência
                System.out.println("* Opção selecionada: Realizar transferência *");
                System.out.println();
                System.out.println("Digite número de agência da conta de destino: ");
                int agenciaDestino = scanner.nextInt();
                System.out.println("Digite número da conta de destino: ");
                int numeroDestino = scanner.nextInt();
                scanner.nextLine(); //Evita travamento
                System.out.println("Conta de destino: Corrente ou Poupanca? ");
                String tipoContaDestino = scanner.nextLine();

                scanner.nextLine();
                System.out.println("Insira o valor que deseja transferir: ");
                double saldoTransferir = scanner.nextDouble();

                menu.transferirSaldo(conta1.getAgencia(), conta1.getNumero(), conta1.getTipoConta(), conta1.getAgencia(), numeroDestino, tipoContaDestino, saldoTransferir, bancosMap);

                //menu.buscarContaDestinoTransferencia(agenciaDestino, numeroDestino, tipoContaDestino, bancosMap);

            }
            else if (opcaoMenu == 5){
                System.out.println("* Opção selecionada: Conferir extrato bancário *");
                System.out.println();
                conta1.conferirExtrato();
            }
            else if(opcaoMenu == 6){
                System.out.println("* Opção selecionada: Verificar saldo atual *");
                System.out.println("Saldo atual: R$" + conta1.getSaldo());
            }
            else if (opcaoMenu == 7){
                scanner.nextLine();
                System.out.println("* Opção selecionada: Criar nova conta *");
                System.out.println();

                numeroConta = 2;
                rendimentoJurosConta = banco1.getRendimentoJuros();

                System.out.println("Tipos de conta disponíveis: ");
                System.out.println("Conta Corrente");
                System.out.println("Conta Poupança");
                System.out.println("Digite o tipo da conta desejada: ");
                tipoConta = scanner.nextLine();

                if(tipoConta.equalsIgnoreCase("Corrente")){
                    ContaCorrente conta2 = new ContaCorrente(agenciaConta, numeroConta, tipoConta, banco1);
                    System.out.println();
                    System.out.println("*Registrando cliente do banco e dono da conta registrada*");
                    System.out.println("Digite seu nome enquanto cliente: ");
                    nomeCliente = scanner.nextLine();
                    Cliente cliente2 = new Cliente(nomeCliente, conta2);
                    System.out.println();
                    System.out.println("*Registrando segundo cliente ao banco!*");
                    banco1.registrarCliente(cliente2);
                    System.out.println();
                }
                else if(tipoConta.equalsIgnoreCase("Poupança")){
                    ContaPoupanca conta2 = new ContaPoupanca(agenciaConta, numeroConta, tipoConta, rendimentoJurosConta, banco1);
                    System.out.println();
                    System.out.println("*Registrando cliente do banco e dono da conta registrada*");
                    System.out.println("Digite seu nome enquanto cliente: ");
                    nomeCliente = scanner.nextLine();
                    Cliente cliente2 = new Cliente(nomeCliente, conta2);
                    System.out.println();
                    System.out.println("*Registrando segundo cliente ao banco!*");
                    banco1.registrarCliente(cliente2);
                    System.out.println();
                }
            }

        }

    }
}
