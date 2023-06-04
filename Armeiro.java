import java.util.*;

public class Armeiro {
    static int sorteado;
    static int escolhaPlayer;
    static EquipamentoAtaque equipSortAtk;
    static EquipamentoDefesa equipSortDef;
    static Scanner teclado = new Scanner(System.in);
    static Random aleatorio = new Random();



    public static void EquiparAtaque(int quantidade, List<EquipamentoAtaque> lista) throws InterruptedException {
        
        List<EquipamentoAtaque> EquipamentoSorteados = new ArrayList<>(Arrays.asList());

        for (int i = 0; i < quantidade; i++){
            sorteado = aleatorio.nextInt(lista.size());
            equipSortAtk = lista.get(sorteado);
            EquipamentoSorteados.add(equipSortAtk);
            lista.remove(sorteado);
        }
        
        System.out.println("\nEquipamentos desbloqueados:");

        for (int i = 0; i < EquipamentoSorteados.size(); i++) {
            System.out.printf("[%d] %-30s Bônus de Ataque: %d %n", i, EquipamentoSorteados.get(i).getNome(), EquipamentoSorteados.get(i).getBonusAtaque());
            Thread.sleep(1000);
        }

        System.out.println("Qual equipamento deseja equipar?");
        while (true) {
                
            try {
                escolhaPlayer = teclado.nextInt();
                break;
            } catch(InputMismatchException e){
                System.out.println("Valor Inválido!");
                teclado.next();
            }

        }
        
        JavaQuest.player.setbonusAtaque(JavaQuest.player.getbonusAtaque() + EquipamentoSorteados.get(escolhaPlayer).getBonusAtaque());
            
        Ataque.AtaquesPlayer.add((Ataque) EquipamentoSorteados.get(escolhaPlayer).getAtaque1());
        Ataque.AtaquesPlayer.add((Ataque) EquipamentoSorteados.get(escolhaPlayer).getAtaque2());
        

        Thread.sleep(1000);

        System.out.println("Equipado com sucesso!");
        
    }


    public static void EquiparDefesa(int quantidade, List<EquipamentoDefesa> lista) throws InterruptedException {
        List<EquipamentoDefesa> EquipamentoSorteados = new ArrayList<>(Arrays.asList());

        for (int i = 0; i < quantidade; i++){
            sorteado = aleatorio.nextInt(lista.size());
            equipSortDef = lista.get(sorteado);
            EquipamentoSorteados.add(equipSortDef);
            lista.remove(sorteado);
        }
        
        System.out.println("\nEquipamentos desbloqueados:");

        for (int i = 0; i < EquipamentoSorteados.size(); i++) {
            System.out.printf("[%d] %-30s Bônus de Defesa: %d %n", i, EquipamentoSorteados.get(i).getNome(), EquipamentoSorteados.get(i).getBonusDef());
            Thread.sleep(750);
        }

        System.out.println("Qual equipamento deseja equipar?");
        while (true) {
                
            try {
                escolhaPlayer = teclado.nextInt();
                break;
            } catch(InputMismatchException e){
                System.out.println("Valor Inválido!");
                teclado.next();
            }

        }
        
        JavaQuest.player.setbonusDefesa(JavaQuest.player.getbonusDefesa() + EquipamentoSorteados.get(escolhaPlayer).getBonusDef());
        if (Defesa.DefesasPlayer.size() < 6) {
            
            Defesa.DefesasPlayer.add((Defesa) EquipamentoSorteados.get(escolhaPlayer).getDefesa());
        
        }
        
        else {
            
            for (int i = 0; i < 7 - Defesa.DefesasPlayer.size(); i++){
                Defesa.DefesasPlayer.remove(i);
            }
            
            Defesa.DefesasPlayer.add((Defesa) EquipamentoSorteados.get(escolhaPlayer).getDefesa());
        
        }

        Thread.sleep(1000);

        System.out.println("Equipado com sucesso!");
        
    }


    public static boolean EscolhaEquipamento() {
        boolean resp; 
        System.out.println("Deseja desbloquear um equipamento de ataque[ATK] ou um equipamento de defesa[DEF]?");

        while (true) {
            String eq = (teclado.nextLine()).toUpperCase();
            if ((eq.equals("ATAQUE")) || (eq.equals("ATK")) || (eq.equals("A"))) {
                resp = true; break;
            }
            else if ((eq.equals("DEFESA")) || (eq.equals("DEF")) || (eq.equals("D"))) {
                resp = false; break;
            }
            else {
                System.out.println("Por favor, insira uma opção válida.");
            }    
        }
        
        return resp;
    }
}
