package exercicio6;
/*
Exercicio <6>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <30/04/2023>
*/
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Empregado> lista = new ArrayList<>();
        lista.add(new Bonificado("Yoshida", "Levorato", 1700, 300, 150));
        lista.add(new Comissionado("Yujison","Nakahodo", 1900, 110));
        lista.add(new Horista("Anderson", "Silva", 40, 160));
        
        for (Empregado ep : lista) {
           ep.imprimir();
           System.out.println("Ganhos: " + ep.ganhos());
        }
        
        
    }
    
}
