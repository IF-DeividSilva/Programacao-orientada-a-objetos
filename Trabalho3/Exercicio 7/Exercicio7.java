/*Exercicio <7>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <15/06/2023>
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio7 extends JFrame {
    private JTextArea textArea;

    public class MeuItem {
        private String horario;

        public MeuItem(String horario) {
            this.horario = horario;
        }

        public String toString() {
            return this.horario;
        }
    }

    public class ItemIterator implements Iterator<MeuItem> {
        private List<MeuItem> lista;
        private int pos = 0;

        public ItemIterator(List<MeuItem> lista) {
            this.lista = lista;
        }

        public boolean hasNext() {
            return pos < lista.size();
        }

        public MeuItem next() {
            MeuItem meuItem = lista.get(pos);
            pos++;
            return meuItem;
        }
    }

    public Exercicio7() {
        setLayout(new FlowLayout());

        List<MeuItem> horarios = new ArrayList<>();
        horarios.add(new MeuItem("23:20"));
        horarios.add(new MeuItem("15:30"));
        horarios.add(new MeuItem("09:45"));

        JButton btAgendar = new JButton("Agendar atendimento");
        add(btAgendar);

        textArea = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        btAgendar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ItemIterator iterator = new ItemIterator(horarios);
                while (iterator.hasNext()) {
                    textArea.append(iterator.next().toString() + "\n");
                }
            }
        });
    }

    public static void main(String args[]) {
        Exercicio7 exercicio = new Exercicio7();
        exercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        exercicio.setSize(240, 480);
        exercicio.setVisible(true);
    }
}
