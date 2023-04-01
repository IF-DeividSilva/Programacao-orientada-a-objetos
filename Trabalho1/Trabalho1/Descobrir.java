package Trabalho1;


import java.util.Random;

class Descobrir {
    private Random sorteador;
    private int qtdeFuncionariosPadaria;

    public Descobrir(int qtdeFuncionariosPadaria) {
        this.qtdeFuncionariosPadaria = qtdeFuncionariosPadaria;
        this.sorteador = new Random();
    }

    public int gerarNumeroAleatorio() {
        return sorteador.nextInt(qtdeFuncionariosPadaria) + 1;
    }
}
