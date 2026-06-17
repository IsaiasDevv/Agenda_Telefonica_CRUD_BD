package service;

import java.util.List;

import dao.ContatoDAO;
import model.Contato;

public class AgendaTelefonica {

    private ContatoDAO contatoDAO;

    public AgendaTelefonica() {
        contatoDAO = new ContatoDAO();
    }

    public void adicionarContato(Contato contato) {
        contatoDAO.adicionarContato(contato);
    }

    public Contato buscarContato(String nome) {
        return contatoDAO.buscarContato(nome);
    }

    public List<Contato> listarContatos() {
        return contatoDAO.listarContatos();
    }

    public void atualizarContato(Contato contato) {
        contatoDAO.atualizarContato(contato);
    }

    public void removerContato(int id) {
        contatoDAO.removerContato(id);
    }
}