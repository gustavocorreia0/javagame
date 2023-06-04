import java.util.*;

public class Combate {

    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();
    static int i;
    static int opcaoPlayer;
    static int opcaoEnemy;
    static int probabilidadePlayer;
    static int probabilidadeEnemy;
    static String cura;
    static String mana;


    // Turno do Personagem
    public static void turnoAliado() throws InterruptedException{
        
        System.out.println("\nSeu Turno!");

        Thread.sleep(1000);
      
        System.out.println("Seus Pontos de Vida: " + JavaQuest.player.getVida());
        System.out.println("Pontos de vida do " + JavaQuest.enemy.getNome() + ": " + JavaQuest.enemy.getVida());

        Thread.sleep(2000);

        System.out.println("\nQual ataque deseja usar?");
        
        Thread.sleep(1000);
        
        for (i=0; i<Ataque.AtaquesPlayer.size(); i++) {
            System.out.println("[" + i + "] " + (Ataque.AtaquesPlayer.get(i)).getNome() + ": Causa " + ((Ataque.AtaquesPlayer.get(i)).getDano() + JavaQuest.player.getbonusAtaque()) + " de dano no inimigo");
            Thread.sleep(600);
        }

        System.out.println("Seus Pontos de Mana: " + JavaQuest.player.getMana());

        Thread.sleep(600);
        
        while (true) {
            
            System.out.println("Escolha entre [0 - " + (Ataque.AtaquesPlayer.size()-1) + "]");
            
            while (true) {
                
                try {
                    opcaoPlayer = teclado.nextInt();
                    break;
                } catch(InputMismatchException e){
                    System.out.println("Por favor, digite um número.");
                    teclado.next();
                }

            }
            
            if ((opcaoPlayer >= 0) && (opcaoPlayer < Ataque.AtaquesPlayer.size())) {
                
                if (Ataque.AtaquesPlayer.get(opcaoPlayer).getCustoMana() <= JavaQuest.player.getMana()) {
                    break;
                }
                else {
                    System.out.println("Você não tem mana suficiente para usar esse ataque!");
                }

            }
            else {
                System.out.println("Opção Inválida!");
            }
        }

        JavaQuest.player.setMana(JavaQuest.player.getMana() - Ataque.AtaquesPlayer.get(opcaoPlayer).getCustoMana());

        Thread.sleep(1000);
        
        System.out.println(JavaQuest.enemy.getNome() + " está escolhendo suas defesas...");
        
        Thread.sleep(2000);
        
        opcaoEnemy = aleatorio.nextInt((Defesa.DefesasInimigos.size()));
        
        probabilidadeEnemy = aleatorio.nextInt(101);

        if (opcaoEnemy == Defesa.DefesasInimigos.indexOf(Defesa.esquiva)) {
            
            if (probabilidadeEnemy >= 60) {
                System.out.println("O " + JavaQuest.enemy.getNome() + " usou " + Defesa.esquiva.getNome() + " e desviou do seu golpe!");
            }

            else {
                System.out.println("O " + JavaQuest.enemy.getNome() + " tentou desviar mas acabou falhando miseravelmente");
                System.out.println("O ataque " + Ataque.AtaquesPlayer.get(opcaoPlayer).getNome() + " causou " + (Ataque.AtaquesPlayer.get(opcaoPlayer).getDano() + JavaQuest.player.getbonusAtaque()) + " no " + JavaQuest.enemy.getNome());
                JavaQuest.enemy.setVida(JavaQuest.enemy.getVida() - (Ataque.AtaquesPlayer.get(opcaoPlayer).getDano() + JavaQuest.player.getbonusAtaque()));            
            }
        }

        else {
            
            probabilidadePlayer = aleatorio.nextInt(101);

            if (probabilidadePlayer < Ataque.AtaquesPlayer.get(opcaoPlayer).getProbabilidade()) {

                if (probabilidadeEnemy <= Defesa.DefesasInimigos.get(opcaoEnemy).getProbabilidade()) {
                    System.out.println("O inimigo usou " + Defesa.DefesasInimigos.get(opcaoEnemy).getNome() + " que defende " + (Defesa.DefesasInimigos.get(opcaoEnemy).getDefesa() + JavaQuest.enemy.getbonusDefesa()) + " de dano!");

                    if (Defesa.DefesasInimigos.get(opcaoEnemy).getDefesa() + JavaQuest.enemy.getbonusDefesa() >= Ataque.AtaquesPlayer.get(opcaoPlayer).getDano() + JavaQuest.player.getbonusAtaque()){
                        System.out.println(JavaQuest.enemy.getNome() + " conseguiu defender seu ataque por completo");
                    }

                    else {
                        Ataque.AtaquesPlayer.get(opcaoPlayer).getFraseSucesso();
                        System.out.println("Dano causado ao " + JavaQuest.enemy.getNome() + ": " + ((Ataque.AtaquesPlayer.get(opcaoPlayer).getDano() + JavaQuest.player.getbonusAtaque()) - (Defesa.DefesasInimigos.get(opcaoEnemy).getDefesa() + JavaQuest.enemy.getbonusDefesa())));
                        JavaQuest.enemy.setVida(JavaQuest.enemy.getVida(), (Ataque.AtaquesPlayer.get(opcaoPlayer).getDano() + JavaQuest.player.getbonusAtaque()) - (Defesa.DefesasInimigos.get(opcaoEnemy).getDefesa() + JavaQuest.enemy.getbonusDefesa()));
                    }

                }

                else {
                    System.out.println("O " + JavaQuest.enemy.getNome() + " tentou se defender usando " + Defesa.DefesasInimigos.get(opcaoEnemy).getNome() + " mas acabou não tendo sucesso!");
                    System.out.println("Dano causado ao " + JavaQuest.enemy.getNome() + ": " + ((Ataque.AtaquesPlayer.get(opcaoPlayer).getDano() + JavaQuest.player.getbonusAtaque())));
                    JavaQuest.enemy.setVida(JavaQuest.enemy.getVida(), (Ataque.AtaquesPlayer.get(opcaoPlayer).getDano() + JavaQuest.player.getbonusAtaque()));
                }

            }

            else {
                System.out.println(Ataque.AtaquesPlayer.get(opcaoPlayer).getFraseFalha());
            }

        }
        
        Thread.sleep(1000);

        }


    public static void TurnoInimigo() throws InterruptedException {

        System.out.println("\nTurno do Inimigo!");
        Thread.sleep(1500);
        
        System.out.println("Seus Pontos de Vida: " + JavaQuest.player.getVida());
        System.out.println("Pontos de vida do " + JavaQuest.enemy.getNome() + ": " + JavaQuest.enemy.getVida());
        Thread.sleep(1500);

        System.out.printf("\nO %s está escolhendo seus ataques...", JavaQuest.enemy.getNome());
        opcaoEnemy = aleatorio.nextInt(0, Ataque.AtaquesInimigos.size());
        Thread.sleep(1500);

        System.out.println("\nQual movimento de defesa deseja usar?");
        Thread.sleep(1000);

        for (i = 0; i<Defesa.DefesasPlayer.size(); i++) {
            
            if (i == Defesa.DefesasPlayer.indexOf(Defesa.esquiva)) {
                System.out.println("[" + i + "] " + Defesa.DefesasPlayer.get(i).getNome() + ": esquiva de um ataque inimigo.");
            }
            else{
                System.out.println("[" + i + "] " + Defesa.DefesasPlayer.get(i).getNome() + ": defende " + (Defesa.DefesasPlayer.get(i).getDefesa() + JavaQuest.player.getbonusDefesa()) + " de dano do ataque inimigo");
            }
            Thread.sleep(750);

        }

        System.out.println("Seus Pontos de Vigor: " + JavaQuest.player.getVigor());
        Thread.sleep(1000);

        while (true) {
            
            System.out.println("Escolha entre [0 - " + (Defesa.DefesasPlayer.size()-1) + "]");
            
            while (true) {
                
                try {
                    opcaoPlayer = teclado.nextInt();
                    break;
                } catch(Exception f){
                    System.out.println("Valor Inválido!");
                    teclado.next();
                }

            }

            if ((opcaoPlayer >= 0) && (opcaoPlayer < Defesa.DefesasPlayer.size())) {
                
                if (Defesa.DefesasPlayer.get(opcaoPlayer).getCustoVigor() <= JavaQuest.player.getVigor()) {
                    break;
                }
                else {
                    System.out.println("Você está cansado demais para usar essa defesa!");
                }

            }
            else {
                System.out.println("Opção Inválida!");
            }
        }

        JavaQuest.player.setVigor(JavaQuest.player.getVigor() - Defesa.DefesasPlayer.get(opcaoPlayer).getCustoVigor());

        probabilidadePlayer = aleatorio.nextInt(101);
        probabilidadeEnemy = aleatorio.nextInt(101);

        if (opcaoPlayer == Defesa.DefesasPlayer.indexOf(Defesa.esquiva)) {
            
            if (probabilidadePlayer < Defesa.DefesasPlayer.get(opcaoPlayer).getProbabilidade()) {
                System.out.println(JavaQuest.player.getNome() + " desviou do ataque desferido!");
            }

            else {
                System.out.println("O " + JavaQuest.player.getNome() + " tentou desviar mas acabou falhando miseravelmente");
                System.out.println("O ataque " + Ataque.AtaquesInimigos.get(opcaoEnemy).getNome() + " causou " + (Ataque.AtaquesInimigos.get(opcaoEnemy).getDano() + JavaQuest.enemy.getbonusAtaque()) + " de dano em " + JavaQuest.player.getNome());
                JavaQuest.player.setVida(JavaQuest.player.getVida() - (Ataque.AtaquesInimigos.get(opcaoEnemy).getDano() + JavaQuest.enemy.getbonusAtaque()));
            }
        }

        else {

            if (probabilidadeEnemy <= Ataque.AtaquesInimigos.get(opcaoEnemy).getProbabilidade()) {
                
                System.out.println(JavaQuest.enemy.getNome() + " usou o ataque " + Ataque.AtaquesInimigos.get(opcaoEnemy).getNome() + " que causa " + (Ataque.AtaquesInimigos.get(opcaoEnemy).getDano() + JavaQuest.enemy.getbonusAtaque()) + " de dano.");
                Thread.sleep(1000);

                if (probabilidadePlayer <= Defesa.DefesasPlayer.get(opcaoPlayer).getProbabilidade()) {

                    System.out.println(Defesa.DefesasPlayer.get(opcaoPlayer).getFraseSucesso());

                    if ((Defesa.DefesasPlayer.get(opcaoPlayer).getDefesa() + JavaQuest.player.getbonusDefesa()) >= Ataque.AtaquesInimigos.get(opcaoEnemy).getDano() + JavaQuest.enemy.getbonusAtaque()) {
                        System.out.println(JavaQuest.player.getNome() + " conseguiu defender o ataque por completo!");
                    }
                    
                    else {
                        System.out.println("Dano total recebido: " + ((Ataque.AtaquesInimigos.get(opcaoEnemy).getDano() + JavaQuest.enemy.getbonusAtaque()) - (Defesa.DefesasPlayer.get(opcaoPlayer).getDefesa() + JavaQuest.player.getbonusDefesa())));
                        JavaQuest.player.setVida(JavaQuest.player.getVida(), ((Ataque.AtaquesInimigos.get(opcaoEnemy).getDano() + JavaQuest.enemy.getbonusAtaque()) - (Defesa.DefesasPlayer.get(opcaoPlayer).getDefesa() + JavaQuest.player.getbonusDefesa())));
                    }

                }

                else {
                    System.out.println(Defesa.DefesasPlayer.get(opcaoPlayer).getFraseFalha());
                    System.out.println("Dano total recebido: " + (Ataque.AtaquesInimigos.get(opcaoEnemy).getDano() + JavaQuest.enemy.getbonusAtaque()));
                    JavaQuest.player.setVida(JavaQuest.player.getVida(), (Ataque.AtaquesInimigos.get(opcaoEnemy).getDano() + JavaQuest.enemy.getbonusAtaque()));
                        
                }

            }

            else {
                System.out.println(JavaQuest.enemy.getNome() + " tentou usar o ataque " + Ataque.AtaquesInimigos.get(opcaoEnemy).getNome() + " mas errou!");
            
            }

        }

        Thread.sleep(1000);

    }
    

    public static void PocaoCura(int limite) throws InterruptedException {

        if ((JavaQuest.player.getVida() < 15) && (JavaQuest.player.getPocaoCura() > 0)) {
            System.out.println("Sua vida está baixa. Deseja usar uma poção de Cura? [S/N]");

            while (true) {
                cura = teclado.next().toUpperCase();
                
                if (cura.equals("S")) {
                    System.out.println("Sua vida foi regenerada!");
                    JavaQuest.player.setVida(limite);
                    JavaQuest.player.setPocaoCura((JavaQuest.player.getPocaoCura() - 1));
                    break;
                }

                else if (cura.equals("N") ) {
                    System.out.println("Sua vida continua baixa! Tome cuidado!");
                    break;
                }

                else {
                    System.out.println("Comando Inválido.");
                }
            }
        }

        else if ((JavaQuest.player.getVida() < 15) && (JavaQuest.player.getPocaoCura() == 0)) {
            System.out.println(JavaQuest.player.getNome() + ", sua vida está baixa mas você não tem poções de cura.");
        }

        Thread.sleep(1500);
    
    }


    public static void PocaoMana(int limite) throws InterruptedException {

        if ((JavaQuest.player.getMana() < 9) && (JavaQuest.player.getPocaoMana() > 0)) {
            System.out.println(JavaQuest.player.getNome() + " está com pouca mana, deseja usar uma poção de Mana?");

            while (true) {
                mana = teclado.next().toUpperCase();
                
                if (mana.equals("S")) {
                    System.out.println("Sua mana foi regenerada!");
                    JavaQuest.player.setMana(limite);
                    JavaQuest.player.setPocaoMana((JavaQuest.player.getPocaoMana() - 1));
                    break;
                }

                else if (mana.equals("N")) {
                    System.out.println("Sua mana continua baixa! Seja forte!");
                    break;
                }

                else {
                    System.out.println("Comando Inválido.");
                }
            }
        }

        else if ((JavaQuest.player.getMana() < 10) && (JavaQuest.player.getPocaoMana() == 0)) {
            System.out.println(JavaQuest.player.getNome() + ", sua mana está acabando mas acabaram suas poções.");
        }

        Thread.sleep(1500);

    }


    public static void Batalha(int turnos, int vidaMaximaPlayer, int manaMaximaPlayer) throws InterruptedException {


        while (true) {

            for (int i = 1; i <= turnos; i++) {
                TurnoInimigo();
            }
            
            JavaQuest.player.morte();
            JavaQuest.player.fadiga();

            PocaoCura(vidaMaximaPlayer);
            PocaoMana(manaMaximaPlayer);
           
            turnoAliado();

            if (JavaQuest.enemy.morte() == true) {
                break;
            }

            else {
                continue;
            }

        }

    }


    public static void Reset(int pv , int mana, int vigor) {
        JavaQuest.player.setVida(pv);
        JavaQuest.player.setMana(mana);
        JavaQuest.player.setVigor(vigor);
        System.out.println(JavaQuest.player.getNome() + " descansou depois de ter derrotado " + JavaQuest.enemy.getNome());
    }


}
