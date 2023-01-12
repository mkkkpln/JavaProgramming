package persons;

import enums.*;
import actions.ForShorty;

public class Shorty extends Person implements ForShorty {

    public Shorty(String name, int age) {

        super(name, age);

    }

    String something = "живут " + Adjective.KIND.toString() + " коротышки";
    @Override
    public void think() {

        System.out.print("\"Что ж, здесь вполне " + Adverb.GOOD.toString() + "! -- " + Adverb.COMPLACENTLY.toString() + " подумал " + this.getName() + ". -- " + "Видно, и на Луне " + something +  "!\" \n");

    }


    @Override
    public void transfer(){
        System.out.print(Participle.STANDINGUP.toString() + Participle.WAVING.toString() + this.name + " отправился " + Adverb.FAR.toString() + ", но ");
    }

    @Override
    public void putHeadBack() {
        System.out.println(this.name + " " + Adverb.INVOLUNTARILY.toString() + " откинул голову назад. ");
    }

    @Override
    public void smell() {
        System.out.println(this.name + " " + Adverb.CAREFULLY.toString() + " понюхал кончик дубинки.");
    }


    @Override
    public void stagger() {

        System.out.println("Незнайку ударило "
                + Adjective.ELECTRIC.toString() + " током, да так сильно, что искры полетели из глаз, в голове загудело, и он зашатался, не в силах устоять на ногах.");
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
    public void lie() {
        System.out.println(Participle.RISINGUP.toString() + this.name + " приналег на дверцу плечом, но она не открывалась.  ");
    }

    @Override
    public void drum() {

        System.out.print("Тогда он " + Adverb.STRONGLY.toString() + " забарабанил в дверь кулаком ");
    }

    public void loud(String words) {

        System.out.println("и закричал: " + "\"" + words + "\"");
    }

    @Override
    public void waveHands() {

        System.out.println(this.name + Emotion.SHY + " замахал руками. ");
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
    public void setEmotion(Emotion emotion) {

    }


    public void understand() {
        System.out.println("Не успел " + this.name + " сообразить, что произошло, как дверца за ним захлопнулась. ");
    }
}
