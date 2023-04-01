package Trabalho1;


public class Padaria {
    private String nome;
    private String dono;
    private String endereco;
    private Float vendasPadaria;
    private int qtdeMaxPaesPadaria;
    private int qtdeFuncionariosPadaria;
    private Cozinha cozinha;
     
    public Padaria() {
        // construtor padrão inicializa as variáveis de instância
        nome = "";
        dono = "";
        endereco = "";
        vendasPadaria = 0.0f;
        qtdeMaxPaesPadaria = 0;
        qtdeFuncionariosPadaria = 0;
        cozinha = new Cozinha();
    }
    // Construct para receber os dados
    public Padaria(String nome, String dono, String endereco, Float vendasPadaria, int qtdeMaxPaesPadaria, int qtdeFuncionariosPadaria){
        this.nome = nome;
        this.dono = dono;
        this.endereco = endereco;
        this.vendasPadaria = vendasPadaria;
        this.qtdeMaxPaesPadaria = qtdeMaxPaesPadaria;
        this.qtdeFuncionariosPadaria = qtdeFuncionariosPadaria;
        cozinha = new Cozinha();
    }
    // gets e sets
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDono(String dono){
        return dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public String getEndereco(String endereco){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco=  endereco;
    }
    public Float getVendasMensais(Float vendasMensais){
        return vendasMensais;
    }
    public void setVendasMensais(Float vendasPadaria){
        this.vendasPadaria =  vendasPadaria;
    }
    public int getQtdeMaxPaes(int qtdeMaxPaesPadaria){
        return qtdeMaxPaesPadaria;
    } 
    public void setQtdeMaxPaes(int qtdeMaxPaesPadaria){
        this.qtdeMaxPaesPadaria = qtdeMaxPaesPadaria;
    }
    public int getQtdeFuncionarios(int qtdeFuncionariosPadaria){
        return qtdeFuncionariosPadaria;
    }
    public void setQtdeFuncionarios(int qtdeFuncionariosPadaria){
        this.qtdeFuncionariosPadaria = qtdeFuncionariosPadaria;
    }

}
class Cozinha{
    
}
