package main;

import dao.ContatoDAO;

public class TesteRemocao {

    public static void main(String[] args) {

        ContatoDAO dao = new ContatoDAO();

        dao.removerContato(1);
    }
}