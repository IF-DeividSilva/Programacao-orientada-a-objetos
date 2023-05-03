package Exercicio2;
/*
Exercicio <2>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <01/05/2023>
*/
public class Restaurante extends Comodo {
    private int qtdeCadeiras;
    private int qtdeMesas;
    public String pedido;
    
    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public Restaurante(String nome, int qtdeCadeiras, int qtdeMesas){
        super(nome);
        this.qtdeCadeiras = qtdeCadeiras;
        this.qtdeMesas = qtdeMesas;
    }

    public int getQtdeCadeiras() {
        return qtdeCadeiras;
    }

    public void setQtdeCadeiras(int qtdeCadeiras) {
        this.qtdeCadeiras = qtdeCadeiras;
    }

    public int getQtdeMesas() {
        return qtdeMesas;
    }

    public void setQtdeMesas(int qtdeMesas) {
        this.qtdeMesas = qtdeMesas;
    }

    public String emitirComanda(String pedido) {
        return pedido;
    }

    public String calcularPagamento(String pedido) {
        float valor = Float.parseFloat(pedido);
        float resultado = (float) (valor + (valor*0.1)); 
        return ""+resultado;
    }

    public void calcularCompras(int i) {
        if(i == 10) System.out.println("10 compras foram realizados");
    }
}