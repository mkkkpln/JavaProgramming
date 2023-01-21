package enums;

public enum Distance {
    FAR ("дальше"),
    WIDEOPEN ("настежь"),
    AFAR ("издали");

    private String mean;
    Distance(String name) {
        this.mean = name;
    }

    @Override
    public String toString() {
        return mean;
    }

}
