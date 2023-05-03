package exercicio.pkg8;
/*
Exercicio <8>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <28/04/2023>
*/
public class Principal {

 
     public static void main(String[] args) {
        try {
            throw new ExceptionC("ExcecaoC");
        } catch (ExceptionA e) {
            System.out.println("excecao do tipo A: " + e.getMessage());
        }
    }
}


