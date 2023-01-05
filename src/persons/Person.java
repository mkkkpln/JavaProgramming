package persons;

import locations.Location;
import locations.TypeOfLocation;

public abstract class Person{
    protected String name;
    protected int age;
    protected TypeOfLocation location;

    public Person(String name, int age, TypeOfLocation location) {
        this.name = name;// назвали человека
        this.age = age;
        this.location = location;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void goToLocation(Location location) {
        System.out.println(this.name + " отправляется в " + location.getTypeOfLocation());
        this.location = location.getTypeOfLocation();
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


