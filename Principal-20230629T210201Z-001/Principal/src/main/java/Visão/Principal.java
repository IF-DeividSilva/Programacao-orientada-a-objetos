/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Visão;

import Interfaces.IDados;
import Interfaces.ILogin;
import Atores.Funcionario;
import Atores.RH;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author João Vitor Yoshida
 */
public class Principal {
    public static ArrayList<ILogin> listaLogin = new ArrayList<>();
    public static ArrayList<IDados> listaDados = new ArrayList<>();
    
    public Principal() {
        ILogin login = new RH("admin", "root123");
        login.cadastrar(login);
        Login inicio = Login.iniciar();
        inicio.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Principal();
    }
}
