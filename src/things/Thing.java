package things;

public abstract class Thing {
    protected String name;
    public Thing(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "вещи";
    }
    public String getName() {
        return name;
    }
}