import java.util.*;

public class Defesa {

    private String nome;
    private int defesa;
    private int custoVigor;
    private int probabilidade;
    private String fraseSucesso;
    private String fraseFalha;

    static Random aleatorio = new Random();


        // Construtor
        public Defesa(String nome, int def, int vigor, int probabilidade, String sucesso, String falha) {
            this.nome = nome;
            this.defesa = def;
            this.custoVigor = vigor;
            this.probabilidade = probabilidade;
            this.fraseSucesso = sucesso;
            this.fraseFalha = falha;
        }


            // Nome
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
       
            // Dano
        public int getDefesa() {
            return defesa;
        }
        public void setDefesa(int def) {
            this.defesa = def;
        }
        
            // Custo Mana
        public int getCustoVigor() {
            return custoVigor;
        }
        public void setCustoVigor(int vigor) {
            this.custoVigor = vigor;
        }
        
            // Probabilidade
        public int getProbabilidade() {
            return probabilidade;
        }
        public void setProbabilidade(int range) {
            this.probabilidade = range;
        }
        
            // Frase Sucesso
        public String getFraseSucesso() {
            return fraseSucesso;
        }
        public void setFraseSucesso(String frase) {
            this.fraseSucesso = frase;
        }

            // Frase Sucesso
        public String getFraseFalha() {
            return fraseFalha;
        }
        public void setFraseFalha(String frase) {
            this.fraseFalha = frase;
        }



        // TODOS as defesas
        public static Defesa defesaBasica = new Defesa("Defesa básica", 3, 1, 90 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        JavaQuest.player.getNome() + " concluiu a defesa com sucesso", JavaQuest.player.getNome() + " fracassou na defesa!");

        public static Defesa levantarEscudo = new Defesa("Levantar Escudo", 5, 4, 75 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        JavaQuest.player.getNome() + " levantou o escudo no tempo certo", JavaQuest.player.getNome() + " não levantou o escudo a tempo!");

        public static Defesa esquiva = new Defesa("Esquiva", 0, 1, 90 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        "Concluiu a esquiva com sucesso", JavaQuest.player.getNome() + "  scorregou enquanto tentava esquivar!");

        public static Defesa barreira = new Defesa("Conjurar Barreira", aleatorio.nextInt(6,13), 10, 60 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        JavaQuest.player.getNome() + "  conjurou a barreira a tempo", JavaQuest.player.getNome() + "  foi impedido de conjurar barreira!");

        public static Defesa meditacao = new Defesa("Paz Interior", 50, 3, 10 - (Inimigo.dificuldade(JavaQuest.easyOrHard)/5), 
        JavaQuest.player.getNome() + "  conseguiu meditar e se concentrar para o próximo Defesa", JavaQuest.player.getNome() + "  teve sua paz afetada e não conseguiu meditar!");

        public static Defesa barreiraAvancada = new Defesa("Conjurar Muralha", aleatorio.nextInt(8,13), 17, 60 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        JavaQuest.player.getNome() + "  conjurou a barreira com perfeição!", JavaQuest.player.getNome() + "  se atrapalhou durante o processo!");

        public static Defesa armaduraAvancada = new Defesa("Armadura Militar", aleatorio.nextInt(8,13), 9, 80 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        "A nanotecnologia agiu com eficácia", "A nanotecnologia não foi ativada rapidamente");

        public static Defesa defesaMagica = new Defesa("Proteção Mágica", aleatorio.nextInt(6,15), 8, 85 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        JavaQuest.player.getNome() + "  agiu como um mago profissional!", JavaQuest.player.getNome() + "  esqueceu as palavrinhas mágicas!");

        public static Defesa defesaRapidaAvancada = new Defesa("Movimentos Agéis", aleatorio.nextInt(6,13), 18, 70 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        JavaQuest.player.getNome() + "  foi agil e concluiu a defesa com sucesso", JavaQuest.player.getNome() + "  caiu envergonhosamente enquanto tentava se defender!");

        public static Defesa juggernaut = new Defesa("Esfera de proteção", aleatorio.nextInt(11,21), 9, 60 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        "Esfera de proteção criada com successo", "Não conseguiu resistir ao Defesa!");
 
        public static Defesa auraCosmica = new Defesa("Proteção Estelar", aleatorio.nextInt(11,19), 16, 80 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        JavaQuest.player.getNome() + "  se defendeu com sucesso", JavaQuest.player.getNome() + "  não conseguiu carregar a aura a tempo!");

        public static Defesa armaduraEspectral = new Defesa("Defesa Espectral", aleatorio.nextInt(11,19), 16, 85 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        JavaQuest.player.getNome() + "  convocou espectros suficientes para a defesa", "Não conseguiu convocar espectros suficientes para a defesa!");

        public static Defesa kryptoDefesa = new Defesa("Krypto Defesa", aleatorio.nextInt(11,19), 16, 90 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        "A Kryptonita agiu perfeitamente!", "A armadura crypto atrapalhou na defesa de Lorax!");

        public static Defesa exoesqueleto = new Defesa("Imunidade Subatômica", aleatorio.nextInt(11,19), 16, 85 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        "O exosqueleto agiu com eficácia", "O exoesqueleto não o deixou vulneravel a tempo!");

        public static Defesa netherite = new Defesa("Blindagem de Netherite", aleatorio.nextInt(11,19), 16, 95 - Inimigo.dificuldade(JavaQuest.easyOrHard), 
        "A blindagem de Netherite  defendeu o Defesa", JavaQuest.player.getNome() + "  não percebeu o Defesa!");

        
        
        public static ArrayList<Defesa> Defesa = new ArrayList<>(Arrays.asList(defesaBasica, levantarEscudo, esquiva, barreira, 
        meditacao, barreiraAvancada, armaduraAvancada, defesaMagica, defesaRapidaAvancada, juggernaut, auraCosmica, armaduraEspectral,
        kryptoDefesa, exoesqueleto, netherite));

        public static ArrayList<Defesa> DefesasPlayer = new ArrayList<>(Arrays.asList(defesaBasica, levantarEscudo, esquiva));

        public static ArrayList<Defesa> DefesasInimigos = new ArrayList<>(Arrays.asList(defesaBasica, levantarEscudo, esquiva));


        // Métodos para mexer nas ArrayLists 
      public static void adicionarDefesasPlayer(Defesa x){
        DefesasPlayer.add(x);
     }


     public static void adicionarDefesasInimigos(Defesa x, Defesa y, Defesa z, Defesa a){
        DefesasInimigos.clear();
        DefesasInimigos.add(x);
        DefesasInimigos.add(y);
        DefesasInimigos.add(z);
        DefesasInimigos.add(a);
     }

     public static void adicionarDefesasInimigos(Defesa v, Defesa w, Defesa x, Defesa y, Defesa z, Defesa a){
        DefesasInimigos.add(v);
        DefesasInimigos.add(w);
        DefesasInimigos.add(x);
        DefesasInimigos.add(y);
        DefesasInimigos.add(z);
        DefesasInimigos.add(a);
     }



    public static ArrayList<Defesa> getDefesasPlayer() {
        return DefesasPlayer;
    }

    public static ArrayList<Defesa> getDefesasInimigos() {
        return DefesasInimigos;
    }   
}
