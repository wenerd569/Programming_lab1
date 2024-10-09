package attacks;

import ru.ifmo.se.pokemon.*;

public class Inferno extends SpecialMove{
    public Inferno(){
        type = Type.FIRE;
        power = 100;
        accuracy = 50;
        priority = 5;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.burn(p);
    }
    @Override
    protected String describe() {
        return "Использует Inferno";
    }
}
