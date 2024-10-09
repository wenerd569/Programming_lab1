package attacks;

import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove{
    public DarkPulse(){
        type = Type.DARK;
        power = 80;
        accuracy = 100;
        priority = 15;   
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.2){
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe() {
        return "Атакует с помощью Darkpulse";
    }
}
