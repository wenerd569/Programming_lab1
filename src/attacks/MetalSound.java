package attacks;

import ru.ifmo.se.pokemon.*;

public class MetalSound extends StatusMove{
    public MetalSound(){
        type = Type.STEEL;
        power = 0;
        accuracy = 85;
        priority = 40;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, -2));
    }
}
