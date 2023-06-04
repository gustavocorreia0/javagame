import java.util.*;


public class JavaQuest {

    public static Personagem player;
    public static Inimigo enemy;
    static int easyOrHard;


    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\tBem-Vindo(a) ao JavaQuest!");
        System.out.println("Digite o nome do seu personagem: ");
        String nome_player = scanner.nextLine();
        Thread.sleep(750);

        System.out.println("Deseja jogar em qual dificuldade?\n[1] Fácil\n[2] Médio\n[3] Dificil\n[4] Insano");
        easyOrHard = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Modo de jogo alterado!");
        Thread.sleep(750);
        
        System.out.println("\nEm um mundo distante da realidade presente, no ano de 2115, a escassez da vegetação se torna um fator determinante no mundo.");
        System.out.println("O vale do pico da neblina está sendo tomado pela empresa Y que planeja cortar todas as últimas árvores que existem no planeta!");

        player = new Personagem(nome_player);
        player.setVida(30);
        player.setMana(30);
        player.setVigor(30);
        Inimigo inimigo1 = new Inimigo("Soldado", 0, easyOrHard);
        Inimigo inimigo2 = new Inimigo("Sargento", 3, easyOrHard);
        Inimigo inimigo3 = new Inimigo("Tenente", 6, easyOrHard);
        Inimigo inimigo4 = new Inimigo("Major", 9, easyOrHard);
        Inimigo inimigo5 = new Inimigo("General", 18, easyOrHard);

       
        // ------------------------------------------------------------------------------ //
        
        enemy = inimigo1;
        System.out.printf("%s encontrou o %s no caminho para o vale!\nLogo o %s percebeu que a intenção do guerreiro era tomar o vale!\nO inimigo ataca primeiro!", JavaQuest.player.getNome(), JavaQuest.enemy.getNome(), JavaQuest.enemy.getNome());
        enemy.setVida(30);
        Ataque.adicionarAtaquesInimigos(Ataque.soco, Ataque.chute, Ataque.rasteira, Ataque.tiro);
        Combate.Batalha(1,30,30);
        Combate.Reset(50, 50, 50);
        
        if (Armeiro.EscolhaEquipamento()) {
            Armeiro.EquiparAtaque(3, EquipamentoAtaque.EquipamentosAtaque);
        }
        else {
            Armeiro.EquiparDefesa(3, EquipamentoDefesa.EquipamentosDefesa);
        }

        
        enemy = inimigo2;
        System.out.println(player.getNome() + " encontrou o " + enemy.getNome() + " que o ataca imediatamente!");
        enemy.setVida(50);
        Ataque.adicionarAtaquesInimigos(Ataque.flecha, Ataque.tiro, Ataque.apunhalada, Ataque.chute);
        Defesa.adicionarDefesasInimigos(Defesa.armaduraAvancada, Defesa.defesaBasica, Defesa.esquiva, Defesa.barreiraAvancada);
        Combate.Batalha(1,50,50);
        Combate.Reset(75, 75, 50);
        

        if (Armeiro.EscolhaEquipamento()) {
            Armeiro.EquiparAtaque(3, EquipamentoAtaque.EquipamentosAtaque);
        }
        else {
            Armeiro.EquiparDefesa(3, EquipamentoDefesa.EquipamentosDefesa);
        }

        enemy = inimigo3;
        System.out.println(player.getNome() + " chega à entrada do vale onde encontra o " + enemy.getNome() + " para enfrentá-lo!");
        enemy.setVida(90);
        Ataque.adicionarAtaquesInimigos(Ataque.tiro, Ataque.tiroAvancado, Ataque.flechaMagica, Ataque.flecha);
        Defesa.adicionarDefesasInimigos(Defesa.defesaMagica, Defesa.defesaRapidaAvancada, Defesa.esquiva, Defesa.juggernaut);        
        Combate.Batalha(1,75,75);
        Combate.Reset(100, 100, 50);
        

        if (Armeiro.EscolhaEquipamento()) {
            Armeiro.EquiparAtaque(3, EquipamentoAtaque.EquipamentosAtaque);
        }
        else {
            Armeiro.EquiparDefesa(3, EquipamentoDefesa.EquipamentosDefesa);
        }

        enemy = inimigo4;
        System.out.println(player.getNome() + " foi impedido de chegar a última árvore do vale por " + enemy.getNome() + " que o ataca imediatamente!");
        enemy.setVida(150);
        Ataque.adicionarAtaquesInimigos(Ataque.apunhalada, Ataque.apunhaladaAvancado, Ataque.rajada, Ataque.rajadaAvancado);
        Defesa.adicionarDefesasInimigos(Defesa.armaduraAvancada, Defesa.defesaBasica, Defesa.esquiva, Defesa.barreiraAvancada);
        Combate.Batalha(1,100,100);
        Combate.Reset(150, 150, 50);
        

        if (Armeiro.EscolhaEquipamento()) {
            Armeiro.EquiparAtaque(2, EquipamentoAtaque.EquipamentosAtaqueLendarios);
        }
        else {
            Armeiro.EquiparDefesa(2, EquipamentoDefesa.EquipamentosDefesaLendarios);
        }

        enemy = inimigo5;

        System.out.println("\nA última árvore do vale está a sua frente, a última esperança pra humanidade!");
        Thread.sleep(750);
        System.out.printf("%s é encurralado por %s!", JavaQuest.player.getNome(), JavaQuest.enemy.getNome());
        enemy.setVida(300);
        Ataque.adicionarAtaquesInimigos(Ataque.ataqueAncestral, Ataque.tiroVacuo, Ataque.cortesOrientais, Ataque.impactoPrimordial,Ataque.tiroCelestial, Ataque.fissuraAncestral);
        Defesa.adicionarDefesasInimigos(Defesa.kryptoDefesa, Defesa.auraCosmica, Defesa.esquiva, Defesa.netherite);
        Thread.sleep(1250);
        System.out.println("Que comece a batalha final!");
        Combate.Batalha(2,150,150);

        System.out.println("Depois da longa batalha, reforços ambientalistas chegam ao vale para assegurar a última árvore!");
        System.out.println("Sementes da árvore foram espalhadas ao mundo depois dessa batalha!");
        System.out.printf("%s foi consagrado herói das árvores e de toda a flora mundial.", JavaQuest.player.getNome());

        System.out.println("Você terminou o jogo JavaQuest!");
       
        scanner.close();

    }

}
