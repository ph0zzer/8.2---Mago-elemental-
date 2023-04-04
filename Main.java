class Main {
  public static void main(String[] args) {


      PedraAgua PA1 = new PedraAgua();
      PedraFogo PF1 = new PedraFogo();
      PedraAr PAr1 = new PedraAr();
      PedraTerra PT1 = new PedraTerra();
      Cajado C = new Cajado();
    

    C.Ataque(PA1, PA1);

    C.Ataque(PF1, PF1);

    C.Ataque(PAr1, PAr1);

    C.Ataque(PT1, PT1);

    C.Ataque(PAr1, PF1);

    C.Ataque(PT1, PF1);

    C.Ataque(PT1, PA1);

    C.Ataque(PAr1, PA1);

    
  }
}