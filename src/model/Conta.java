package model;

public class Conta {

    //Atributos
    private int agencia;
    private int numero;
    private double saldo;
    private String tipoConta;
    private double rendimentoJuros;

    //Construtor
    public Conta(int agencia, int numero, double saldo, String tipoConta){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }
    public Conta(int agencia, int numero, double saldo, String tipoConta, double rendimentoJuros){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.rendimentoJuros = rendimentoJuros;
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
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos abstratos
    public double sacar(double saque){

        setSaldo(saldo - saque);

        return saque;
    }

    public void depositar(double deposito){

        setSaldo(saldo + deposito);

    }

    public void transferir(Conta contaDestino, double saldoTransferir){

        setSaldo(saldo - saldoTransferir);

        //Transferir pra outra conta

    }

    public double conferirExtrato(){


        return saldo;
    }


}
