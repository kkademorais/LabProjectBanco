package model;

public interface ContaInterface {

    //Atributos -> public - static - final
    final int agencia = 0;
    final int numero = 0;
    double saldo = 0;
    final String tipoConta = "";
    double rendimentoJuros = 0;


    //Construtor -> não tem -> não tem capacidade de criar objetos



    //Métodos -> abstract - public
    double sacar(double saque);
    double depositar(double deposito);
    void transferir(Conta contaDestino, double saldoTransferir);
    double conferirExtrato();
    void exibirInfoConta();
    void criarNovaConta();


}
