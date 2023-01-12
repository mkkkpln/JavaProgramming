package locations;

public class Location {
    private final TypeOfLocation loc;
    public Location(TypeOfLocation loc) {

        this.loc = loc;
    }
    public TypeOfLocation getTypeOfLocation() {
        return loc;
    }

}
