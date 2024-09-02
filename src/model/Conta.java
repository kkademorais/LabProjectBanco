package model;

import java.util.HashMap;

public class Conta {

    //Atributos
    private final int agencia;
    private final int numero;
    private double saldo;
    private final String tipoConta;
    private double rendimentoJuros;
    private final Banco banco;
    private HashMap<Integer, HashMap<String, HashMap<Double, Double>>> historicoTransacoes;
    private HashMap<String, HashMap<Double, Double>> transacaoUnitaria;
    private HashMap<Double, Double> processoTransacao;
    private int indexTransacoes;

    //Construtor
        //Corrente
    public Conta(int agencia, int numero, double saldo, String tipoConta, Banco banco){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.banco = banco;
        this.historicoTransacoes = new HashMap<>();
        this.transacaoUnitaria = new HashMap<>();
        this.processoTransacao = new HashMap<>();
        this.indexTransacoes = 0;
    }
        //Poupança
    public Conta(int agencia, int numero, double saldo, String tipoConta, double rendimentoJuros, Banco banco){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.rendimentoJuros = rendimentoJuros;
        this.banco = banco;
        this.historicoTransacoes = new HashMap<>();
        this.transacaoUnitaria = new HashMap<>();
        this.processoTransacao = new HashMap<>();
        this.indexTransacoes = 0;
    }

    //Métodos
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public double getRendimentoJuros() {
        return rendimentoJuros;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setRendimentoJuros(double rendimentoJuros) {
        this.rendimentoJuros = rendimentoJuros;
    }
    public int getIndexTransacoes() {
        return indexTransacoes;
    }
    public void setIndexTransacoes(int indexTransacoes) {
        this.indexTransacoes = indexTransacoes;
    }

    //Métodos abstratos
    public double sacar(double saque){

        setSaldo(saldo - saque);

        System.out.println("Saldo atual: R$" + saldo);

        processoTransacao.put(saque, saldo);
        transacaoUnitaria.put("Saque", processoTransacao);
        indexTransacoes++;
        historicoTransacoes.put(indexTransacoes, transacaoUnitaria);


        return saque;
    }

    public double depositar(double deposito){

        setSaldo(saldo + deposito);

        System.out.println("Valor depositado com sucesso: R$" + deposito);


        processoTransacao.put(deposito, saldo);
        transacaoUnitaria.put("Deposito", processoTransacao);
        indexTransacoes++;
        historicoTransacoes.put(indexTransacoes, transacaoUnitaria);


        return saldo;
    }

    public void transferir(Conta contaDestino, double saldoTransferir){

        setSaldo(saldo - saldoTransferir);

        //Transferir pra outra conta
        contaDestino.setSaldo(contaDestino.saldo + saldoTransferir);
        System.out.println("Valor transferido: R$" + saldoTransferir);
        System.out.println("Conta destino: ");
        contaDestino.exibirInfoConta();

        processoTransacao.put(saldoTransferir, saldo);
        transacaoUnitaria.put("Transferencia", processoTransacao);
        indexTransacoes++;
        historicoTransacoes.put(indexTransacoes, transacaoUnitaria);

    }

    public void mostrarSaldoAtual(){
        System.out.println("Saldo atual: R$" + saldo);
    }


    public double conferirExtrato(){

        //private HashMap<Integer, HashMap<String, HashMap<Double, Double>>> historicoTransacoes;
        //private HashMap<String, HashMap<Double, Double>> transacaoUnitaria;
        //private HashMap<Double, Double> processoTransacao;


        System.out.println("Exibindo extrato bancário: ");

            //Integer index: historicoTransacoes.keySet()
        for(int index = 0; index < historicoTransacoes.keySet().size(); index++){
            //System.out.println("Número da transação: " + historicoTransacoes.get(index));

            System.out.println("Número da transação: " + historicoTransacoes.keySet().toArray()[index]);


            System.out.println("Tipo da transação: " + transacaoUnitaria.keySet().toArray()[index]);
            //System.out.println("Tipo da transação: " + historicoTransacoes.get(index).get(index.toString())); -> Null
            //System.out.println("Tipo da transação: " + transacaoUnitaria.get(index.toString())); -> Null

            //System.out.println("Valor da transação: R$" + historicoTransacoes.get(index).get(index.toString()).get(index.doubleValue())); -> NullPointerException
            //System.out.println("Valor da transação: R$" + processoTransacao.get(index.doubleValue())); -> Null
            System.out.println("Valor da transação: R$" + processoTransacao.keySet().toArray()[index]);


            //System.out.println("Saldo no fim da transação: R$" + historicoTransacoes.get(index).get(index.toString()).get(index.doubleValue())); -> NullPointerException
            //System.out.println("Saldo no fim da transação: R$" + processoTransacao.get(index.doubleValue())); -> Null
            System.out.println("Saldo no fim da transação: R$" + processoTransacao.values().toArray()[index]);

            System.out.println();
        }



        return saldo;
    }

    //Exibir info da conta
    public void exibirInfoConta(){
        System.out.println("Exibindo informações da conta: ");
            //Dividir entre exibir info da conta corrente e da conta poupança
        System.out.println("Número da agência: " + agencia);
        System.out.println("Número da conta: " + numero);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println();
        banco.exibirInfoBanco();
    }

    //Criar nova conta
    public void criarNovaConta(){

    }


}
