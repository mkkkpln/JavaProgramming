package enums;

public enum Condition {
    GOOD ("хорошо"),
    COMPLACENTLY ("благодушно"),
    POLITELY ("вежливо"),
    IMPERATIVE ("повелительно");
    private String mean;
    Condition(String name) {
        this.mean = name;
    }

    @Override
    public String toString() {
        return mean;
    }
}
