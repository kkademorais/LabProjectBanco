package model;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero, String tipoConta, Banco banco){
        super(agencia, numero, tipoConta, banco);
    }

    @Override
    public int getAgencia() {
        return super.getAgencia();
    }
    @Override
    public int getNumero() {
        return super.getNumero();
    }
    @Override
    public double getSaldo() {
        return super.getSaldo();
    }
    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }

    //Override dos métodos herdados
    @Override
    public double conferirExtrato() {
        return super.conferirExtrato();
    }
    @Override
    public double sacar(double saque) {
        return super.sacar(saque);
    }
    @Override
    public double depositar(double deposito) {
        return super.depositar(deposito);
    }
    @Override
    public void transferir(Conta contaDestino, double saldoTransferir) {
        super.transferir(contaDestino, saldoTransferir);
    }

    @Override
    public void exibirInfoConta() {
        super.exibirInfoConta();
    }
}
