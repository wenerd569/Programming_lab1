package attacks;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends StatusMove{
    public ShadowBall(){
        type = Type.GHOST;
        power = 80;
        accuracy = 100;
        priority = 15;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1));
    }
}
