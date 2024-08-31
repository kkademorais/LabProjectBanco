package model;

import java.util.ArrayList;

public class Banco {

    private String nome;
    private double rendimentoJuros;
    private ArrayList<Cliente> listaClientes;

    public Banco(String nome, double rendimentoJuros, ArrayList<Cliente> listaClientes){
        this.nome = nome;
        this.rendimentoJuros = rendimentoJuros;
        this.listaClientes = new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }
    public double getRendimentoJuros() {
        return rendimentoJuros;
    }
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

}
