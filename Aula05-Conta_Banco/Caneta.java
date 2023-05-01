package Aula04_Getter_Setter;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    //contrutor 
    public Caneta(String m, String c, Float p ){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.setPonta(p);
        this.tampar();

    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(Float ponta){
        this.ponta  = ponta;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);

    }
}
