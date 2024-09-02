package model;

public class Conta {

    //Atributos
    private final int agencia;
    private final int numero;
    private double saldo;
    private final String tipoConta;
    private double rendimentoJuros;
    private final Banco banco;

    //Construtor
        //Corrente
    public Conta(int agencia, int numero, double saldo, String tipoConta, Banco banco){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.banco = banco;
    }
        //Poupança
    public Conta(int agencia, int numero, double saldo, String tipoConta, double rendimentoJuros, Banco banco){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.rendimentoJuros = rendimentoJuros;
        this.banco = banco;
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

    //Métodos abstratos
    public double sacar(double saque){

        setSaldo(saldo - saque);

        System.out.println("Saldo atual: R$" + saldo);

        return saque;
    }

    public double depositar(double deposito){

        setSaldo(saldo + deposito);

        System.out.println("Valor depositado com sucesso: R$" + deposito);

        return saldo;
    }

    public void transferir(Conta contaDestino, double saldoTransferir){

        setSaldo(saldo - saldoTransferir);

        //Transferir pra outra conta
        contaDestino.setSaldo(contaDestino.saldo + saldoTransferir);
        System.out.println("Valor transferido: R$" + saldoTransferir);
        System.out.println("Conta destino: ");
        contaDestino.exibirInfoConta();

    }

    public void mostrarSaldoAtual(){
        System.out.println("Saldo atual: R$" + saldo);
    }


    public double conferirExtrato(){


        return saldo;
    }

    //Exibir info da conta
    public void exibirInfoConta(){
        System.out.println("Exibindo informações da conta: ");
            //Dividir entre exibir info da conta corrente e da conta poupança
        System.out.println("Número da agência: " + agencia);
        System.out.println("Número da conta: " + numero);
        System.out.println("Tipo da conta: " + tipoConta);
        banco.exibirInfoBanco();
    }

    //Criar nova conta
    public void criarNovaConta(){

    }


}
