package enums;

public enum SizeAndForm {
    NARROW ("узенький"),
    SMALL ("небольшим"),
    WEIGHTY ("увесистая"),
    HEAVY ("тяжелыми");

    private String mean;
    SizeAndForm(String name) {
        this.mean = name;
    }
    @Override
    public String toString() {
        return mean;
    }
}
