package enums;

public enum TypeOfAction {
    STANDINGUP ("Поднявшись из-за стола и "),
    WAVING ("помахав официанту на прощание ручкой. "),
    SMILING (Condition.POLITELY + " улыбнувшись,"),
    CATCHING ("Схватив Незнайку за руку"),
    TAKING (" достав из кармана свисток, "),
    POLICECATCHING ("Схватив Незнайку за шиворот, "),
    FINDING ("ничего в них не обнаружив, "),
    OPENING ("Открыв дверцу, которая была с задней стороны кузова,"),
    BROWS ("нахмурив брови,"),
    WATCHING ("Увидев, "),
    RISINGUP ("Поднявшись с заплеванного пола, "),
    BOX ( "Достав из ящика чистый бланк, ");

    private String mean;
    TypeOfAction(String name) {

        this.mean = name;
    }

    @Override
    public String toString() {

        return mean;
    }

}
