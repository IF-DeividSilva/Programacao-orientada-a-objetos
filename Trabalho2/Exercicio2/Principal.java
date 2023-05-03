package Exercicio2;
/*
Exercicio <2>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <01/05/2023>
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
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
    }

    public static void main(String[] args) {
        new Principal();        
    }
}
