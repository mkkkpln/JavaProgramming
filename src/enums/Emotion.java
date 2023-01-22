package enums;

public enum Emotion {
    ANGRY ("злое настроение"),
    BAD ("плохое настроение"),
    NORMAL ("хорошее настроение"),
    PEACEFUL ("счастливое настроение"),
    AWFUL ("беда");


    private String mean;
    Emotion(String name) {
        this.mean = name;
    }

    @Override
    public String toString() {
        return mean;
    }

}
