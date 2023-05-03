package exercicio5;
/*
Exercicio <5>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <02/05/2023>
*/
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
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
        double preco = random.nextInt(30);
        return ""+preco;
    }

    public void calcularCompras(int i) {
        if(i == 15) System.out.println("15 compras foram realizados");     
    }
}
    public abstract class Comodo implements IComodo {
    private String nome; 

    public Comodo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
    public interface IComodo {
    public abstract String emitirComanda(String pedido);
    public abstract String calcularPagamento(String pedido);
    public abstract void calcularCompras(int i);
}
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
        return ""+(float)(Float.valueOf(pedido).floatValue() + (Float.valueOf(pedido).floatValue()  * 0.1));
    }

    public void calcularCompras(int i) {
        if(i == 10) System.out.println("10 compras foram realizados");
    }
}
    public interface IMoeda {
    public abstract void formaPagamento();
}

public class BitCoin implements IMoeda{
    @Override
    public void formaPagamento(){
        System.out.println("Pagamento em BTC");
    }
}
public class Euro implements IMoeda{
    @Override
    public void formaPagamento() {
        System.out.println("Pagamento em Euro");
    }
}
public class Real implements IMoeda {

    @Override
    public void formaPagamento() {
        System.out.println("Pagamento em Real");   
    }
    
}


    public Principal(){
        
        Cozinha cozinha1 = new Cozinha("Cozinha1",2,4);
        Restaurante restaurante1 = new Restaurante("Restauras1",2,4);
        Cozinha cozinha2 = new Cozinha("Cozinha2",4,6);
        Restaurante restaurante2 = new Restaurante("Restauras2",4,6);
        
        List <Comodo>lista = new ArrayList<>();
        lista.add(cozinha1);
        lista.add(restaurante1);
        lista.add(cozinha2);
        lista.add(restaurante2);

        Scanner entrada = new Scanner(System.in);
        int escolha = 0;
        int op = 1;
        int i = 0;

        System.out.print("\nEscolha o restaurante: "+
                         "\n[1] Restauras1"+
                         "\n[2] Restauras2\n");
    
        escolha = entrada.nextInt();
        switch(escolha){
            case 1:
                do{
                    i++;
                    System.out.print("\nFaça seu pedido: ");
                    String pedido = entrada.next();
                    System.out.println("\n"+cozinha1.emitirComanda(restaurante1.emitirComanda(pedido)));
                    System.out.println("\nValor do pedido (+10%): "+restaurante1.calcularPagamento(cozinha1.calcularPagamento(cozinha1.emitirComanda(restaurante1.emitirComanda(pedido)))));
                    cozinha1.calcularCompras(i);
                    restaurante1.calcularCompras(i);
        
                    System.out.println("\nDeseja pedir algo mais?\n"+
                                    "[0] Não\n"+
                                    "[1] Sim");
                    op = entrada.nextInt();
                }while(op == 1);
                entrada.close();
            break;
            case 2:
                do{
                    i++;
                    System.out.print("\nFaça seu pedido: ");
                    String pedido = entrada.next();
                    System.out.println("\n"+cozinha2.emitirComanda(restaurante2.emitirComanda(pedido)));
                    System.out.println("\nValor do pedido (+10%): "+restaurante2.calcularPagamento(cozinha2.calcularPagamento(cozinha2.emitirComanda(restaurante2.emitirComanda(pedido)))));
                    cozinha2.calcularCompras(i);
                    restaurante2.calcularCompras(i);
        
                    System.out.println("\nDeseja pedir algo mais?\n"+
                                    "[0] Não\n"+
                                    "[1] Sim");
                    op = entrada.nextInt();
                }while(op == 1);
                entrada.close();
            default:
                System.out.println("Restaurante invalido!");
                System.exit(0);
        }       
        IMoeda[] formasDePagamento = new IMoeda[3];
        formasDePagamento[0] = new BitCoin();
        formasDePagamento[1] = new Euro();
        formasDePagamento[2] = new Real();

        for (IMoeda formaDePagamento : formasDePagamento) {
            formaDePagamento.formaPagamento();
        }
        
    }

    public static void main(String[] args) {
        new Principal();        
    }
    
}