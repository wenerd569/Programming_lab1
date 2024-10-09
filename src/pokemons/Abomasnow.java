package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Abomasnow extends Snover{
    public Abomasnow(String name, int level){
        super(name, level);
        setStats(90, 92, 75, 92, 85, 60);
        addMove(new IcePunch());
    }
}
