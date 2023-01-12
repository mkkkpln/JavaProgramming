package actions;

import enums.Emotion;

public interface Emotionable {
    void setEmotion(Emotion emotion);
    Emotion getEmotion();
}
