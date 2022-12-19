package locations;
//lubitelkvokk - github про локации, чтобы обозначать, какая именно локация сейчас - указываем в main

public class Location {
    private final TypeOfLocation loc;

    public Location(TypeOfLocation loc) {
        this.loc = loc;
    }

    public TypeOfLocation getTypeOfLocation() {
        return loc;
    }

//    @Override
//    public void setEmotion() {
//        if (this.name.equals("Alice")) {
//            this.emotion = Emotion.pride;
//        } else if (iq_level < 100 && getClass().getSimpleName().equals("Girl")) {
//            this.emotion = Emotion.sad;
//        } else if (iq_level > 120) {
//            this.emotion = Emotion.thoughtful;
//        }
//    }
//
//    @Override
//    public void getEmotion() {
//        setEmotion();
//        System.out.println(this.name + " has an emotion: " + this.emotion);
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//
//        if (obj == null || obj.getClass() != getClass()) {
//            return false;
//        }
//
//        Location o = (Location) obj;
//        return typeOfLocation == o.typeOfLocation;
//    }
}
