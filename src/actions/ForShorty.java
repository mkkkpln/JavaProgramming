package actions;

import enums.Body;
import enums.Emotion;
import persons.Person;
import persons.Shorty;
import things.PartOfBody;
import things.Room;

import java.util.LinkedList;

public interface ForShorty {
    String think(); // думать
    void transfer(Person person); // отправиться в другое место
    void putHeadBack(Body body); // откинуть голову назад
    void smell(Person obj); // понюхать
    void stretchArms(Person obj); // вытянуть руки по швам
    void stagger(); // зашататься
    void slow(); // медлить
    void fall(Person p); // полететь вниз
    void happened(String[] events); // случилось
    void lie(Body body);// лечь на дверь
    void drum(Body body); // забарабанить
    void waveHands(PartOfBody.Hands hands, Person obj);// махать руками
    void watch(); // смотреть
    void riseUp(); // поднять
    void understand(Room.Door door); // сообразить



}
