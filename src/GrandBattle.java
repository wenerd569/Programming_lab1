import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class GrandBattle {
    private Battle battle;

    public GrandBattle(){
        battle = new Battle();
        var skarmory = new Skarmory("Duck", 1);
        var snover = new Snover("Snowman", 1);
        var abomasnow = new Abomasnow("MEGA snowman", 1);
        var litwick = new Litwick("Firek", 1);
        var lampent = new Lampent("Lampik", 1);
        var chandelure = new Chandelure("MEGA lamp", 1);

        battle.addAlly(skarmory);
        battle.addAlly(lampent);
        battle.addAlly(chandelure);

        battle.addFoe(litwick);
        battle.addFoe(snover);
        battle.addFoe(abomasnow);
    }
    public void Start(){
        battle.go();
    }
}
