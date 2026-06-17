package main;

import dao.ContatoDAO;
import model.Contato;

public class TesteCadastro {

    public static void main(String[] args) {

        Contato contato = new Contato(
                "Isaias",
                "62999999999",
                "isaias@gmail.com");

        ContatoDAO dao = new ContatoDAO();

        dao.adicionarContato(contato);

    }
}