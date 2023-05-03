/*
Exercicio <1>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <27/04/2023>
*/

package lista.pkg2;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    
    public static void main(String[] args) {
        
    Cozinha cozinha1 = new Cozinha("Cozinha1",2,4);
    Restaurante restaurante1 = new Restaurante("Restauras1",2,4);
    Cozinha cozinha2 = new Cozinha("Cozinha2",4,6);
    Restaurante restaurante2 = new Restaurante("Restauras2",4,6);
    
    List <Comodo>lista = new ArrayList<>();
    lista.add(cozinha1);
    lista.add(restaurante1);
    lista.add(cozinha2);
    lista.add(restaurante2);
    
     for (Comodo comodo : lista) {
            System.out.println("Nome: " + comodo.getNome());
            if (comodo instanceof Restaurante) {
                Restaurante r = (Restaurante) comodo;
                System.out.println("Quantidade de cadeiras: " + r.getQtdeCadeiras());
                System.out.println("Quantidade de mesas: " + r.getQtdeMesas());
            } else if (comodo instanceof Cozinha) {
                Cozinha c = (Cozinha) comodo;
                System.out.println("Tipos de refeicao: " + c.getTiposRefeicao());
                System.out.println("Quantidade de panelas: " + c.getQtdePanelas());

            }
            System.out.println("---------------------------------");
        }
    }
}
    

    