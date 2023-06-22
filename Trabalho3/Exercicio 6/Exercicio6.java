/*Exercicio <6>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <15/06/2023>
*/
import javax.swing.JOptionPane;

public class Exercicio6 {
    public abstract class Facade {
        public abstract void iniciar();
    }
    
    public class FuncionarioEstagiario extends Facade {
        String estagiario;
        
        public void iniciar(){
            iniciarEstagiaros();
        }
        
        private void iniciarEstagiaros(){   
            estagiario = JOptionPane.showInputDialog("Digite o nome do estagiario: ");  
        }
    }
    
    public class FuncionarioEfetivado extends Facade {
        String efetivado;
        
        public void iniciar() {
            iniciarEfetivados();
        }
        
        private void iniciarEfetivados(){   
            efetivado = JOptionPane.showInputDialog("Digite o nome do efetivado: ");  
        }
    }
    
     public Exercicio6(){
         
        Facade estagiario = new FuncionarioEstagiario();
        estagiario.iniciar();
        Facade efetivado = new FuncionarioEfetivado();
        efetivado.iniciar();
     } 
    
    public static void main(String args[]) {
        new Exercicio6();
    }
}