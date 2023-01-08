package enums;

public enum Adverb {
    GOOD ("хорошо"),
    COMPLACENTLY ("благодушно"),
    AFAR ("издали"),
    POLITELY ("вежливо"),
    FAST ("моментально"),
    UNNATURAL ("неестественно"),
    SHRILL ("пронзительно"),
    INVOLUNTARILY ("невольно"),
    CAREFULLY ("осторожно"),
    MECHANICALLY ("машинально"),
    BYSIDES ("по швам"),
    STRONGLY ("сильно"),
    WIDEOPEN ("настежь"),
    IMPERATIVE ("повелительно"),
    HEADOVERHEELS ("кувырком"),
    PREVIOUSLY ("предварительно"),
    GLOOMILY ("хмуро");

    private String mean;
    Adverb(String name) {
        this.mean = name;
    }

    @Override
    public String toString() {
        return mean;
    }


}
