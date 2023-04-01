package Trabalho1;

public class Cozinha {
    private int tiposRefeicao;
    private int qtdePanelas;

    // constructor
    public Cozinha() {
        tiposRefeicao = 0;
        qtdePanelas = 0;
    }

    // constructor pra receber dados
    public Cozinha(int tiposRefeicao, int qtdePanelas) {
        this.tiposRefeicao = tiposRefeicao;
        this.qtdePanelas = qtdePanelas;
    }

    // gets e sets
    public int getTipoRefeicoes(){
        return tiposRefeicao;
    }
    public void setTipoRefeicoes(int tipoRefeicoes){
        this.tiposRefeicao = tipoRefeicoes;
    }
    public int getQtdePanelas(){
        return qtdePanelas;
    }
    public void setQtdePanelas(int qtdePanelas){
        this.qtdePanelas = qtdePanelas;
    }

}
