package persons;

import enums.*;
import actions.ForShorty;
import locations.TypeOfLocation;
import things.PartOfBody;
import things.Room;
import java.util.LinkedList;

public class Shorty extends Person implements ForShorty {

    private final LinkedList<String> events = new LinkedList<>();
    public Shorty(String name, int age, TypeOfLocation location, Emotion emotion, int moodPoints) {
        super(name, age, location, emotion, moodPoints);
    }

    @Override
    public String think() {
        Emotion nowEmotion = this.getEmotion();
        return switch (nowEmotion){
            case AWFUL -> "\"Что ж, какая-то беда!\" - сказал Незнайка.";
            case ANGRY -> "\"Что ж, здесь плоховато!\" - сказал Незнайка.";
            case BAD -> "\"Что ж, здесь не так хорошо!\" - сказал Незнайка.";
            case NORMAL -> "\"Что ж, здесь вполне хорошо!\" - сказал Незнайка.";
            case PEACEFUL -> "\"Что ж, здесь вполне прекрасно!\" - сказал Незнайка.";
        };
    }

    @Override
    public void transfer(Person person){
        person.changeMood(7);
        System.out.print(TypeOfAction.STANDINGUP.toString() + TypeOfAction.WAVING.toString() + this.name + " отправился " + Distance.FAR.toString() + ", но ");
    }


    @Override
    public void putHeadBack(Body body) {
        System.out.println(this.name + " " + Power.INVOLUNTARILY.toString() + " откинул " + body + " назад. ");
    }

    @Override
    public void smell(Person obj) {

        System.out.println(this.name + " " + " понюхал кончик дубинки.");
        obj.changeMood(35);
    }

    public Spark spark;
    public static class Spark {
        String SparkName;
        public Spark() {
            this.SparkName = "искры";
        }
        public void fly(String from) {
            System.out.print(this.SparkName + " полетели " + from);
        }
    }
    @Override
    public void stagger() {
        System.out.print("Незнайку ударило " + Material.ELECTRIC.toString() + " током, да так сильно, что ");
        this.spark = new Spark();
        spark.fly("из глаз! ");
        System.out.println("В голове загудело, и " + this.name + " зашатался, не в силах устоять на ногах.");
    }

    @Override
    public void slow() {
        System.out.print(TypeOfAction.WATCHING + "что " + this.name + " медлит,");
    }

    @Override
    public void fall(Person p) {
        p.changeMood(-12);
        System.out.println("что тот " + " полетел в кузов. ");
    }


    @Override
    public void happened(String[] events) {
        int sum = 0;
        for (String i: events){
            this.changeMood(i.length() % 2);
            sum += i.length() % 2;
        }
        System.out.println("После воспоминаний настроение изменилось на " + events[sum].toString());
    }

    @Override
    public void lie(Body body) {
        System.out.println(TypeOfAction.RISINGUP.toString() + this.name + " приналег на дверцу " + body + ", но она не открывалась. ");
    }

    @Override
    public void drum(Body body) {

        System.out.print("Тогда он " + Power.STRONGLY.toString() + " забарабанил в дверь " + body);
    }

    public void loud(String words) {

        System.out.println("и закричал: " + "\"" + words + "\"");
    }

    @Override
    public void waveHands(PartOfBody.Hands hands, Person obj) {
        obj.changeMood(-50);
        System.out.println(this.name + " в смущении замахал " + hands.getName().toString() + ".");
    }

    @Override
    public void watch() {
        System.out.println(this.name + " взглянул на карточку, которая была приклеена к бланку.");
    }

    @Override
    public void riseUp() {
        System.out.print(this.name + " " + " поднял голову и ");
    }

    @Override
    public void stretchArms(Person obj) {
        System.out.println("вытянул руки " + Power.BYSIDES.toString() + ".");
        obj.changeMood(-23);
    }


    @Override
    public void understand(Room.Door door) {
        System.out.print("Не успел " + this.name + " сообразить, что произошло, как ");
        door.close();
    }
}
