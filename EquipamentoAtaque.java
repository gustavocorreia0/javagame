import java.util.*;

public class EquipamentoAtaque {

    private String nome;
    private int bonusAtaque;
    private Ataque ataque1;
    private Ataque ataque2;
    static Random aleatorio = new Random();    



    // Construtor
    public EquipamentoAtaque(String nome, int bonusAtk, Ataque atk1, Ataque atk2) {
        this.nome = nome;
        this.bonusAtaque = bonusAtk;
        this.ataque1 = atk1;
        this.ataque2 = atk2;
    }


        // Nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

        // Bonus de Ataque
    public int getBonusAtaque(){
        return bonusAtaque;
    }
    public void setBonusAtaque(int bonusAtk) {
        this.bonusAtaque = bonusAtk;
    }

        // Ataque adicional 1
    public Object getAtaque1(){
        return ataque1;
    }
    public void setAtaque1(Ataque atk1) {
        this.ataque1 = atk1;
    }

        // Ataque adicional 1
    public Object getAtaque2(){
        return ataque2;
    }
    public void setAtaque2(Ataque atk2) {
        this.ataque2 = atk2;
    }

    
    // Equipamentos de ATAQUES 
    public static EquipamentoAtaque pistolaLaser = new EquipamentoAtaque("Pistola A Laser", aleatorio.nextInt(5,11), Ataque.tiroConcentrado, Ataque.tiroAvancado);
    public static EquipamentoAtaque escopetaCanoSerrado = new EquipamentoAtaque("Escopeta de cano Serrado", aleatorio.nextInt(5,11), Ataque.rajada, Ataque.rajadaAvancado);
    public static EquipamentoAtaque adagaLaser = new EquipamentoAtaque("Adaga Laser", aleatorio.nextInt(5,11), Ataque.apunhalada, Ataque.apunhaladaAvancado);
    public static EquipamentoAtaque arcoFlecha = new EquipamentoAtaque("Arco e Flecha", aleatorio.nextInt(5,11), Ataque.flecha, Ataque.flechaMagica);
    public static EquipamentoAtaque bestaAutomatica = new EquipamentoAtaque("Besta Automática", aleatorio.nextInt(5,11), Ataque.flechaMagica, Ataque.flechaVenenosa);
    public static EquipamentoAtaque rifleChoque= new EquipamentoAtaque("Rlife de choque", aleatorio.nextInt(5,11), Ataque.tiroStun, Ataque.tiroConcentrado);
    public static EquipamentoAtaque espadaEnergia = new EquipamentoAtaque("Espada de energia", aleatorio.nextInt(5,11), Ataque.Investida, Ataque.impactoEletrico );
    public static EquipamentoAtaque granadasFragmentacao= new EquipamentoAtaque("Granadas de fragmentação", aleatorio.nextInt(5,11), Ataque.granada, Ataque.cozinharGranada);
    public static EquipamentoAtaque bastaoEletrico= new EquipamentoAtaque("Bastão Elétrico", aleatorio.nextInt(5,11), Ataque.Investida, Ataque.impactoEletrico);
    public static EquipamentoAtaque lancaDeGalio = new EquipamentoAtaque("Lança de Gálio", aleatorio.nextInt(5,11), Ataque.apunhalada, Ataque.arremessoLanca);
    public static EquipamentoAtaque espadaAncestralLendario= new EquipamentoAtaque("Espada Ancestral Lendária", aleatorio.nextInt(5,11), Ataque.ataqueAncestral, Ataque.fissuraAncestral);
    public static EquipamentoAtaque escopetaCelestialLendaria= new EquipamentoAtaque("Escopeta Celestial Lendária", aleatorio.nextInt(5,11), Ataque.tiroCelestial, Ataque.bombardeioCelestial);
    public static EquipamentoAtaque rifleDeVacuoLendario= new EquipamentoAtaque("Rifle de Vácuo Lendário", aleatorio.nextInt(5,11), Ataque.tiroVacuo, Ataque.gravidade30);
    public static EquipamentoAtaque marteloPrimordialLendario= new EquipamentoAtaque("Martelo Primordial Lendário", aleatorio.nextInt(5,11), Ataque.impactoPrimordial, Ataque.terremotoPrimordial);
    public static EquipamentoAtaque kusarigamaLendaria= new EquipamentoAtaque("Kusarigama Lendária", aleatorio.nextInt(5,11), Ataque.cortesOrientais, Ataque.rasgarTerreno);

    
    
    // ArrayList de todos os equipamentos de Ataque
    public static List<EquipamentoAtaque> EquipamentosAtaque = new ArrayList<>(Arrays.asList(pistolaLaser, escopetaCanoSerrado, adagaLaser, arcoFlecha,
    bestaAutomatica, rifleChoque, espadaEnergia, granadasFragmentacao, bastaoEletrico, lancaDeGalio));

    public static List<EquipamentoAtaque> EquipamentosAtaqueLendarios = new ArrayList<>(Arrays.asList(espadaAncestralLendario, escopetaCelestialLendaria,
    rifleDeVacuoLendario, marteloPrimordialLendario, kusarigamaLendaria));

}
