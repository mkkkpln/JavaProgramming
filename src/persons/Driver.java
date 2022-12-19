package persons;

import actions.*;
import cars.Car;
import locations.TypeOfLocation;

public class Driver extends Person implements Jump {
    private boolean haveCar =false;
    private Car car;

    public Driver(String name, int age, TypeOfLocation location) {
        super(name, age, location);
    }


    @Override
    public void jump(){
        System.out.println(this.name + " подпрыгивает в машине ");
    }


}
