package exercicio6;
/*
Exercicio <6>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <30/04/2023>
*/
public class Assalariado extends Empregado {
    private float salarioSemanal;
    
    public Assalariado(String nome, String sobrenome, float salarioBase,  float salarioSemanal){
       super(nome, sobrenome, salarioBase);
       this.salarioSemanal = salarioSemanal;
       
    }
    
    @Override
    public float ganhos(){
        return salarioSemanal;
    }
    @Override
    public void imprimir(){
    System.out.println("Nome: " + nome + " " + sobrenome);
    System.out.println("Salário semanal: " + salarioSemanal);    
    }

}
