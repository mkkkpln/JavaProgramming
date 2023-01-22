package persons;

import actions.Emotionable;
import enums.Emotion;
import locations.TypeOfLocation;
import things.Thing;

import java.util.LinkedList;

public abstract class Person implements Emotionable {
    protected String name;
    protected int age;
    private int moodPoints;
    protected TypeOfLocation location;
//    protected Emotion emotion = Emotion.NORMAL;

    public Person(String name, int age, TypeOfLocation location, Emotion emotion, int moodPoints) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.moodPoints = moodPoints;
    }

    public Person(String name, int age, TypeOfLocation location, Emotion emotion) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.moodPoints = 50;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void goToLocation(TypeOfLocation location)  {
        System.out.println(this.name + " отправляется в " + location + ".");
    }

    public Emotion getEmotion(){
        return switch(moodPoints / 25){
            case 0 -> Emotion.AWFUL;
            case 1 -> Emotion.ANGRY;
            case 2 -> Emotion.BAD;
            case 3 -> Emotion.NORMAL;
            case 4 -> Emotion.PEACEFUL;
            default -> throw new IllegalStateException("Ошибка настроения: " + moodPoints % 25);
        };
    }

    public void changeMood(int mP){
        this.moodPoints += mP;
    }


    private final LinkedList<Thing> allthings = new LinkedList<>();

    public void addItem(Thing things){
        allthings.add(things);
    }
    protected void delItem(Thing things){
        allthings.remove(things);
    }
    public LinkedList<Thing> getItem(){
        return allthings;
    }

    @Override
    public int hashCode() {
        return location.hashCode() + age * 21;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass() || obj == null) {
            return false;
        }
        Person o = (Person) obj;
        return age == o.age && location.equals(o.location);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name: " + getClass().getSimpleName() +
                ", Age: " + age +
                ", Location: " + location +
                '}';
    }
}




