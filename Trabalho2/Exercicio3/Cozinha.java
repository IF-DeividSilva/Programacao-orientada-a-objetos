package Exercicio3;
/*
Exercicio <3>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <30/04/2023>
*/
public class Cozinha extends Comodo implements IComodo {
    private int tiposRefeicao;
    private int qtdePanelas;
    private Padaria padaria;

    public Cozinha(String nome, int tiposRefeicao, int qtdePanelas) {
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
    @Override
    public void emitirComanda() {
        System.out.println("Recebe um pedido do Restaurante e faz uma refeição.");
    }
    
    @Override
    public float calcularPagamento() {
        return 0 ; 
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
         return("Limpando a Coznha..."); 
    }

    @Override
    public String organizarComodo() {
         return("Organizando a Cozinha...");    
    }

    @Override
    public String LigarFreezer() {
        return("Ligando freezer da Cozinha...");   
    }

    @Override
    public String realizarManutencao() {
          return("Fazendo manutencao na Cozinha..."); 
    }

    @Override
    public String reporEstoque() {
         return("Repondo estoque da Cozinha..."); 
    }
}