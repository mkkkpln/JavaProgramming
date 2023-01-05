package persons;

import actions.Command;
import actions.Silent;
import actions.Sit;
import actions.Work;
import locations.TypeOfLocation;

public class Policeman extends Person implements Silent, Sit, Work, Command {

    private boolean isGlamorousButton =false;

    public Policeman(String name, int age, TypeOfLocation location) {
        super(name, age, location);
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
    public void silent(){

        System.out.println(this.name + " молчит ");

        if (this.age < 45) {
            System.out.println(this.name + " ,оказывается, довольно молод в силу возраста ");
        }
        else {
            System.out.println(this.name + " ,оказывается, очень и очень старый в силу возраста");
        }
    }

    @Override
    public void work(TypeOfLocation location){
        System.out.println(this.name + " работает в " + location);

        if (this.location==TypeOfLocation.OPENAIR) {
            isGlamorousButton =true;
            System.out.println(this.name + " одет в мундир с блестящими пуговицами ");
        } else if (this.location==TypeOfLocation.UNVENTILATEDROOM) {
            isGlamorousButton =false;
            System.out.println(this.name + " одет в мундир с обычными металлическими пуговицами ");
        } else {
            System.out.println("У " + this.name + " нет одежды ");
        }

    }

    @Override
    public void command(){
        System.out.println(this.name + " cкомандовал ");
    }

    @Override
    public void sit(TypeOfLocation location){
        System.out.println(this.name + " сел в " + location);
    }



}
