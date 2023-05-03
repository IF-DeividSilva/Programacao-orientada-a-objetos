package exercicio6;
/*
Exercicio <6>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <30/04/2023>
*/
abstract class Empregado {
    String nome;
    String sobrenome;
    float salarioBase;
    
    public Empregado(String nome, String sobrenome, float salarioBase){
        this.nome =nome;
        this.sobrenome = sobrenome;
        this.salarioBase = salarioBase;
    }
    
    public abstract float ganhos();
    public abstract void imprimir();
    
}
