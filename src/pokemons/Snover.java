package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Snover extends Pokemon{
    public Snover(String name, int level){
        super(name, level);
        
        setType(Type.GRASS, Type.ICE);
        setStats(60, 62, 50, 62, 60, 40);
        setMove(new Rest(), new EnergyBall(), new WoodHammer());
    }
}
