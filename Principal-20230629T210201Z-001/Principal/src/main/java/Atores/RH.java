/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atores;

import Interfaces.ILogin;
import Visão.Principal;

/**
 *
 * @author João Vitor Yoshida
 */
public class RH implements ILogin {
    private String usuario;
    private String senha;
    private Integer permissao;

    public RH() {
        this.usuario = "";
        this.senha = "";
        this.permissao = 1;
    } 
    
    public RH(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        this.permissao = 1;
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
}
