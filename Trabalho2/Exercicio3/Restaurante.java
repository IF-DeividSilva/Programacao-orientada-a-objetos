package exercicio3;
/*
Exercicio <3>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <30/04/2023>
*/
public class Restaurante extends Comodo implements IComodo {
    private int qtdeCadeiras;
    private int qtdeMesas;
    private Padaria padaria;

    public Restaurante(String nome, int qtdeCadeiras, int qtdeMesas) {
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
    @Override
    public void emitirComanda() {
        System.out.println("Recebe um pedido do Restaurante e faz uma refeição.");
    }
    
    @Override
    public float calcularPagamento() {
        return 0; 
    }
    
    @Override
    public String calcularCompras() {
        if (Math.random() > 0.5) {
            return "Emite aviso de compras se foram feitos pelo menos 10 pedidos.";
        } else {
            return "Não há aviso de compras a ser emitido.";
        }
    }

    @Override
    public String limparComodo() {
        return "Limpando restaurante..."; 
    }

    @Override
    public String organizarComodo() {
         return "Organizando restaurante..."; 
    }

    @Override
    public String LigarFreezer() {
         return("Ligando freezer do restaurante...");  
  }

    @Override
    public String realizarManutencao() {
         return("Fazendo manutencao no restaurante..."); 
    }

    @Override
    public String reporEstoque() {
         return("Repondo estoque do Restaurante..."); 
    }
}