package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import dao.ContatoDAO;
import model.Contato;

public class TelaAgenda extends JFrame {

    private static final long serialVersionUID = 1L;

    private JTextField txtNome;
    private JTextField txtTelefone;
    private JTextField txtEmail;
    private JTextField txtPesquisar;

    private JButton btnSalvar;
    private JButton btnAtualizar;
    private JButton btnExcluir;
    private JButton btnLimpar;
    private JButton btnPesquisar;

    private JTable tabela;
    private DefaultTableModel modelo;

    private ContatoDAO contatoDAO;

    private int idSelecionado = -1;

    private JLabel lblTotal;

    @SuppressWarnings("unused")
	public TelaAgenda() {

        contatoDAO = new ContatoDAO();

        setTitle("Agenda Telefônica");
        setSize(600, 850);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        getContentPane().setBackground(
                new Color(245, 247, 250));

        JLabel titulo =
                new JLabel("AGENDA TELEFÔNICA");

        titulo.setBounds(
                20,
                20,
                540,
                40);

        titulo.setHorizontalAlignment(
                SwingConstants.CENTER);

        titulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        28));

        add(titulo);

        JLabel lblNome =
                new JLabel("Nome");

        lblNome.setBounds(
                40,
                80,
                100,
                25);

        add(lblNome);

        txtNome =
                new JTextField();

        txtNome.setBounds(
                40,
                105,
                500,
                40);

        txtNome.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        14));

        add(txtNome);

        JLabel lblTelefone =
                new JLabel("Telefone");

        lblTelefone.setBounds(
                40,
                155,
                100,
                25);

        add(lblTelefone);

        txtTelefone =
                new JTextField();

        txtTelefone.setBounds(
                40,
                180,
                500,
                40);

        txtTelefone.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        14));

        add(txtTelefone);

        JLabel lblEmail =
                new JLabel("E-mail");

        lblEmail.setBounds(
                40,
                230,
                100,
                25);

        add(lblEmail);

        txtEmail =
                new JTextField();

        txtEmail.setBounds(
                40,
                255,
                500,
                40);

        txtEmail.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        14));

        add(txtEmail);

        btnSalvar =
                new JButton("Salvar");

        btnSalvar.setBounds(
                40,
                320,
                110,
                45);

        estilizarBotao(
                btnSalvar,
                new Color(46, 204, 113));

        add(btnSalvar);

        btnAtualizar =
                new JButton("Atualizar");

        btnAtualizar.setBounds(
                160,
                320,
                110,
                45);

        estilizarBotao(
                btnAtualizar,
                new Color(52, 152, 219));

        add(btnAtualizar);

        btnExcluir =
                new JButton("Excluir");

        btnExcluir.setBounds(
                280,
                320,
                110,
                45);

        estilizarBotao(
                btnExcluir,
                new Color(231, 76, 60));

        add(btnExcluir);

        btnLimpar =
                new JButton("Limpar");

        btnLimpar.setBounds(
                400,
                320,
                140,
                45);

        estilizarBotao(
                btnLimpar,
                new Color(149, 165, 166));

        add(btnLimpar);

        JLabel lblPesquisar =
                new JLabel("Pesquisar");

        lblPesquisar.setBounds(
                40,
                390,
                100,
                25);

        add(lblPesquisar);

        txtPesquisar =
                new JTextField();

        txtPesquisar.setBounds(
                40,
                420,
                370,
                40);

        txtPesquisar.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        14));

        add(txtPesquisar);

        btnPesquisar =
                new JButton("Buscar");

        btnPesquisar.setBounds(
                420,
                420,
                120,
                40);

        estilizarBotao(
                btnPesquisar,
                new Color(155, 89, 182));

        add(btnPesquisar);

        modelo =
                new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Telefone");
        modelo.addColumn("Email");

        tabela =
                new JTable(modelo);

        tabela.setRowHeight(30);

        tabela.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        14));

        tabela.setSelectionBackground(
                new Color(
                        52,
                        152,
                        219));

        tabela.setSelectionForeground(
                Color.WHITE);

        JTableHeader cabecalho =
                tabela.getTableHeader();

        cabecalho.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        14));

        cabecalho.setPreferredSize(
                new Dimension(
                        cabecalho.getWidth(),
                        35));

        JScrollPane scroll =
                new JScrollPane(tabela);

        scroll.setBounds(
                20,
                480,
                550,
                250);

        add(scroll);

        lblTotal =
                new JLabel(
                        "Total: 0 contatos");

        lblTotal.setBounds(
                20,
                750,
                250,
                25);

        lblTotal.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        14));

        add(lblTotal);

        tabela.getSelectionModel()
                .addListSelectionListener(e -> {

            if (!e.getValueIsAdjusting()
                    && tabela.getSelectedRow() != -1) {

                int linha =
                        tabela.getSelectedRow();

                idSelecionado =
                        Integer.parseInt(
                                tabela.getValueAt(
                                        linha,
                                        0).toString());

                txtNome.setText(
                        tabela.getValueAt(
                                linha,
                                1).toString());

                txtTelefone.setText(
                        tabela.getValueAt(
                                linha,
                                2).toString());

                txtEmail.setText(
                        tabela.getValueAt(
                                linha,
                                3).toString());
            }
        });

        txtPesquisar.addKeyListener(
                new KeyAdapter() {

                    @Override
                    public void keyReleased(
                            KeyEvent e) {

                        pesquisarContato();
                    }
                });

        btnSalvar.addActionListener(
                e -> salvarContato());

        btnAtualizar.addActionListener(
                e -> atualizarContato());

        btnExcluir.addActionListener(
                e -> excluirContato());

        btnLimpar.addActionListener(
                e -> limparCampos());

        btnPesquisar.addActionListener(
                e -> pesquisarContato());

        carregarContatos();

        setVisible(true);
    }

    private void estilizarBotao(
            JButton botao,
            Color cor) {

        botao.setBackground(cor);
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setBorderPainted(false);

        botao.setCursor(
                new Cursor(
                        Cursor.HAND_CURSOR));

        botao.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        13));
    }

    private boolean emailValido(
            String email) {

        return email.matches(
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    private boolean telefoneValido(
            String telefone) {

        return telefone.matches(
                "\\(?(\\d{2})\\)?\\s?\\d{4,5}-?\\d{4}");
    }

    private void salvarContato() {

        String nome =
                txtNome.getText().trim();

        String telefone =
                txtTelefone.getText().trim();

        String email =
                txtEmail.getText().trim();

        if (nome.isEmpty()
                || telefone.isEmpty()
                || email.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Preencha todos os campos!");

            return;
        }

        if (!emailValido(email)) {

            JOptionPane.showMessageDialog(
                    this,
                    "E-mail inválido!");

            return;
        }

        if (!telefoneValido(telefone)) {

            JOptionPane.showMessageDialog(
                    this,
                    "Telefone inválido!");

            return;
        }

        Contato contato =
                new Contato(
                        nome,
                        telefone,
                        email);

        contatoDAO.adicionarContato(
                contato);

        JOptionPane.showMessageDialog(
                this,
                "Contato salvo com sucesso!");

        limparCampos();

        carregarContatos();
    }

    private void atualizarContato() {

        if (idSelecionado == -1) {

            JOptionPane.showMessageDialog(
                    this,
                    "Selecione um contato!");

            return;
        }

        Contato contato =
                new Contato(
                        idSelecionado,
                        txtNome.getText(),
                        txtTelefone.getText(),
                        txtEmail.getText());

        contatoDAO.atualizarContato(
                contato);

        JOptionPane.showMessageDialog(
                this,
                "Contato atualizado!");

        limparCampos();

        carregarContatos();
    }

    private void excluirContato() {

        if (idSelecionado == -1) {

            JOptionPane.showMessageDialog(
                    this,
                    "Selecione um contato!");

            return;
        }

        int opcao =
                JOptionPane.showConfirmDialog(
                        this,
                        "Deseja realmente excluir?",
                        "Confirmação",
                        JOptionPane.YES_NO_OPTION);

        if (opcao ==
                JOptionPane.YES_OPTION) {

            contatoDAO.removerContato(
                    idSelecionado);

            limparCampos();

            carregarContatos();
        }
    }

    private void pesquisarContato() {

        String texto =
                txtPesquisar.getText();

        modelo.setRowCount(0);

        List<Contato> lista =
                contatoDAO.pesquisarContatos(
                        texto);

        for (Contato contato : lista) {

            modelo.addRow(
                    new Object[] {

                            contato.getId(),
                            contato.getNome(),
                            contato.getTelefone(),
                            contato.getEmail()
                    });
        }
    }

    private void limparCampos() {

        txtNome.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");

        idSelecionado = -1;

        tabela.clearSelection();
    }

    private void carregarContatos() {

        modelo.setRowCount(0);

        List<Contato> lista =
                contatoDAO.listarContatos();

        for (Contato contato : lista) {

            modelo.addRow(
                    new Object[] {

                            contato.getId(),
                            contato.getNome(),
                            contato.getTelefone(),
                            contato.getEmail()
                    });
        }

        lblTotal.setText(
                "Total: "
                        + lista.size()
                        + " contatos");
    }

    public static void main(
            String[] args) {

        new TelaAgenda();
    }
}

