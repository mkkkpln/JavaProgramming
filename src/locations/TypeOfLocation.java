package locations;

public enum TypeOfLocation {
    PAVEMENT ("мостовой"),
    POLICESTATION("полицейском управлении"),
    CAR("машину "),
    OPENAIR("том месте, которое можно назвать \"на открытом воздухе\" "),
    UNVENTILATEDROOM("закрытом, плохо проветриваемом помещении. "),
    DARKNESS ("темноты"),
    STREET(" по улице"),
    AVENUE(" переулок "),
    RESTAURANT(" ресторан ");


    private String mean;
    TypeOfLocation(String name) {
        this.mean = name;
    }

    @Override
    public String toString() {
        return mean;
    }

}