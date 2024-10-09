package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Lampent extends Litwick{
    public Lampent(String name, int level){
        super(name, level);

        setStats(60, 40, 60, 95, 60, 55);
        addMove(new Inferno());
    }
}
