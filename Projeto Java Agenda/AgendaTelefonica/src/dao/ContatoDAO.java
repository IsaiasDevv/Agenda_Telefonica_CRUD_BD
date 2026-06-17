package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.Conexao;
import model.Contato;

public class ContatoDAO {

    // CREATE
    public void adicionarContato(Contato contato) {

        String sql =
                "INSERT INTO contatos (nome, telefone, email) VALUES (?, ?, ?)";

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt =
                        conn.prepareStatement(sql)
        ) {

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getTelefone());
            stmt.setString(3, contato.getEmail());

            stmt.executeUpdate();

            System.out.println();
            System.out.println("Contato cadastrado com sucesso!");

        } catch (SQLException e) {

            System.out.println();
            System.out.println("Erro ao cadastrar contato.");
            e.printStackTrace();
        }
    }

    // BUSCAR POR NOME
    public Contato buscarContato(String nome) {

        String sql =
                "SELECT * FROM contatos WHERE nome = ?";

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt =
                        conn.prepareStatement(sql)
        ) {

            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                Contato contato = new Contato();

                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setTelefone(rs.getString("telefone"));
                contato.setEmail(rs.getString("email"));

                return contato;
            }

        } catch (SQLException e) {

            System.out.println();
            System.out.println("Erro ao buscar contato.");
            e.printStackTrace();
        }

        return null;
    }

    // LISTAR TODOS
    public List<Contato> listarContatos() {

        List<Contato> contatos =
                new ArrayList<>();

        String sql =
                "SELECT * FROM contatos ORDER BY nome";

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt =
                        conn.prepareStatement(sql);
                ResultSet rs =
                        stmt.executeQuery()
        ) {

            while (rs.next()) {

                Contato contato = new Contato();

                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setTelefone(rs.getString("telefone"));
                contato.setEmail(rs.getString("email"));

                contatos.add(contato);
            }

        } catch (SQLException e) {

            System.out.println();
            System.out.println("Erro ao listar contatos.");
            e.printStackTrace();
        }

        return contatos;
    }

    // PESQUISAR POR TRECHO DO NOME
    public List<Contato> pesquisarContatos(String texto) {

        List<Contato> contatos =
                new ArrayList<>();

        String sql =
                "SELECT * FROM contatos WHERE nome LIKE ? ORDER BY nome";

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt =
                        conn.prepareStatement(sql)
        ) {

            stmt.setString(1, "%" + texto + "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Contato contato = new Contato();

                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setTelefone(rs.getString("telefone"));
                contato.setEmail(rs.getString("email"));

                contatos.add(contato);
            }

        } catch (SQLException e) {

            System.out.println();
            System.out.println("Erro ao pesquisar contatos.");
            e.printStackTrace();
        }

        return contatos;
    }

    // UPDATE
    public void atualizarContato(Contato contato) {

        String sql =
                "UPDATE contatos SET nome = ?, telefone = ?, email = ? WHERE id = ?";

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt =
                        conn.prepareStatement(sql)
        ) {

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getTelefone());
            stmt.setString(3, contato.getEmail());
            stmt.setInt(4, contato.getId());

            int linhasAfetadas =
                    stmt.executeUpdate();

            if (linhasAfetadas > 0) {

                System.out.println();
                System.out.println("Contato atualizado com sucesso!");

            } else {

                System.out.println();
                System.out.println("Contato não encontrado.");
            }

        } catch (SQLException e) {

            System.out.println();
            System.out.println("Erro ao atualizar contato.");
            e.printStackTrace();
        }
    }

    // DELETE
    public void removerContato(int id) {

        String sql =
                "DELETE FROM contatos WHERE id = ?";

        try (
                Connection conn = Conexao.conectar();
                PreparedStatement stmt =
                        conn.prepareStatement(sql)
        ) {

            stmt.setInt(1, id);

            int linhasAfetadas =
                    stmt.executeUpdate();

            if (linhasAfetadas > 0) {

                System.out.println();
                System.out.println("Contato removido com sucesso!");

            } else {

                System.out.println();
                System.out.println("Contato não encontrado.");
            }

        } catch (SQLException e) {

            System.out.println();
            System.out.println("Erro ao remover contato.");
            e.printStackTrace();
        }
    }
}