import cars.Car;
import cars.Motor;
import locations.Location;
import locations.TypeOfLocation;
import persons.Driver;
import persons.Policeman;
import persons.WithoutWork;

//Полицейский не удостоил его ответом, а сел в кабину рядом с шофером и скомандовал:
//Мотор загудел. Автомобиль запрыгал по камням мостовой, и через четверть часа
// Незнайка уже был в полицейском управлении. Полицейский, которого звали Фиглем,
// сдал Незнайку с рук на руки другому полицейскому, которого звали Миглем.
// Полицейский Мигль был одет в такой же мундир, как и Фигль, только пуговицы на его мундире
// не отличались таким ярким блеском, как пуговицы на мундире Фигля.
// Это объяснялось тем, что служба полицейского Мигля протекала не на открытом воздухе,
// а в закрытом, плохо проветриваемом помещении, отчего металл, из которого были сделаны пуговицы,
// постепенно покрывался окислами и тускнел.

public class Main {
    public static void main(String[] args) {
        System.out.println("Запуск моей программы\n");

        Location pavement = new Location(TypeOfLocation.PAVEMENT);
        Policeman figle = new Policeman("Фигль", 42, TypeOfLocation.UNVENTILATEDROOM );
        figle.goToLocation(pavement);
        figle.silent();
        figle.command();
        Location car = new Location(TypeOfLocation.CAR);
        Motor best = new Motor("Лучший в мире мотор", 501);
        Car bmw = new Car("BMW", best);
        best.voice();
        figle.goToLocation(car);
        figle.sit(TypeOfLocation.CAR);
        Driver driver = new Driver("Водитель", 56,TypeOfLocation.CAR);
        WithoutWork neznaika = new WithoutWork("Незнайка", 12);
        driver.jump();
        neznaika.transfer();
        Location policestation = new Location(TypeOfLocation.POLICESTATION);
        neznaika.goToLocation(policestation);
        Policeman migle = new Policeman("Мигль", 42, TypeOfLocation.OPENAIR);
        migle.work(TypeOfLocation.OPENAIR);
        Location room = new Location(TypeOfLocation.UNVENTILATEDROOM);
        figle.goToLocation(room);
        figle.work(TypeOfLocation.UNVENTILATEDROOM);


    }
}