package attacks;

import ru.ifmo.se.pokemon.*;

public class WoodHammer extends PhysicalMove{
    public WoodHammer(){
        type = Type.GRASS;
        power = 120;
        accuracy = 100;
        priority = 15;   
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        att.addEffect(new Effect().stat(Stat.HP, -(int)(damage/3)));
    }
}
