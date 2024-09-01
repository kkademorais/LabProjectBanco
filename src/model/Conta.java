package model;

public class Conta {

    //Atributos
    private int agencia;
    private int numero;
    private double saldo;
    private String tipoConta;
    private double rendimentoJuros;

    //Construtor
        //Corrente
    public Conta(int agencia, int numero, double saldo, String tipoConta){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }
        //Poupança
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




    }


}
