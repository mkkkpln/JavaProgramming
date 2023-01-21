package enums;

public enum Face {

    CHEEKBONES ("скуластые"),
    KIND ("добрые"),
    BROADFACED ("широколицые");

    private String mean;
    Face(String name) {
        this.mean = name;
    }

    @Override
    public String toString() {
        return mean;
    }
}
