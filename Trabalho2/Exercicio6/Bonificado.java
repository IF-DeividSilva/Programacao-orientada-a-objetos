package exercicio6;
/*
Exercicio <6>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <30/04/2023>
*/
public class Bonificado extends Assalariado {
    private float bonificacao;

    public Bonificado(String nome, String sobrenome, float salarioBase, float bonificacao, float salarioSemanal) {
        super(nome, sobrenome, salarioBase, salarioSemanal);
        this.bonificacao = bonificacao;
    }
    @Override
    public float ganhos() {
       return super.ganhos() + bonificacao;
    }

    @Override
    public void imprimir() {
       super.imprimir();
       System.out.println("Bonificação: " + bonificacao);
    }
}