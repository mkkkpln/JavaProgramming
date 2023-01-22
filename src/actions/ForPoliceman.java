package actions;

import locations.TypeOfLocation;
import persons.Person;
import persons.Policeman;
import persons.Shorty;
import things.PartOfBody;
import things.Room;

public interface ForPoliceman {
    void comeUp(String location); // появиться
    void stick(PartOfBody.Forehead forehead); // ткнуть палкой
    void stick2(Shorty Neznaika);
    void give(Shorty Neznaika);
    String be();
    void exist(Policeman figle);
    void joke();
    void search(Shorty Neznaika); // начать шарить в карманах
    void pull(); // потащить сквозь толпу
    void comeUp(); // вошёл
    void pull(String location); // протащить по улице
    void turn(); // свернуть
    void stop(); // остановиться
    void nod(); // кивнуть пальцем
    void silent(String name); // не удостоить ответом, молчать
    void sit(TypeOfLocation location); // сидеть
    void command(String words); // скомандовать
    void takeOff(Policeman figle); // снять
    void put(); // поставить
    void write(Shorty Neznaika); // записать
    void press(); // нажать
    void tell(Room.Door door, String words);
    void watch(Person person); // смотреть
    void work(TypeOfLocation location);
}
