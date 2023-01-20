package persons;


import actions.ForWaiter;
import actions.Speakable;
import enums.Adverb;
import enums.Emotion;
import enums.Participle;


public class Waiter extends Person implements ForWaiter, Speakable {

    public Waiter(String name, int age) {

        super(name, age);
    }

    @Override
    public void catchUp() {
        System.out.print(this.name + Adverb.FAST.toString() + " догнал его и, " + Participle.SMILING);
    }

    @Override
    public void pale() {
        System.out.print("Улыбка моментально соскочила у официанта с лица. Он даже как-то" + Adverb.UNNATURAL.toString() + " побледнел " + Emotion.ANGRY.toString() + ".\n");
    }

    @Override
    public void pull(Shorty Neznaika) {

        System.out.print(Participle.CATCHING + " он оттащил " + Neznaika.getName() + " в строну и,");
    }

    @Override
    public void whistle() {

        System.out.print(Participle.TAKING + Adverb.SHRILL.toString() + " засвистел. \n");
    }

    @Override
    public void say(String phrase) {

        System.out.println(" сказал: \"" + phrase + "\"");
    }

    @Override
    public void setEmotion(Emotion emotion) {}
}
