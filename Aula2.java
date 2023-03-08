//package aula2;

/**
 *
 * @author root
 */

//public: todas as classes tem acesso 
//class esta é uma classe
//Aula2 é o nome da classe (sempre maiusculo e sem caracteres especiais)

//*** letra maiuscula significa que é uma classe ****

public class Aula2 {

    //main -> primeiro metodo
    //public -> (para outras classes)todos os metodos tem acesso
    //Strimg [] args -> é uma lista estatica
    //static: visivel por todos os objetos dessa classe
    // é compartolhada entre todos os objetos
    
    public static void main(String[] args) {
        //System: classe
        //out: objeto
        //print: metodo
        //String minhaString;            //Declaração do objeto
        //minhaString = new String();    //Alocar memoria dinamica
        String minhaString = new String("Ola word");
        
       // minhaString = "Tamo Junto!";
        
        System.out.println(minhaString);
        
        System.out.println(" Ola Mundo!");
        String outraString = new String("Eng Comp");
        System.out.println(minhaString + outraString);
    }
    
}
