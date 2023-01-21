package enums;

public enum Material {
    OAKEN ("дубовый"),
    RUBBER ("резиновая"),
    ELECTRIC ("электрическим"),
    COOPER ("медной");
    private String mean;
    Material(String name) {
        this.mean = name;
    }

    @Override
    public String toString() {
        return mean;
    }
}
