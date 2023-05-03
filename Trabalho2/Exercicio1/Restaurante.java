/*
Exercicio <1>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <27/04/2023>
*/

package lista.pkg2;

public class Restaurante extends Comodo {
    private int qtdeCadeiras;
    private int qtdeMesas;
    
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
    
}
