package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String nome;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.numConta = 0;
        this.tipo = " ";
        this.nome = " ";
        this.saldo = 0;
        this.status = false;
    }
    
    public void imprimir(){
        System.out.println("---- Imprimindo ----");
        System.out.println(getNumConta());
        System.out.println(getTipo());
        System.out.println(getNome());
        System.out.println(getSaldo());
        System.out.println(getStatus());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if ("CC".equals(t)) {
           this.setSaldo(50); 
        }else{
            this.setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Nao pode ser fechada pois ainda tem saldo");
        }else if (this.getSaldo() < 0){
            System.out.println("Nao pode ser fechada, pois ha debitos");
        }else{
            System.out.println("Conta fechada com sucesso");
            
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()){
            setSaldo(getSaldo() + v);
           System.out.println("Deposito realizado com sucesso na conta de " + getNome());
        }else {
            System.out.println("Nao foi possivel realizar o deposito");
        }     
    }
    
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com suceeso da conta de " + getNome());
            }else{
                System.out.println("Saldo insuficiente para saldo...");
            }
        }else{
            System.out.println("Conta fechada, impossivel sacar...");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getNome());
        }else{
            System.out.println("Impossivel pagar, conta esta fechada");
        }
    }
    
    
}
