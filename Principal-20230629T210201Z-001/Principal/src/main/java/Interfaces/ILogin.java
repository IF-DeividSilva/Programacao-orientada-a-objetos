/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author João Vitor Yoshida, Deivid da Silva
 */
public interface ILogin {
    public abstract String getUsuario();
    public abstract String getSenha();
    public abstract Integer getPermissao();
    public abstract void cadastrar(ILogin login);
}
