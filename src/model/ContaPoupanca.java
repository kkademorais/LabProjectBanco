package model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero, double saldo, String tipoConta, double rendimentoJuros){
        super(agencia, numero, saldo, tipoConta, rendimentoJuros);
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
    public String getTipoConta() {
        return super.getTipoConta();
    }
    @Override
    public double getRendimentoJuros() {
        return super.getRendimentoJuros();
    }
    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }
    @Override
    public void setRendimentoJuros(double rendimentoJuros) {
        super.setRendimentoJuros(rendimentoJuros);
    }


    //Override dos métodos herdados
    @Override
    public void transferir(Conta contaDestino, double saldoTransferir) {
        super.transferir(contaDestino, saldoTransferir);
    }
    @Override
    public double depositar(double deposito) {
        return super.depositar(deposito);
    }
    @Override
    public double sacar(double saque) {
        return super.sacar(saque);
    }
    @Override
    public double conferirExtrato() {
        return super.conferirExtrato();
    }

    @Override
    public void exibirInfoConta() {
        super.exibirInfoConta();
        System.out.println("Rendimento da conta (%): " + getRendimentoJuros());
    }
}
