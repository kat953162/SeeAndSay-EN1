package SeeAndSay.AnimalImpl;

import SeeAndSay.Animal;
import SeeAndSay.Talker;

public class ur1124787 extends Animal implements Talker {
    @Override
    public String getAuthor() {
        return "Atlai Esteban";
    }

    @Override
    public String getAnimalName() {return "T-Rex";}

    @Override
    public String getSound() {return "RAWR X3 TWEET-TWEETTTT~~";}

    @Override
    public  String getDescription() {return "Friendly Rex";}
}
