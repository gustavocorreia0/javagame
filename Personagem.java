public class Personagem {
    private String name;
    private int vida;
    private int mana;
    private int vigor;
    private int bonusAtaque = 0;
    private int bonusDefesa = 0;
    private int pocaoCura = 3;
    private int pocaoMana = 3;


    //constructor
    public Personagem(String n){
      this.name = n;
    }
    public Personagem(int pv){
        this.vida = pv;
    }


    // Nome
    public String getNome() {
        return name;
    }
    public void setNome(String nome) {
        this.name = nome; 
    }

    // Vida
    public int getVida() {
        return vida;
    }
    public void setVida(int pv) {
        this.vida = pv; 
    }
    public void setVida(int pv, int reduce){
        this.vida = pv - reduce;
    }

    // Mana
    public int getMana() {
        return mana;
    }
    public void setMana(int pm) {
        this.mana = pm;
    }

    // Vigor 
    public int getVigor() {
        return vigor;
    }
    public void setVigor(int vig) {
        this.vigor = vig;
    }

    // Bonus Ataque
    public int getbonusAtaque() {
        return bonusAtaque;
    }
    public void setbonusAtaque(int bonusAtaque) {
        this.bonusAtaque += bonusAtaque; 
    }

    // Bonus Defesa
    public int getbonusDefesa() {
        return bonusDefesa;
    }
    public void setbonusDefesa(int bonusDefesa) {
        this.bonusDefesa += bonusDefesa; 
    }

    // Poção de Cura
    public int getPocaoCura() {
        return pocaoCura;
    }
    public void setPocaoCura(int gastPocao){
        this.pocaoCura = gastPocao;
    }

    // Poção de Mana
    public int getPocaoMana() {
        return pocaoMana;
    }
    public void setPocaoMana(int gastPocao){
        this.pocaoMana = gastPocao;
    }


    public void morte() throws InterruptedException {
        if (JavaQuest.player.getVida() <= 0) {
            System.out.println("\n" + JavaQuest.player.getNome() + " morreu...");
            Thread.sleep(1000);
            System.out.println("\tFIM DE JOGO!");
            System.exit(0);
        }
    }


    public void fadiga() throws InterruptedException {
        if (JavaQuest.player.getVigor() <= 0) {
            System.out.println("\n" + JavaQuest.player.getNome() + " acabou morrendo fadigado(a)");
            Thread.sleep(1000);
            System.out.println("\tFIM DE JOGO!");
            System.exit(0);
        }
    }

}
