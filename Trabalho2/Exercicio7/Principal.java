package exercicio7;
/*
Exercicio <7>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <28/04/2023>
*/
public class Principal {

    public static void main(String[] args) {
        IOperacoes soma = new Soma() {} ;
        IOperacoes subtracao = new Subtracao() {};
        IOperacoes multiplicacao = new Multiplicacao() {};
        IOperacoes divisao = new Divisao() {};
        
        soma.setOperando1(15);
        soma.setOperando2(30);
        System.out.println("Resultado da " + soma.getNomeOp() + " eh " + soma.getResultado());
        System.out.println("Quantidade de instancias da soma: " + soma.getQuantidadeInstancias());
        
        subtracao.setOperando1(15);
        subtracao.setOperando2(30);
        System.out.println("Resultado da " + subtracao.getNomeOp() + " eh " + subtracao.getResultado());
        System.out.println("Quantidade de instancias da sub: " + subtracao.getQuantidadeInstancias());
        
        multiplicacao.setOperando1(10);
        multiplicacao.setOperando2(10);
        System.out.println("Resultado da " + multiplicacao.getNomeOp() + " eh " + multiplicacao.getResultado());
        System.out.println("Quantidade de instancias da mult: " + multiplicacao.getQuantidadeInstancias());
        
        divisao.setOperando1(10);
        divisao.setOperando2(10);
        System.out.println("Resultado da " + divisao.getNomeOp() + " eh " + divisao.getResultado());
        System.out.println("Quantidade de instancias da mult: " + divisao.getQuantidadeInstancias());
        
    }
    
}
