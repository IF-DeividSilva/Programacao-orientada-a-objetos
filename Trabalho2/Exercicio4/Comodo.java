package Exercicio4;
/*
Exercicio <4>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <01/05/2023>
*/
public abstract class Comodo implements IComodo {
    private String nome; 

    public Comodo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
