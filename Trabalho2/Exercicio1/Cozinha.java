/*
Exercicio <1>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <27/04/2023>
*/
package lista.pkg2;

public class Cozinha extends Comodo{
    private int tiposRefeicao;
    private int qtdePanelas;
    
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
    
}
