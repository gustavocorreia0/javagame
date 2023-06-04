import java.util.*;

public class EquipamentoDefesa {

    private String nome;
    private int bonusDefesa;
    private Defesa defesa;
    

    // Construtor
    public EquipamentoDefesa(String n, int bonusDef, Defesa def) {
        this.nome = n;
        this.bonusDefesa = bonusDef;
        this.defesa = def;
    }


    // Nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Bonus Defesa
    public int getBonusDef(){
        return bonusDefesa;
    }
    public void setBonusDef(int bonus) {
        this.bonusDefesa = bonus;
    }

    // Defesa
    public Defesa getDefesa(){
        return defesa;
    }
    public void setDefesa(Defesa def) {
        this.defesa = def;
    }


    // Equipamentos de DEFESA
    public static EquipamentoDefesa bracadeiraCouro= new EquipamentoDefesa("Braçadeira de Couro", 10, Defesa.defesaBasica);
    public static EquipamentoDefesa escudoCorpo= new EquipamentoDefesa("Escudo de Corpo", 10, Defesa.levantarEscudo);
    public static EquipamentoDefesa capaceteTatico= new EquipamentoDefesa("Capacete Tático", 10, Defesa.barreira);
    public static EquipamentoDefesa trajeMonge= new EquipamentoDefesa("Traje do Monge", 10, Defesa.meditacao);
    public static EquipamentoDefesa peitoralFerro= new EquipamentoDefesa("Peitoral de Ferro", 10, Defesa.barreiraAvancada);
    public static EquipamentoDefesa nanoColete= new EquipamentoDefesa("Nano Colete", 10, Defesa.armaduraAvancada);
    public static EquipamentoDefesa armaduraAntiBomba= new EquipamentoDefesa("Armadura Anti-Bomba", 10, Defesa.barreiraAvancada);
    public static EquipamentoDefesa armaduraEncantada= new EquipamentoDefesa("Armadura Encantada", 10, Defesa.defesaMagica);
    public static EquipamentoDefesa mantoLadino= new EquipamentoDefesa("Manto do Ladino", 10, Defesa.defesaRapidaAvancada);
    public static EquipamentoDefesa ombreirasGladiador= new EquipamentoDefesa("Ombreiras de Gladiador", 10, Defesa.juggernaut);
    public static EquipamentoDefesa armaduraCosmica= new EquipamentoDefesa("Armadura Cósmica", 10, Defesa.auraCosmica);
    public static EquipamentoDefesa armaduraEspectral= new EquipamentoDefesa("Armadura Espectral", 10, Defesa.armaduraEspectral);
    public static EquipamentoDefesa armaduraNetherite= new EquipamentoDefesa("Armadura de Netherithe", 10, Defesa.netherite);
    public static EquipamentoDefesa armaduraKripto= new EquipamentoDefesa("ArmaduraKripto", 10, Defesa.kryptoDefesa);
    public static EquipamentoDefesa armaduraExoesqueleto= new EquipamentoDefesa("Armadura de Exoesqueleto Energizado", 10, Defesa.exoesqueleto);

    

    // ArrayList de equipamentos de Defesa
    public static List<EquipamentoDefesa> EquipamentosDefesa = new ArrayList<>(Arrays.asList(bracadeiraCouro, escudoCorpo, capaceteTatico,
    trajeMonge, peitoralFerro, nanoColete, armaduraAntiBomba, armaduraEncantada, mantoLadino, ombreirasGladiador, armaduraNetherite));

    public static List<EquipamentoDefesa> EquipamentosDefesaLendarios = new ArrayList<>(Arrays.asList(armaduraCosmica, armaduraEspectral,
    armaduraNetherite, armaduraKripto, armaduraExoesqueleto));

}



