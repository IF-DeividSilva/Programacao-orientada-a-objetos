package Exercicio4;
/*
Exercicio <4>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <01/05/2023>
*/
import java.util.Random;

public class Cozinha extends Comodo {
    private int tiposRefeicao;
    private int qtdePanelas;
    public String pedido;
    
    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public Cozinha(String nome, int tiposRefeicao, int qtdePanelas){
        super(nome);
        this.tiposRefeicao = tiposRefeicao;
        this.qtdePanelas = qtdePanelas;
    }

    public int getTiposRefeicao() {
        return tiposRefeicao;
    }

    public void setTiposRefeicao(int tiposRefeicao) {
        this.tiposRefeicao = tiposRefeicao;
    }

    public int getQtdePanelas() {
        return qtdePanelas;
    }

    public void setQtdePanelas(int qtdePanelas) {
        this.qtdePanelas = qtdePanelas;
    }

    public String emitirComanda(String pedido) {
        return pedido+" esta sendo preparado pela "+getNome();
    }

    public String calcularPagamento(String pedido) {
        Random random = new Random();
        String preco = Float.toString(random.nextInt(30));
        return preco;
    }

    public void calcularCompras(int i) {
        if(i == 15) System.out.println("15 compras foram realizados");     
    }
}
