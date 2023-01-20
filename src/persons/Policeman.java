package persons;

import actions.*;
import enums.Adjective;
import enums.Adverb;
import enums.Emotion;
import enums.Participle;
import locations.TypeOfLocation;
import things.PartOfBody;
import things.Room;

public class Policeman extends Person implements ForPoliceman, Speakable {

    private boolean isGlamorousButton =false;
    private Boolean isCommand;
    private Boolean isJoking;

    public Policeman(String name, int age, TypeOfLocation location, Emotion emotion) {
        super(name, age, location, emotion);
    }

    @Override
    public String toString() {

        return "полицейский по имени" + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void comeUp(String location) {

        System.out.println("Сейчас же откуда-то из " + location + " вынырнул "
                + this.name + " в " + Adjective.BLUE.toString() + " мундире с блестящими металлическими пуговицами и в "
                + Adjective.COOPER.toString() + " каске на голове. В руках у него была " + Adjective.WEIGHTY.toString()
                + " " + Adjective.RUBBER.toString() + " дубинка, а у пояса пистолет в кобуре.");

    }

    @Override
    public void comeUp(){

        if (this.name=="рослый коротышка") {
            System.out.println(" вошёл полицейский " + this.name);
        } else {
            System.out.println(" и в дверь вошел полицейский " + this.name);

        }
    }

    @Override
    public void stick(PartOfBody.Forehead forehead) {

        System.out.println(this.name + " ткнул его кончиком дубинки в " + forehead.getName() + ". Раздался треск.");
    }

    @Override
    public void stick2(Shorty Neznaika) {

        System.out.print(" он с такой силой ткнул " + Neznaika.getName() + " в спину дубинкой, ");
    }


    @Override
    public void search(Shorty Neznaika) {
        System.out.print(Participle.POLICECATCHING.toString() + this.name + " принялся шарить у " + Neznaika.getName() + " в карманах и, ");
    }

    @Override
    public void pull() {
        System.out.println(Participle.FINDING.toString() + this.name + " потащил его сквозь толпу, которая начала собираться вокруг. Толпа"
                + Adverb.FAST.toString() + " рассеялась.");

    }

    @Override
    public void pull(String location) {
        System.out.print(this.name + " протащил Незнайку" + TypeOfLocation.STREET.toString() + ",");
    }

    @Override
    public void turn() {
        System.out.print(" свернул в" + Adjective.NARROW.toString() + " " + TypeOfLocation.AVENUE.toString() + "и ");

    }

    @Override
    public void stop() {

        System.out.println("остановился возле " + Adjective.BLACK.toString() + " полицейской машины, напоминавшей автофургон с "
                + Adjective.SMALL.toString() + " "
                + Adjective.BARRED.toString() + " окном в кузове.");

    }

    @Override
    public void nod() {

        System.out.print(Participle.OPENING.toString() + " он " + Adverb.IMPERATIVE.toString() + " кивнул Незнайке пальцем и, ");
    }

    @Override
    public void say(String phrase) {
        System.out.println(Participle.BROWS.toString() + " сказал: " + "\"" + phrase + "\"");
    }

    @Override
    public void silent(String name){

        System.out.println(this.name + ", однако, не удостоил " + name + " ответом. ");

        if (this.age < 45) {
            System.out.println("(Кстати, " + this.name + ", оказывается, довольно молод в силу возраста) ");
        }
        else {
            System.out.println("(Кстати, " + this.name + ", оказывается, очень и очень старый в силу возраста) ");
        }
        isCommand = false;
    }

    @Override
    public void work(TypeOfLocation location){
        System.out.println(this.name + " работает в " + location);

        if (this.location==TypeOfLocation.OPENAIR) {
            isGlamorousButton =true;
            System.out.println(this.name + " одет в мундир с блестящими пуговицами. ");
        } else if (this.location==TypeOfLocation.UNVENTILATEDROOM) {
            isGlamorousButton =false;
            System.out.println(this.name + " одет в мундир с обычными металлическими пуговицами. ");
        } else {
            System.out.println("У " + this.name + " нет одежды. ");
        }
    }

    @Override
    public void command(String words){

        System.out.println("cкомандовал: " + "\"" + words + "\"");
        isCommand = true;
    }

    @Override
    public void takeOff(Policeman figle) {
        System.out.print("Это обстоятельство особенно " + Adverb.GOOD.toString() + " стало заметно, когда вошедший в комнату " + figle.getName() + " снял с головы каску");
    }

    @Override
    public void put() {
        System.out.println(" и поставил ее на столе рядышком с каской Мигля.");
    }

    @Override
    public void write(Shorty Neznaika) {
        System.out.println(Participle.BOX.toString() + this.name + " записал на нем имя " + Neznaika.getName() + ", проставил рост, размер головы и носа, снял с него фотокарточку, просветил рентгеном, после чего испачкал ему обе руки черной краской и заставил оставить отпечатки пальцев на бланке.");

    }

    @Override
    public void press() {
        System.out.print(this.name + " нажал кнопку электрического звонка,");
    }

    @Override
    public void exist(Policeman figle) {
        System.out.print("Если " + this.name + " был коротышка сердитый, не терпевший, как "
                + figle.getName() + " сам утверждал, никаких разговоров, то ");
    }

    @Override
    public void joke() {
        if (!this.name.equals("Мигль")) {
            isJoking =false;
            System.out.println("\n\n... Упс! Что-то идет не по плану... Это уже не аша история...\n\n");
        } else {
            isJoking =true;
            System.out.println(this.name + ", наоборот, был большой любитель поговорить и даже пошутить.");

        }
    }

    @Override
    public void tell(Room.Door door, String words) {
        System.out.println("Как только " + door + " затворилась за Фиглем, " + this.name + " сказал Незнайке: \"" + words + "\"");
    }

    @Override
    public void watch() {
        System.out.println(this.name + " " + Adverb.GLOOMILY.toString() + " взглянул на Незнайку...");

    }

    @Override
    public void sit(TypeOfLocation location){

        System.out.print(this.name + " сел в " + location + "рядом с шофером и ");
    }

    @Override
    public void give(Shorty Neznaika) {
        System.out.println(this.name + ", которого, кстати сказать, звали Фиглем, сдал " + Neznaika.getName() + " с рук на руки другому полицейскому, которого звали Миглем.");
    }

    @Override
    public void be() {
        System.out.println("При этом обнаружилось еще и то, что между Миглем и Фиглем было большое сходство: оба были " + Adjective.CHEEKBONES.toString() + ", " + Adjective.BROADFACED.toString() + ", у обоих были низкие лбы и темные, жесткие, подстриженные ежиком волосы, начинавшиеся чуть ли не от самых бровей.");
    }

    @Override
    public void setEmotion(Emotion emotion) {

    }
}
