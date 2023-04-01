package Trabalho1;


import java.time.Duration;
import java.time.LocalDateTime;

public class Estacionamento {
    private String tipoVeiculo;
    private String placa;
    private LocalDateTime entrada;
    private LocalDateTime saida;

    public Estacionamento() {
       // construtor padrão inicializa as variáveis de instância
       tipoVeiculo = "";
       placa = "";
    }
    public Estacionamento(String tipoVeiculo, String placa, LocalDateTime entrada, LocalDateTime saida) {
        this.tipoVeiculo = tipoVeiculo;
        this.placa = placa;
        this.entrada = entrada;
        this.saida = saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public double calcularValor() {
        Duration duracao = Duration.between(entrada, saida);
        long minutos = duracao.toMinutes();

        if (minutos <= 30) {
            return 0.0;
        } else if (minutos <= 60) {
            return 10.0;
        } else {
            return 20.0;
        }
    }
}