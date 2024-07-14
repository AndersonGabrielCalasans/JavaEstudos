
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PaginaLogin extends JFrame {

    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfLogin, tfSenha;
    JLabel lbWelcome;

    public void initialize() {

        /**************** Cria os objetos do formulario ****************/

        // String com nome do campo First Name
        JLabel lbLogin = new JLabel("Login");
        lbLogin.setFont(mainFont); // Define a font do campo
        // Campo First Name
        tfLogin = new JTextField();
        tfLogin.setFont(mainFont);

        // String com nome do campo Last Name
        JLabel lbSenha = new JLabel("Senha");
        lbSenha.setFont(mainFont);
        // Campo Last Name
        tfSenha = new JTextField();
        tfSenha.setFont(mainFont);

        // Cria Painel do forms e add os campos criados acima
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(lbLogin);
        formPanel.add(tfLogin);
        formPanel.add(lbSenha);
        formPanel.add(tfSenha);

        /**************** Cria Label Bem Vindo ****************/
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);


        /**************** Cria Botão Entrar ****************/
        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setFont(mainFont);
        btnEntrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String login = tfLogin.getText();
                lbWelcome.setText("Seja Bem Vindo, " + login + "!");
            }

        });


        /**************** Cria Botão Limpar ****************/
        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.setFont(mainFont);
        btnLimpar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfLogin.setText("");
                tfSenha.setText("");
                lbWelcome.setText("");
            }

        });

    
        // Cria e configura Painel com Botões
        JPanel btnPainel = new JPanel();
        btnPainel.setLayout(new GridLayout(1, 2, 5 , 5));;
        btnPainel.add(btnEntrar); 
        btnPainel.add(btnLimpar); 
        

        // Cria e configura painel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(btnPainel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("Login"); // Nome do programa
        setSize(500, 600); // Tamanho da janela do programa
        setMaximumSize(new Dimension(300, 400)); // Tamanho minimo da janela
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Fecha ao sair
        setVisible(true); // Torna janela visivel
    }


    public static void main(String[] args) {
        PaginaLogin myFrame = new PaginaLogin();
        myFrame.initialize();
    }
}