/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author João Vitor Yoshida, Deivid da Silva
 */
public interface IDados {
    public abstract String getNome();
    public abstract Float getSalario();
    public abstract String getCargo();
    public abstract void setNome(String nome);
    public abstract void setSalario(Float salario);
    public abstract void setCargo(String cargo);
    public abstract void armazenarDados(IDados dados);
    public abstract String getRelatorio();
    public abstract void setRelatorio(String relatorio);
}
