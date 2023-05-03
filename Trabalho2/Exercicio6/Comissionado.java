package exercicio6;
/*
Exercicio <6>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <30/04/2023>
*/
public class Comissionado extends Empregado{
    private float taxaComissao;

    public Comissionado(String nome, String sobrenome, int par, int salarioBase) {
        super(nome, sobrenome, salarioBase);
        this.taxaComissao = taxaComissao;
    }
    
    @Override 
    public float ganhos(){
        return salarioBase + (taxaComissao/100) * salarioBase;
    }
    @Override
    public void imprimir(){
     System.out.println("Nome: " + nome + " " + sobrenome);
     System.out.println("Salário base: " + salarioBase);
     System.out.println("Taxa de comissão: " + taxaComissao);   
    }
}
