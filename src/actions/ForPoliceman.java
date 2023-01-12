package actions;

import locations.TypeOfLocation;

public interface ForPoliceman {
    void comeUp(String location); // появиться
    void stick(); // ткнуть палкой
    void stick2();
    void give(String name);
    void be();
    void exist();
    void joke();
    void search(); // начать шарить в карманах
    void pull(); // потащить сквозь толпу
    void comeUp(); // вошёл
    void pull(String location); // протащить по улице
    void turn(); // свернуть
    void stop(); // остановиться
    void nod(); // кивнуть пальцем
    void silent(String name); // не удостоить ответом, молчать
    void sit(TypeOfLocation location); // сидеть
    void command(String words); // скомандовать
    void takeOff(); // снять
    void put(); // поставить
    void write(); // записать
    void press(); // нажать
    void tell(String words);
    void watch(); // смотреть
    void work(TypeOfLocation location);
}
