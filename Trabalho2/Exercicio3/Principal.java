package exercicio3;
/*
Exercicio <3>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <30/04/2023>
*/
public class Principal {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Restaurante X", 50, 20);
        Cozinha cozinha = new Cozinha("Cozinha A",5, 10);

        System.out.println("Restaurante:");
        System.out.println(restaurante.limparComodo());
        System.out.println(restaurante.organizarComodo());
        System.out.println(restaurante.LigarFreezer());
        System.out.println(restaurante.realizarManutencao());
        System.out.println(restaurante.reporEstoque());
        
        System.out.println();
 
        System.out.println("Cozinha:");
        System.out.println(cozinha.limparComodo());
        System.out.println(cozinha.organizarComodo());
        System.out.println(cozinha.LigarFreezer());
        System.out.println(cozinha.realizarManutencao());
        System.out.println(cozinha.reporEstoque());
    }
}
