package enums;

public enum Adjective {
    KIND ("добрые"),
    RIDICULOUS ("нелепые"),
    TALL ("рослый"),
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
    PHOTOGRAPHIC ("фотографический"),
    XRAY ("рентгеновский"),
    KIDNAPPED ("похищенных"),
    LONG ("длинной"),
    CHEEKBONES ("скуластые"),
    BROADFACED ("широколицые"),
    ANGRY ("сердитый"),
    TRIMMED ("подстриженный");

    private String mean;
    Adjective(String name) {
        this.mean = name;
    }

    @Override
    public String toString() {
        return mean;
    }




}
