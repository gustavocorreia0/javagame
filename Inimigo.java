public class Inimigo {

    private String name;
    private int vida;
    private int bonusAtaque;
    private int bonusDefesa;
    static int i;
    

    
        // Construtor
    public Inimigo(String nome, int bonus, int dificuldade){
        this.name = nome;
        this.bonusAtaque = (bonus * dificuldade);
        this.bonusDefesa = (bonus * dificuldade);
        
    }

    

    // Nome
    public String getNome() {
        return name;
    }

        // Vida
    public int getVida() {
        return vida;
    }
    public void setVida(int pv){
        this.vida = pv;
    }
    public void setVida(int pv, int reduce){
        this.vida = pv - reduce;
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
    
    public static int dificuldade(int op) {
         
        switch (op) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 5;
                break;
            case 3:
                i = 15;
                break;
            case 4:
                i = 30;
                break;
            default:
        }
        
        return i;
        
    }



    public boolean morte() throws InterruptedException {
        
        boolean resultado = false;
        
        if (JavaQuest.enemy.getVida() <= 0) {
            System.out.println("\n" + JavaQuest.enemy.getNome() + " foi derrotado");
            Thread.sleep(1000);
            resultado = true;
        }

        return resultado;
    }

}
