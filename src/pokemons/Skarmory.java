package pokemons;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Skarmory extends Pokemon{
    public Skarmory(String name, int level){
        super(name, level);
        
        setType(Type.STEEL, Type.FIGHTING);
        setStats(65, 80, 140, 40, 70, 70);
        setMove(new MetalSound(), new DarkPulse(), new Swift(), new FlashCannon());        
    }
}