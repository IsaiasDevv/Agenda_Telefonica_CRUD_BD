package main;

import dao.ContatoDAO;
import model.Contato;

public class TesteListagem {

    public static void main(String[] args) {

        ContatoDAO dao = new ContatoDAO();

        for (Contato contato : dao.listarContatos()) {

            System.out.println(contato);
            System.out.println("------------------------");
        }
    }
}