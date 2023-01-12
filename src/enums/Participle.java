package enums;

public enum Participle {
    STANDINGUP ("Поднявшись из-за стола и "),
    WAVING ("помахав официанту " + Adverb.AFAR.toString() + " на прощание ручкой. "),
    SMILING (Adverb.POLITELY + " улыбнувшись,"),
    CATCHING ("Схватив Незнайку за руку"),
    TAKING (" достав из кармана свисток, "),
    POLICECATCHING ("Схватив Незнайку за шиворот, "),
    FINDING ("ничего в них не обнаружив, "),
    OPENING ("Открыв " + Adverb.WIDEOPEN.toString() + " дверцу, которая была с " + Adjective.BACK.toString() + " стороны кузова,"),
    BROWS ("нахмурив брови,"),
    WATCHING ("Увидев, "),
    RISINGUP ("Поднявшись с " + Adjective.DIRTY.toString() + ", заплеванного пола, "),
    BOX ( "Достав из ящика чистый бланк, ");

    private String mean;
    Participle(String name) {

        this.mean = name;
    }

    @Override
    public String toString() {

        return mean;
    }

}
