package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Chandelure extends Lampent{
    public Chandelure(String name, int level){
        super(name, level);

        setStats(60, 55, 90, 145, 90, 80);
        addMove(new ShadowBall());
    }
}
