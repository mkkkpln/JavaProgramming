package things;

public class PartOfBody {
    private static String name;

    public PartOfBody (String name) {
        PartOfBody.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "часть тела";
    }


    public static class Hands {
        private String name;
        public Hands (String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return "руками";
        }
    }

    public static class Forehead {
        private String name;
        public Forehead (String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return "лоб";
        }
    }
}