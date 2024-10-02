package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Chandelure extends Pokemon{
    public Chandelure(String name, int level){
        super(name, level);

        setType(Type.GHOST, Type.FIRE);
        setStats(60, 55, 90, 145, 90, 80);
        setMove(new CalmMind(), new ConfuseRay(), new Inferno(), new ShadowBall());
    }
}
