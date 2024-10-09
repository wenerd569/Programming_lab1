package attacks;

import ru.ifmo.se.pokemon.*;

public class FlashCannon extends SpecialMove{
    public FlashCannon(){
        type = Type.STEEL;
        power = 80;
        accuracy = 100;
        priority = 10;   
    }
    @Override
    public void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1));
    }
    @Override
    protected String describe() {
        return "Атакует с помощью FlashCannon";
    }
}
