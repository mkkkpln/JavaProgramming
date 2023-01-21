package enums;

public enum Color {
    BLUE ("синем"),
    BLACK ("черной");

    private String mean;
    Color(String name) {
        this.mean = name;
    }

    @Override
    public String toString() {
        return mean;
    }
}
