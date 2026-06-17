package main;

import dao.ContatoDAO;
import model.Contato;

public class TesteAtualizacao {

    public static void main(String[] args) {

        ContatoDAO dao = new ContatoDAO();

        Contato contato = new Contato(
                1,
                "João Atualizado",
                "(62)99999-9999",
                "joao@email.com"
        );

        dao.atualizarContato(contato);
    }
}