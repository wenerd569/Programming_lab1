package attacks;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove{
    public CalmMind(){
        type = Type.PSYCHIC;
        power = 0;
        accuracy = 0;
        priority = 20;
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, 1).stat(Stat.SPECIAL_ATTACK, 1));
    }
    @Override
    protected String describe() {
        return "Атакует с помощью CalmMind";
    }
}
