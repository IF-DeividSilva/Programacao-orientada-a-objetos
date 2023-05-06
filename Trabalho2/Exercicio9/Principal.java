package exercicio9;
import java.io.IOException;
/*
Exercicio <9>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <28/04/2023>
*/
public class Principal { 
    public static void main(String[] args) {
        try {
            throw new ExceptionA("Excecao A");
        } catch (Exception e){
            System.out.println("Excecao " + e.getMessage());
        }
        try {
            throw new ExceptionB("Excecao B");
        } catch (Exception e){
            System.out.println("Excecao " + e.getMessage());
        }
        try {
            throw new NullPointerException("Null pointer");
        } catch (Exception e){
            System.out.println("Excecao " + e.getMessage());
        }
        try {
            throw new IOException("IO Exception");   
        } catch (Exception e){
            System.out.println("Excecao " + e.getMessage());
        }
    }
    
}
