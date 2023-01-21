package enums;

public enum Power {
    STRONGLY ("изо всех сил"),
    INVOLUNTARILY ("невольно"),
    BYSIDES ("по швам");
    private String mean;
    Power(String name) {
        this.mean = name;
    }

    @Override
    public String toString() {
        return mean;
    }
}
