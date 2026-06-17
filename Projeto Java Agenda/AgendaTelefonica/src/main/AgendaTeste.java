package main;

import java.util.Scanner;

import model.Contato;
import service.AgendaTelefonica;

public class AgendaTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AgendaTelefonica agenda = new AgendaTelefonica();

        int opcao = 0;

        do {

            System.out.println("\n==============================");
            System.out.println("      AGENDA TELEFÔNICA");
            System.out.println("==============================");
            System.out.println();
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Buscar contato");
            System.out.println("3 - Listar contatos");
            System.out.println("4 - Atualizar contato");
            System.out.println("5 - Remover contato");
            System.out.println("6 - Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            try {

                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {

                    case 1:

                        System.out.println();
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();

                        System.out.print("Telefone: ");
                        String telefone = scanner.nextLine();

                        System.out.print("Email: ");
                        String email = scanner.nextLine();

                        Contato novoContato =
                                new Contato(nome, telefone, email);

                        agenda.adicionarContato(novoContato);

                        break;

                    case 2:

                        System.out.println();
                        System.out.print("Digite o nome: ");

                        String nomeBusca =
                                scanner.nextLine();

                        Contato encontrado =
                                agenda.buscarContato(nomeBusca);

                        if (encontrado != null) {

                            System.out.println("\nContato encontrado:");
                            System.out.println();
                            System.out.println(encontrado);

                        } else {

                            System.out.println();
                            System.out.println(
                                    "Contato não encontrado.");
                        }

                        break;

                    case 3:

                        System.out.println("\nLISTA DE CONTATOS");
                        System.out.println();

                        if (agenda.listarContatos().isEmpty()) {

                            System.out.println(
                                    "Nenhum contato cadastrado.");

                        } else {

                            for (Contato contato :
                                    agenda.listarContatos()) {

                                System.out.println(contato);
                                System.out.println("------------------");
                            }
                        }

                        break;

                    case 4:

                        try {

                            System.out.println();
                            System.out.print("ID do contato: ");

                            int idAtualizar =
                                    Integer.parseInt(scanner.nextLine());

                            System.out.println();
                            System.out.print("Novo nome: ");
                            String novoNome =
                                    scanner.nextLine();

                            System.out.print("Novo telefone: ");
                            String novoTelefone =
                                    scanner.nextLine();

                            System.out.print("Novo email: ");
                            String novoEmail =
                                    scanner.nextLine();

                            Contato contatoAtualizado =
                                    new Contato(
                                            idAtualizar,
                                            novoNome,
                                            novoTelefone,
                                            novoEmail);

                            agenda.atualizarContato(
                                    contatoAtualizado);

                        } catch (NumberFormatException e) {

                            System.out.println();
                            System.out.println(
                                    "ID inválido. Digite apenas números.");
                        }

                        break;

                    case 5:

                        try {

                            System.out.println();
                            System.out.print("ID do contato: ");

                            int idExcluir =
                                    Integer.parseInt(scanner.nextLine());

                            agenda.removerContato(idExcluir);

                        } catch (NumberFormatException e) {

                            System.out.println();
                            System.out.println(
                                    "ID inválido. Digite apenas números.");
                        }

                        break;

                    case 6:

                        System.out.println();
                        System.out.println(
                                "Programa encerrado.");

                        break;

                    default:

                        System.out.println();
                        System.out.println(
                                "Opção inválida.");
                }

            } catch (NumberFormatException e) {

                System.out.println();
                System.out.println(
                        "Entrada inválida. Digite apenas números.");
            }

        } while (opcao != 6);

        scanner.close();
    }
}