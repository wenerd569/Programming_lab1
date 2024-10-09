package attacks;

import ru.ifmo.se.pokemon.*;

public class Swift extends SpecialMove{
    public Swift(){
        type = Type.NORMAL;
        power = 60;
        priority = 20;
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }
    @Override
    protected String describe() {
        return "Атакует с помощью Swift";
    }
}
