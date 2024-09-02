package model;

import java.util.ArrayList;

public class Banco {

    private String nome;
    private double rendimentoJuros;
    private int numeroAgencia;
    private ArrayList<Cliente> listaClientes;

    /*public Banco(){
        this.listaClientes = new ArrayList<>();
    }*/

    public Banco(String nome, double rendimentoJuros, int numeroAgencia){
        this.nome = nome;
        this.rendimentoJuros = rendimentoJuros;
        this.numeroAgencia = numeroAgencia;
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
    public int getNumeroAgencia() {
        return numeroAgencia;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRendimentoJuros(double rendimentoJuros) {
        this.rendimentoJuros = rendimentoJuros;
    }
    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    //Registrar novo cliente no banco
    public void registrarCliente(Cliente clienteAdd){
        listaClientes.add(clienteAdd);
        System.out.println("Cliente adicionado com sucesso!");
        clienteAdd.exibirInfoCliente();




    }



}
