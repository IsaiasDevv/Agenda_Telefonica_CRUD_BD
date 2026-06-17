package main;

import java.sql.Connection;

import connection.Conexao;

public class TesteConexao {

    public static void main(String[] args) {

        Connection conexao =
                Conexao.conectar();

        if (conexao != null) {

            System.out.println(
                    "Conectado com sucesso!");

        }
    }
}