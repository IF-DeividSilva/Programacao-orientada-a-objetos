package Ab02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada?  " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tem carga de " + this.carga + "%");
        System.out.println("A ponta é: " + this.carga);
    }
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO, nao pode rabiscar");
        } else{
        System.out.println("Estou rabiscando");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
