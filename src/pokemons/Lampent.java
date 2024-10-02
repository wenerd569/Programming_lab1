package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Lampent extends Pokemon{
    public Lampent(String name, int level){
        super(name, level);

        setType(Type.GHOST, Type.FIRE);
        setStats(60, 40, 60, 95, 60, 55);
        setMove(new CalmMind(), new ConfuseRay(), new Inferno());
    }
}
