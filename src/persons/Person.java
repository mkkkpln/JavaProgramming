package persons;

import actions.Emotionable;
import enums.Emotion;
import locations.TypeOfLocation;

public abstract class Person implements Emotionable {
    protected String name;
    protected int age;
    protected TypeOfLocation location;
    protected Emotion emotion = Emotion.NORMAL;

    public Person(String name, int age, TypeOfLocation location, Emotion emotion) {
        this.name = name;
        this.age = age;
        this.location = location;
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

    public void setEmotion(Emotion emotion){
        this.emotion = emotion;
        System.out.printf("у %s настроение сменилось на %s\n", getName(), emotion);
    }
    public Emotion getEmotion(){
        return emotion;
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




