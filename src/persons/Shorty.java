package persons;

import enums.*;
import actions.ForShorty;
import things.PartOfBody;
import things.Room;

public class Shorty extends Person implements ForShorty {

    public Shorty(String name, int age) {

        super(name, age);

    }


    @Override
    public void think(Shorty all) {

        System.out.print("\"Что ж, здесь вполне " + Adverb.GOOD.toString() + "! -- " + Adverb.COMPLACENTLY.toString() + " подумал " + this.getName() + ". -- "
                + "Видно, и на Луне живут " + Face.KIND.toString() + all.getName() + "!\" \n");

    }


    @Override
    public void transfer(){
        System.out.print(Participle.STANDINGUP.toString() + Participle.WAVING.toString() + this.name + " отправился " + Adverb.FAR.toString() + ", но ");
    }


    @Override
    public void putHeadBack(Body body) {
        System.out.println(this.name + " " + Adverb.INVOLUNTARILY.toString() + " откинул " + body + " назад. ");
    }

    @Override
    public void smell() {
        System.out.println(this.name + " " + Adverb.CAREFULLY.toString() + " понюхал кончик дубинки.");
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

        System.out.print(Participle.WATCHING + "что " + this.name + " медлит,");
    }

    @Override
    public void fall() {

        System.out.println("что тот " + Adverb.HEADOVERHEELS.toString() + " полетел в кузов. ");
    }

    @Override
    public void happened() {
        System.out.println("Все, что произошло с ним до этого, стало казаться ему каким-то недоразумением или нелепым сном, о котором не стоит и вспоминать.");
    }

    @Override
    public void lie(Body body) {
        System.out.println(Participle.RISINGUP.toString() + this.name + " приналег на дверцу " + body + ", но она не открывалась. ");
    }

    @Override
    public void drum(Body body) {

        System.out.print("Тогда он " + Adverb.STRONGLY.toString() + " забарабанил в дверь " + body);
    }

    public void loud(String words) {

        System.out.println("и закричал: " + "\"" + words + "\"");
    }

    @Override
    public void waveHands(PartOfBody.Hands hands) {

        System.out.println(this.name + Emotion.SHY + " замахал " + hands.getName().toString() + ".");
    }

    @Override
    public void watch() {
        System.out.println(this.name + " взглянул на карточку, которая была приклеена к бланку.");
    }

    @Override
    public void riseUp() {
        System.out.print(this.name + " " + Adverb.MECHANICALLY + " поднял голову и ");
    }

    @Override
    public void stretchArms() {

        System.out.println("вытянул руки " + Adverb.BYSIDES.toString() + ".");
    }

    @Override
    public void setEmotion(Emotion emotion) {}

    @Override
    public void understand(Room.Door door) {
        System.out.print("Не успел " + this.name + " сообразить, что произошло, как ");
        door.close();
    }
}
