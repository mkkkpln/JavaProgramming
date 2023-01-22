package persons;

import things.Car;
import enums.Emotion;

public class Driver extends Person {
    private boolean haveCar =false;
    private Car car;

    public Driver(String name, int age) {

        super(name, age);
    }


}
