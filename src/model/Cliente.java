package model;

public class Cliente {

    private String nome;
    private Conta conta;

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




}
