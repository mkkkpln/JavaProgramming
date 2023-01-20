package enums;

public enum Adjective {
    KIND ("добрые"),
    BLUE ("синем"),
    COOPER ("медной"),
    WEIGHTY ("увесистая"),
    RUBBER ("резиновая"),
    ELECTRIC ("электрическим"),
    NARROW ("узенький"),
    BLACK ("черной"),
    SMALL ("небольшим"),
    BARRED ("зарешеченным"),
    BACK ("задней"),
    DIRTY ("грязного"),
    STRONG ("крепкий"),
    OAKEN ("дубовый"),
    HEAVY ("тяжелыми"),
    STRAIGHT ("прямыми"),
    QUADRANGULAR ("четырехугольными"),
    CHEEKBONES ("скуластые"),
    BROADFACED ("широколицые");

    private String mean;
    Adjective(String name) {
        this.mean = name;
    }

    @Override
    public String toString() {
        return mean;
    }


}
