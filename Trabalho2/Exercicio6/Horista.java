package exercicio6;
/*
Exercicio <6>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <30/04/2023>
*/
public class Horista extends Empregado{
    private int horas;

    public Horista(String nome, String sobrenome, float salarioBase, int horas) {
        super(nome, sobrenome, salarioBase);
        this.horas = horas;
    }
    
    @Override
    public float ganhos(){
        return salarioBase * horas;
    }
    @Override
    public void imprimir(){
     System.out.println("Nome: " + nome + " " + sobrenome);
     System.out.println("Salário base: " + salarioBase);
     System.out.println("Horas trabalhadas: " + horas);    
    }
}
