/*Exercicio <9>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <15/06/2023>
*/
package exercicio9_;

import javax.swing.*;

public class CadastroFuncionarioInterface extends JFrame {
    private JRadioButton botao1;
    private JRadioButton botao2;
    private JButton buttonCadastrar;

    public CadastroFuncionarioInterface() {
        setTitle("--Menu--");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criação dos componentes
        botao1 = new JRadioButton("Cadastrar Funcionario");
        botao2 = new JRadioButton("Pesquisar Funcionario");
        buttonCadastrar = new JButton("Cadastrar");

        // Adicionar componentes ao JFrame
        JPanel panel = new JPanel();
        panel.add(botao1);
        panel.add(botao2);
        panel.add(buttonCadastrar);
        add(panel);

        // Configuração dos RadioButtons
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(botao1);
        buttonGroup.add(botao2);

        // Configuração do JButton
        buttonCadastrar.addActionListener(e -> cadastrarFuncionario());

        // Exibe o JFrame
        setVisible(true);
    }

    private void cadastrarFuncionario() {
        if (botao1.isSelected()) {
            System.out.println("Cadastrando com sucesso!");
        } else if (botao2.isSelected()) {
            System.out.println("Pesquisando...");
        } else {
            System.out.println("Nenhuma opção selecionada");
        }
    }

    public static void main(String[] args) {
        new CadastroFuncionarioInterface();
    }
}
