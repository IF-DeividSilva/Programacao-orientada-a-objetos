package exercicio7;
/*
Exercicio <6>
Autor(es): <Deivid da Silva Galvao> e <JOAO VITOR NAKAHODO YOSHIDA>
Data: <28/04/2023>
*/
 abstract class Divisao implements IOperacoes {
    private float op1;
    private float op2;
    private static int quantidadeInstancias;
    

        public Divisao(){
            quantidadeInstancias = quantidadeInstancias + 1;
        }
  
        
        @Override
        public void setOperando1(float op1){
            this.op1 = op1;
        }
        @Override
        public void setOperando2(float op2){
            this.op2 = op2;
        }
        @Override
        public float getResultado(){
            return op1 / op2;
        }
        @Override
        public String getNomeOp(){
            return "Divisao";
        }
        @Override
        public int getQuantidadeInstancias(){
            return quantidadeInstancias;
        }   
    }