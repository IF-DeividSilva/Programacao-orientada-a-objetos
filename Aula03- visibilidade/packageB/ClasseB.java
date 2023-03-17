package packageB;

import PackageA.Principal;


public class ClasseB {
    
    //extends Principal {

    public ClasseB(){
        Principal p = new Principal();
        
        System.out.println(p.primeiro);
      //  System.out.println(p.segundo); nao tem acesso
     // System.out.println(p.terceiro); nao tem acesso     
     //System.out.println(p.quartp); nao tem acesso 
    }
    
}