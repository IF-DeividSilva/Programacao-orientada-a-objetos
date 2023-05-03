package Exercicio4;
/*
Exercicio <4>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <01/05/2023>
*/
import java.util.ArrayList;
import java.util.List;

public class Padaria {
    private String nome;
    private String dono;
    private String endereco;
    private float vendasMensais;
    private int qtdeMaxPaes;
    private int qtdeFuncionarios;
    List<Cozinha> cozinha = new ArrayList<>();
    List<Restaurante> restaurante = new ArrayList<>();
    
    public Padaria(String nome, String dono, String endereco, float vendasMensais, int qtdeMaxPaes, int qtdeFuncionarios) {
        this.nome = nome;
        this.dono = dono;
        this.endereco = endereco;
        this.vendasMensais = vendasMensais;
        this.qtdeMaxPaes = qtdeMaxPaes;
        this.qtdeFuncionarios = qtdeFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getVendasMensais() {
        return vendasMensais;
    }

    public void setVendasMensais(float vendasMensais) {
        this.vendasMensais = vendasMensais;
    }

    public int getQtdeMaxPaes() {
        return qtdeMaxPaes;
    }

    public void setQtdeMaxPaes(int qtdeMaxPaes) {
        this.qtdeMaxPaes = qtdeMaxPaes;
    }

    public int getQtdeFuncionarios() {
        return qtdeFuncionarios;
    }

    public void setQtdeFuncionarios(int qtdeFuncionarios) {
        this.qtdeFuncionarios = qtdeFuncionarios;
    }

    public List<Cozinha> getCozinha() {
        return cozinha;
    }

    public void setCozinha(List<Cozinha> cozinha) {
        this.cozinha = cozinha;
    }

    public List<Restaurante> getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(List<Restaurante> restaurante) {
        this.restaurante = restaurante;
    }  
}
