/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atores;

import Interfaces.IDados;
import Interfaces.ILogin;
import Visão.Principal;

/**
 *
 * @author João Vitor Yoshida
 */
public class Funcionario implements ILogin, IDados {
    private String usuario;
    private String senha;
    private Integer permissao;
    private String nome;
    private String cargo;
    private Float salario;
    private String relatorio;

    public Funcionario() {
        this.usuario = "";
        this.senha = "";
        this.permissao = 0;
    } 
    
    public Funcionario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        this.permissao = 0;
    }
    
    public Funcionario(String nome, String cargo, Float salario, String relatorio) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.permissao = 0;
        this.relatorio = relatorio;
    }
    
    @Override
    public void cadastrar(ILogin login) {
        Principal.listaLogin.add(login);
    }

    @Override
    public String getUsuario() {
        return this.usuario;
    }

    @Override
    public String getSenha() {
        return this.senha;
    }

    @Override
    public Integer getPermissao() {
        return this.permissao;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Float getSalario() {
        return this.salario;
    }
    
    public void setSalario(Float salario) {
        this.salario = salario;
    }

    @Override
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void armazenarDados(IDados dados) {
        Principal.listaDados.add(dados);
    }

    @Override
    public String getRelatorio() {
        return this.relatorio;
    }

    @Override
    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }
}
