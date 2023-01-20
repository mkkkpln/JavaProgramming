package actions;

import enums.Body;
import enums.Emotion;
import persons.Shorty;
import things.PartOfBody;
import things.Room;

public interface ForShorty {
    void think(Shorty all); // думать
    void transfer(); // отправиться в другое место
    void putHeadBack(Body body); // откинуть голову назад
    void smell(); // понюхать
    void stretchArms(); // вытянуть руки по швам
    void stagger(); // зашататься
    void slow(); // медлить
    void fall(); // полететь вниз
    void happened(); // случилось
    void lie(Body body);// лечь на дверь
    void drum(Body body); // забарабанить
    void waveHands(PartOfBody.Hands hands);// махать руками
    void watch(); // смотреть
    void riseUp(); // поднять
    void understand(Room.Door door); // сообразить



}
