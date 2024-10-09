package attacks;

import ru.ifmo.se.pokemon.*;

public class ConfuseRay extends StatusMove{
    public ConfuseRay(){
        type = Type.GHOST;
        power = 0;
        accuracy = 100;
        priority = 10;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
    }
    @Override
    protected String describe() {
        return "Атакует с помощью ConfuseRay";
    }
}
