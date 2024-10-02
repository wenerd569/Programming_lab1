package attacks;

import ru.ifmo.se.pokemon.*;

public class IcePunch extends PhysicalMove{
    public IcePunch(){
        type = Type.ICE;
        power = 75;
        accuracy = 100;
        priority = 15;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.1){
            Effect.freeze(p);
        }
    }
}
