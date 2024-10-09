package attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(){
        type = Type.PSYCHIC;
        priority = 5;
    }
    
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.HP, (int)p.getStat(Stat.HP)));
        p.addEffect(new Effect().condition(Status.SLEEP).turns(2));
    }

    @Override
    protected String describe() {
        return "Использует Rest";
    }
    
}
