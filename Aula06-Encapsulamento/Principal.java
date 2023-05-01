package aula05;

public class Prinicipal {

    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setNome("Jeguison Lopez");
       p1.setNumConta(123321);
       p1.abrirConta("CC");
      
   
       ContaBanco p2 = new ContaBanco();
       p2.setNome("Joana Lopez");
       p2.setNumConta(321123);
       p2.abrirConta("CP");
       
       p1.imprimir();
       p2.imprimir();
       
       p1.depositar(5000);
       p2.depositar(3000);
       
       p1.sacar(550);
       
       p1.imprimir();
       p2.imprimir();
    }
    
}
