
//package aula2;

import  java.util.Scanner;

public class Calculadora {

    public int campo1; //Atributo
    public int campo2; //Atributo
    public int op; //Atributo
    
    public void setCampo1(int campo1){
        this.campo1 = campo1;
    }
    public void setCampo2(int campo2){
        this.campo2 = campo2;
    }
    public void setOperacao(int op){
        this.op = op;
    }
    public void imprimir(){
        
          int resultado=0;
          switch( op ){
                  case 1: {
                      resultado = campo1 + campo2;
                      break;
                  }
                  case 2: {
                       resultado = campo1 - campo2;
                       break;
                   }
                  case 3: {
                      resultado = campo1 * campo2;
                      break;
                  }
                  case 4: {
                       resultado = campo1 / campo2;
                       break;
                   }
                  default:
                  break;
          }//fim switch          

          System.out.println("Resultado: " + resultado);
    
        }
        
    }
