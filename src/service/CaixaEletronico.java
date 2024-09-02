package service;

import model.*;

    //Coloquei /**/ e declarei abstrato -> Retornar ao normal quando for mexer
public abstract class CaixaEletronico implements BancoInterface, ClienteInterface, ContaInterface, ContaCorrenteInterface, ContaPoupancaInterface {
/*
    //BancoInterface
    public void registrarCliente(Cliente clienteAdd){
        listaClientes.add(clienteAdd);
        System.out.println("Cliente adicionado com sucesso!");
        clienteAdd.exibirInfoCliente();
    }





    //ClienteInterface
    public void exibirInfoCliente(){
        System.out.println("Exibindo informações do cliente: ");
        System.out.println("Nome: " + nome);
        conta.exibirInfoConta();
    }



    //ContaInterface -> ContaCorrente && ContaPoupanca extends ContaInterface
    @Override
    public double sacar(double saque) {

        setSaldo(saldo - saque);

        System.out.println("Saldo atual: R$" + saldo);

        return saque;
    }

    @Override
    public double depositar(double deposito) {

        setSaldo(saldo + deposito);

        return saldo;
    }

    @Override
    public void transferir(Conta contaDestino, double saldoTransferir) {

        setSaldo(saldo - saldoTransferir);

        //Transferir pra outra conta
        contaDestino.setSaldo(contaDestino.saldo + saldoTransferir);
        System.out.println("Valor transferido: R$" + saldoTransferir);
        System.out.println("Conta destino: ");
        contaDestino.exibirInfoConta();
    }

    @Override
    public double conferirExtrato() {

        //Implementar método => Conferir caderno de anotações

        return saldo;
    }

    @Override
    public void exibirInfoConta() {
        System.out.println("Exibindo informações da conta: ");
        //Dividir entre exibir info da conta corrente e da conta poupança
        System.out.println("Número da agência: " + agencia);
        System.out.println("Número da conta: " + numero);
        System.out.println("Tipo da conta: " + tipoConta);
    }

    @Override
    public void criarNovaConta() {

    }
*/
}
