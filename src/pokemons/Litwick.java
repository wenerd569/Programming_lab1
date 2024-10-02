package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Litwick extends Pokemon{
    public Litwick(String name, int level){
        super(name, level);

        setType(Type.GHOST, Type.FIRE);
        setStats(50, 30, 55, 65, 55, 20);
        setMove(new CalmMind(), new ConfuseRay());
    }
}
