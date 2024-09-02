package model;

import java.util.ArrayList;

public class Banco {

    private String nome;
    private double rendimentoJuros;
    private int numeroAgencia;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Conta> listaContas;

    /*public Banco(){
        this.listaClientes = new ArrayList<>();
    }*/

    public Banco(String nome, double rendimentoJuros, int numeroAgencia){
        this.nome = nome;
        this.rendimentoJuros = rendimentoJuros;
        this.numeroAgencia = numeroAgencia;
        this.listaClientes = new ArrayList<>();
        this.listaContas = new ArrayList<>();
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
    public ArrayList<Conta> getListaContas() {
        return listaContas;
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
    public void setListaContas(ArrayList<Conta> listaContas) {
        this.listaContas = listaContas;
    }
    //Registrar novo cliente no banco
    public void registrarCliente(Cliente clienteAdd){
        listaClientes.add(clienteAdd);
        listaContas.add(clienteAdd.getConta());
        System.out.println("Cliente adicionado com sucesso!");
        clienteAdd.exibirInfoCliente();
    }

    //Exibindo info do banco
    public void exibirInfoBanco(){
        System.out.println("Exibindo informações do banco: ");
        System.out.println("Nome: " + nome);
        System.out.println("Taxa de rendimento dos juros (%): " + rendimentoJuros + "%");
        System.out.println("Número da agência: " + numeroAgencia);
    }



}
