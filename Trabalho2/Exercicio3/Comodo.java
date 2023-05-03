package exercicio3;
/*
Exercicio <3>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <30/04/2023>
*/
public abstract class Comodo {
    String nome;
    
     public Comodo(String nome) {
        this.nome = nome;
    }
    public abstract String LigarFreezer();
    public abstract String realizarManutencao();
    public abstract String reporEstoque();
    public abstract String limparComodo();
    public abstract String organizarComodo();
    
}
