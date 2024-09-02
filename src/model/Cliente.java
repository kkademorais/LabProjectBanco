package model;

public class Cliente {

    private String nome;
    private Conta conta;
    //private double dinheiroFisico;


    //public Cliente(){}

    public Cliente(String nome, Conta conta){
        this.nome = nome;
        this.conta = conta; //Devo instanciar uma conta aqui?
    }

    public String getNome() {
        return nome;
    }
    public Conta getConta() {
        return conta;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    //Exibir info do cliente
    public void exibirInfoCliente(){
        System.out.println("Exibindo informações do cliente: ");
        System.out.println("Nome: " + nome);
        conta.exibirInfoConta();
    }




}
