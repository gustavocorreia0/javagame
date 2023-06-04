import java.util.*;

public class Ataque {

   private String nome;
   private int dano;
   private int custoMana;
   private int probabilidade;
   private String fraseSucesso;
   private String fraseFalha;

   static Random aleatorio = new Random();
   

      // Construtor
      public Ataque(String nome, int dano, int mana, int probabilidade, String sucesso, String falha) {
         this.nome = nome;
         this.dano = dano;
         this.custoMana = mana;
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
      public int getDano() {
         return dano;
      }
      public void setDano(int damage) {
         this.dano = damage;
      }

      // Custo Mana
      public int getCustoMana() {
         return custoMana;
      }
      public void setCustoMana(int mana) {
         this.custoMana = mana;
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

      // Frase falha
      public String getFraseFalha() {
         return fraseFalha;
      }
      public void setFraseFalha(String frase) {
         this.fraseFalha = frase;
      }



      // TODOS os ataques
      public static Ataque soco = new Ataque("Soco direto", 4, 0, (100- Inimigo.dificuldade(JavaQuest.easyOrHard)),
      JavaQuest.player.getNome() + " acertou um belo soco no " + JavaQuest.player.getNome(), JavaQuest.player.getNome() + " errou o soco");

      public static Ataque rasteira = new Ataque("Rasteira rápida", 6, 1, (90 - Inimigo.dificuldade(JavaQuest.easyOrHard)),
      JavaQuest.player.getNome() + " acabou escorregando ao atacar " + JavaQuest.player.getNome(), JavaQuest.player.getNome() + " acabou dando rasteira em uma pedra");

      public static Ataque chute = new Ataque("Chute concentrado", 8, 4, (80 - Inimigo.dificuldade(JavaQuest.easyOrHard)),
      JavaQuest.player.getNome() + " acertou um chute nas costelas do " + JavaQuest.player.getNome(),JavaQuest.player.getNome() + " chutou o ar!");

      public static Ataque tiro = new Ataque("Tiro", 11, 7, (70 - Inimigo.dificuldade(JavaQuest.easyOrHard)),
      JavaQuest.player.getNome() + " acertou o tiro no busto do " + JavaQuest.player.getNome(),JavaQuest.player.getNome() + " deixou a munição cair!");

      public static Ataque tiroAvancado = new Ataque("Tiro de Laser", aleatorio.nextInt(10,19), 12, 80 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " acertou o tiro no inimigo", JavaQuest.player.getNome() + " não carregou a arma!");

      public static Ataque tiroCerteiro = new Ataque("Tiro Certeiro", aleatorio.nextInt(10,19), 10, 100 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " acertou em cheio o tiro no inimigo", "A arma falhou e acabou engasgando com munição.");

      public static Ataque tiroConcentrado = new Ataque("Tiro de Franco Atirador", aleatorio.nextInt(10,19), 16, 80 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " acertou em cheio o tiro no inimigo", JavaQuest.player.getNome() + " deixou a munição cair");

      public static Ataque rajada = new Ataque("Tiro à queima-roupa", aleatorio.nextInt(10,19), 6, 100 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " conclui a rajada com sucesso", JavaQuest.player.getNome() + " queimou a mão");

      public static Ataque rajadaAvancado = new Ataque("Tiro incendiário", aleatorio.nextInt(10,19), 6, 60 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " conclui a rajada avancada com sucesso", JavaQuest.player.getNome() + " errou o alvo");

      public static Ataque apunhalada = new Ataque("Apunhalar", aleatorio.nextInt(10,19), 4, 70 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " apunhalou o inimigo com sucesso", JavaQuest.player.getNome() + " escorregou enquanto corria");

      public static Ataque apunhaladaAvancado = new Ataque("Corte profundo", aleatorio.nextInt(10,19), 9, 80 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " apunhalou o inimigo com sucesso", JavaQuest.player.getNome() + " não amolou a faca suficientemente");

      public static Ataque flecha = new Ataque("Flechada", aleatorio.nextInt(10,19), 4, 80 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " acertou o alvo", JavaQuest.player.getNome() + " errou o alvo");

      public static Ataque flechaMagica = new Ataque("Flechada Mágica", aleatorio.nextInt(10,19), 12, 70 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " lembrou as palavras mágicas e acertou o encantamento", JavaQuest.player.getNome() + " esqueceu as palavras mágicas e falhou no encantamento");

      public static Ataque flechaVenenosa = new Ataque("Flecha de Veneno", aleatorio.nextInt(10,19), 14, 80 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " usou o veneno na hora certa! ", JavaQuest.player.getNome() + " derramou o veneno no chão");

      public static Ataque tiroStun = new Ataque("Tiro Eletrizante", aleatorio.nextInt(10,19), 12, 70 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " eletrocutou o inimigo", JavaQuest.player.getNome() + " esqueceu de carregar a arma");
          
      public static Ataque Investida = new Ataque("Investida", aleatorio.nextInt(10,19), 7, 90 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " teve uma investida foi muito bem sucedida", JavaQuest.player.getNome() + " caiu enquanto tentava aplicar o ataque");

      public static Ataque cozinharGranada = new Ataque("Cozinhar Granada", aleatorio.nextInt(10,19), 14, 60 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + ",A granada foi extremamente eficaz", "Sua granada falhou!");

      public static Ataque granada = new Ataque("Arremessar Granada", aleatorio.nextInt(10,19), 8, 60 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + ", a granada foi extremamente eficaz", JavaQuest.player.getNome() + " mirrou errado");

      public static Ataque impactoEletrico = new Ataque("Impacto Eletrico", aleatorio.nextInt(10,19), 15, 90 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " concluiu o ataque com sucesso", JavaQuest.player.getNome() + " enfiou o bastão no chão e comeu terra");

      public static Ataque arremessoLanca = new Ataque("Arremessar lança", aleatorio.nextInt(10,19), 9, 50 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " arremessou a lança com sucesso", JavaQuest.player.getNome() + " falhou no arremesso da lança");
          
      public static Ataque ataqueAncestral = new Ataque("Ataque Ancestral", aleatorio.nextInt(18,26), 9, 80 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " acertou o inimigo com a ancestralidade", JavaQuest.player.getNome() + " errou miseravelmente o ataque");

      public static Ataque fissuraAncestral = new Ataque("Fissura Ancestral", aleatorio.nextInt(21,31), 11, 90 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " realizou a fissura e feriu o inimigo", JavaQuest.player.getNome() + " fez uma fissura longe demais do inimigo");

      public static Ataque tiroCelestial = new Ataque("Tiro Celestial", aleatorio.nextInt(18,26), 8, 70 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " acertou o tiro", JavaQuest.player.getNome() + " errou o tiro");
          
      public static Ataque bombardeioCelestial = new Ataque("Bombardeio Celestial", aleatorio.nextInt(21,31), 13, 80 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + ", O bombardeio acertou em cheio", " + O Bombardeiro acertou alguns metros distante do inimigo");

      public static Ataque tiroVacuo = new Ataque("Tiro À Vácuo", aleatorio.nextInt(18,26), 7, 80 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " acertou o tiro", JavaQuest.player.getNome() + " errou o tiro") ; 
  
      public static Ataque gravidade30 = new Ataque("Gravidade 30", aleatorio.nextInt(21,31), 14, 100 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " conseguiu usar sua habilidade gravitacional", JavaQuest.player.getNome() + " não conseguiu usar sua habilidade gravitacional!") ; 

      public static Ataque impactoPrimordial = new Ataque("Impacto Primordial", aleatorio.nextInt(18,26), 10, 90 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " deu um golpe certeiro com o martelo", JavaQuest.player.getNome() + " bateu com o martelo torto no chão") ;

      public static Ataque terremotoPrimordial = new Ataque("Terremoto Primordial", aleatorio.nextInt(21,31), 16, 90 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " causou um tremor inesquecivel", JavaQuest.player.getNome() + " não teve forças suficientes") ; 

      public static Ataque cortesOrientais = new Ataque("Cortes Orientais", aleatorio.nextInt(18,26), 9, 90 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " acertou o golpe", JavaQuest.player.getNome() + " errou 1cm de distância ao aplicar o ataque.") ; 

      public static Ataque rasgarTerreno = new Ataque("Rasga-Chão", aleatorio.nextInt(21,31), 12, 100 - Inimigo.dificuldade(JavaQuest.easyOrHard),
      JavaQuest.player.getNome() + " teve forças suficientes para concluir o ataque", JavaQuest.player.getNome() + " não usou força suficiente para rasgar o terreno.") ; 

 
      // ArrayLists dos todos os Ataques 
      public static List<Ataque> Ataques = new ArrayList<>(Arrays.asList(soco, rasteira, chute, tiro, tiroAvancado, tiroCerteiro, 
      tiroConcentrado, rajada, rajadaAvancado, apunhalada, apunhaladaAvancado, flecha, flechaMagica, flechaVenenosa, tiroStun, 
      Investida, cozinharGranada, granada,impactoEletrico, arremessoLanca, ataqueAncestral, fissuraAncestral, tiroCelestial,
      bombardeioCelestial, tiroVacuo, gravidade30, impactoPrimordial, terremotoPrimordial, cortesOrientais, rasgarTerreno));

      public static List<Ataque> AtaquesPlayer = new ArrayList<>(Arrays.asList(soco, rasteira, chute, tiro));

      public static List<Ataque> AtaquesInimigos = new ArrayList<Ataque>();


      // Métodos para mexer nas ArrayLists 
      public static void adicionarAtaquesPlayer(Ataque x){
         AtaquesPlayer.add(x);
      }

      public static void adicionarAtaquesInimigos(Ataque w, Ataque x, Ataque y, Ataque z){
         AtaquesInimigos.clear();
         AtaquesInimigos.add(w);
         AtaquesInimigos.add(x);
         AtaquesInimigos.add(y);
         AtaquesInimigos.add(z);
      }

      public static void adicionarAtaquesInimigos(Ataque u, Ataque v, Ataque w, Ataque x, Ataque y, Ataque z){
         AtaquesInimigos.clear();
         AtaquesInimigos.add(u);
         AtaquesInimigos.add(v);
         AtaquesInimigos.add(w);
         AtaquesInimigos.add(x);
         AtaquesInimigos.add(y);
         AtaquesInimigos.add(z);
      }

}  

