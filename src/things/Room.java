package things;

import enums.Adjective;
import exceptions.NoPhoneOnTable;
import exceptions.TableBrokenException;
import java.util.ArrayList;
import java.util.List;

public class Room {
    private static String name;
    public Room (String name) {
        Room.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "комната";
    }

    public static class Table {
        private String name;
        public Table (String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return "стол";
        }

        public void stand(int kg) {
            System.out.println("Посреди комнаты стоял 3х метровый "
                    + Adjective.STRONG.toString()
                    + " " + Adjective.OAKEN.toString() + " " + this.name
                    + " с " + Adjective.HEAVY.toString() + " " + Adjective.STRAIGHT.toString()
                    + " " + Adjective.QUADRANGULAR.toString() + " ножками. Он мог выдержать всего " + kg + " килограмм.");
            double chanceToBreak = kg * 0.00555555;
            if (Math.random() > 1 - chanceToBreak)
            {
                throw new TableBrokenException("Стол сломался из-за нагрузки...");
            }
        }

        public void have(Phone phone, BigBox bigBox, LittleBox littleBox) {
            System.out.println("На столе стояли " + phone + ", " + bigBox + ", " + littleBox + " и медная каска Мигля.");
        }


        public class Phone {
            private String name;
            protected static ArrayList phones;
            public Phone (String name, Phone ... phones) {
                 this.name = name;
                if (phones == null){
                    this.phones = new ArrayList<>();
                }
                else{
                    this.phones = new ArrayList<>(List.of(phones));
                }
            }
            public String getName(){
                return name;
            }
            @Override
            public String toString(){
                return "телефонный аппарат";
            }
            public void lose (int cnt) throws NoPhoneOnTable {
                if (cnt < 1){
                    throw new NoPhoneOnTable("На столе нет телефонного аппарата!");
                }
                else {
                    System.out.println("Всего " + cnt + " телефон на столе"); }
            }
            public static ArrayList<Phone> getPhones() {
                return phones;
            }
        }
        public class BigBox {
            private final String name;

            public BigBox (String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return "ящик с чистыми бланками для регистрации арестованных";
            }
        }

        public class LittleBox {
            private final String name;

            public LittleBox (String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return "плоская коробочка с черной типографской краской для изготовления отпечатков пальцев";
            }
        }

        public static class Helmet {
            private String name;

            public Helmet (String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return "медная каска Мигля";
            }
            public void shine() {
                System.out.println("Медная каска Мигля блестела менее ярко, нежели каска Фигля.");
            }
        }
    }
    public static class PhotoMachine {
        private String name;

        public PhotoMachine(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "фотографический автомат для изготовления фотокарточек";
        }
        public void stand() {
            System.out.print("Позади стола с одной стороны стоял фотографический автомат для изготовления фотокарточек, ");
        }
    }

    public static class Wardrobe {
        private String name;

        public Wardrobe(String name) {

            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "высокие шкафы";
        }
        public void keep() {
            System.out.println("Все стены этого помещения были заставлены высокими шкафами, в которых хранились сведения о различных преступниках.");
        }
    }

    public static class XRAY {
        private String name;

        public XRAY(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "рентгеновский аппарат";
        }
        public void stand() {
            System.out.print("с другой стороны находился " + getName() + ", с помощью которого просвечивали арестованных насквозь, чтоб узнать, ");
        }
    }


    public static class Door {
        private String name;

        public Door(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return "дверца";
        }
        public void close() {
            System.out.println(this.name + " за ним захлопнулась. ");
        }

    }


    public static class Shtafirka {
        private String name;

        public Shtafirka(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "штафирка";
        }
        public void stand() {
            System.out.println("У дверей находилась так называемая штафирка, то есть прибор для измерения роста преступников, состоявший из длинной, установленной на подставке вертикальной рейки с делениями и подвижной планки.");
        }
    }
}
