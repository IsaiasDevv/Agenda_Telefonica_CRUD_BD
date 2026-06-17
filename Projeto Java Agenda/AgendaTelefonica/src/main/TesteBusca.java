package main;

import dao.ContatoDAO;
import model.Contato;

public class TesteBusca {

    public static void main(String[] args) {

        ContatoDAO dao = new ContatoDAO();

        Contato contato = dao.buscarContato("João");

        if (contato != null) {

            System.out.println("Contato encontrado:");
            System.out.println(contato);

        } else {

            System.out.println("Contato não encontrado.");
        }
    }
}