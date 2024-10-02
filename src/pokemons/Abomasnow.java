package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Abomasnow extends Pokemon{
    public Abomasnow(String name, int level){
        super(name, level);

        setType(Type.GRASS, Type.ICE);
        setStats(90, 92, 75, 92, 85, 60);
        setMove(new Rest(), new EnergyBall(), new WoodHammer(), new IcePunch());
    }
}
