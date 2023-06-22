/*Exercicio <8>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <15/06/2023>
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaPrefeitoInterface extends JFrame {
    private static AgendaPrefeitoInterface instance;
    private JTextArea textAreaAgenda;

    private AgendaPrefeitoInterface() {
        // Configurações do JFrame
        setTitle("Consulta Agenda do Prefeito");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criação dos componentes
        textAreaAgenda = new JTextArea();
        textAreaAgenda.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textAreaAgenda);
        scrollPane.setPreferredSize(new Dimension(400, 300));

        JButton buttonConsultar = new JButton("Consultar");
        buttonConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultarAgendaPrefeito();
            }
        });

        // Adicionar componentes ao JFrame
        JPanel panel = new JPanel();
        panel.add(scrollPane);
        panel.add(buttonConsultar);
        add(panel);

        // Exibe o JFrame
        setVisible(true);
    }

    public static synchronized AgendaPrefeitoInterface getInstance() {
        if (instance == null) {
            instance = new AgendaPrefeitoInterface();
        }
        return instance;
    }

    private void consultarAgendaPrefeito() {
        // Lógica para consultar a agenda do prefeito e exibir no JTextArea
        // Exemplo simples: exibindo uma mensagem
        textAreaAgenda.setText("Agenda do Prefeito:\n\n1. Reunião com Secretário às 10:00\n2. Visita à Escola às 14:00");
    }

    public static void main(String[] args) {
        AgendaPrefeitoInterface.getInstance();
    }
}
