package Exercicio2;
/*
Exercicio <2>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <01/05/2023>
*/
public interface IComodo {
    public abstract String emitirComanda(String pedido);
    public abstract String calcularPagamento(String pedido);
    public abstract void calcularCompras(int i);
}
