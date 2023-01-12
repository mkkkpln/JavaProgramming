package persons;

import actions.ForArrested;
import enums.Adverb;
import enums.Emotion;
import locations.TypeOfLocation;

public class Arrested extends Person implements ForArrested {

    public Arrested(String name, int age, TypeOfLocation location, Emotion emotion) {
        super(name, age, location, emotion);
    }

    @Override
    public void conceal() {
        System.out.println("не утаили ли они похищенных ценностей у себя в желудке, " + Adverb.PREVIOUSLY.toString() + " проглотив их. ");
    }
}
