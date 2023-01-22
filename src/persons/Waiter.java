package persons;


import actions.ForWaiter;
import actions.Speakable;
import enums.Emotion;
import enums.TypeOfAction;


public class Waiter extends Person implements ForWaiter, Speakable {

    public Waiter(String name, int age) {

        super(name, age);
    }

    @Override
    public void catchUp() {
        System.out.print(this.name + " догнал его и, " + TypeOfAction.SMILING);
    }

    @Override
    public void pale() {
        System.out.print("Улыбка моментально соскочила у официанта с лица. Он даже как-то" + " побледнел от злости.\n");
    }

    @Override
    public void pull(Shorty Neznaika) {

        System.out.print(TypeOfAction.CATCHING + " он оттащил " + Neznaika.getName() + " в строну и,");
    }


    @Override
    public void whistle() {

        System.out.print(TypeOfAction.TAKING + " засвистел. \n");
    }

    @Override
    public void say(String phrase) {

        System.out.println(" сказал: \"" + phrase + "\"");
    }

}
