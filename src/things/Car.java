package things;

import locations.TypeOfLocation;

public class Car {
    String name;
    private Motor motor;

    public Car(String name, Motor motor){
        this.name=name;
        this.motor=motor;
    }

    public void jump() {
        System.out.println(this.name + " запрыгал по камням " + TypeOfLocation.PAVEMENT.toString() + ", и через четверть часа Незнайка уже был в " + TypeOfLocation.POLICESTATION.toString() + ".");
    }

}
