package model;

import java.util.ArrayList;

public interface BancoInterface {

    //Atributos -> public - static - final

    String nome = "";
    double rendimentoJuros = 0;
    int numeroAgencia = 0;
    ArrayList<Cliente> listaClientes = null;

    //Construtor -> não tem -> não tem capacidade de criar objetos


    //Métodos -> abstract - public
    void registrarCliente(Cliente clienteAdd);


}
