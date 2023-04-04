  class Cajado{

    
    void Ataque(PedraAgua x, PedraAgua y){

      System.out.println("\nDano de Agua! Valor:"+ (x.dano + y.dano));
      
    }

    void Ataque(PedraAr x, PedraAr y){

      System.out.println("\nDano de Ar! Valor:"+ (x.dano + y.dano));
      
    }
    
    void Ataque(PedraFogo x, PedraFogo y){

      System.out.println("\nDano de Fogo! Valor:"+ (x.dano + y.dano));
      
    }
    
    void Ataque(PedraTerra x, PedraTerra y){

      System.out.println("\nDano de Terra! Valor:"+ (x.dano + y.dano));
      
    }

    void Ataque(PedraAr x, PedraFogo y){

      System.out.println("\nDano de Combustão! Valor:"+ (x.dano + y.dano));
      
    }

    void Ataque(PedraTerra x, PedraFogo y){

      System.out.println("\nDano de Lava! Valor:"+ (x.dano + y.dano));
      
    }

    void Ataque(PedraTerra  x, PedraAgua y){

      System.out.println("\nDano de Planta! Valor:"+ (x.dano + y.dano));
      
    }

    void Ataque(PedraAr x, PedraAgua y){

      System.out.println("\nDano de Neve! Valor:"+ (x.dano + y.dano));
      
    }


    

    
  }