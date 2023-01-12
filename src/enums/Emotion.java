package enums;

public enum Emotion {
    NORMAL ("нейтральное настроение"),
    ANGRY ("от злости"),
    SHY (" в смущении");

    private String mean;
    Emotion(String name) {
        this.mean = name;
    }

    @Override
    public String toString() {
        return mean;
    }



}
