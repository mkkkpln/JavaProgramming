package things;

import enums.Material;
import enums.SizeAndForm;
import exceptions.NoPhoneOnTable;
import exceptions.TableBrokenException;
import java.util.ArrayList;


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

    public static class Table extends Thing{
        public Table (String name) {
            super(name);
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
                    + " " + Material.OAKEN.toString() + " " + this.name
                    + " с " + SizeAndForm.HEAVY.toString()
                    + " ножками. Он мог выдержать всего " + kg + " килограмм.");
            double chanceToBreak = kg * 0.00555555;
            if (Math.random() > 1 - chanceToBreak)
            {
                throw new TableBrokenException("Стол сломался из-за нагрузки...");
            }
        }

        public void have(Phone phone, BigBox bigBox, LittleBox littleBox) {
            System.out.println("На столе стояли " + phone + ", " + bigBox + ", " + littleBox + " и медная каска Мигля.");
        }


        public class Phone extends Thing{
            protected static ArrayList<Phone> phones=new ArrayList<>();
            public Phone (String name) {
                 super(name);
                phones.add(this);
                phones.add(this);
                phones.add(this);
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
        public class BigBox extends Thing{

            public BigBox (String name) {
                super(name);
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return "ящик с чистыми бланками для регистрации арестованных";
            }
        }

        public class LittleBox extends Thing{
            public LittleBox (String name) {
                super(name);
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return "плоская коробочка с черной типографской краской для изготовления отпечатков пальцев";
            }
        }

        public static class Helmet extends Thing{

            public Helmet (String name) {
                super(name);
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
    public static class PhotoMachine extends Thing{
        public PhotoMachine(String name) {
            super(name);
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

    public static class Wardrobe extends Thing{
        public Wardrobe(String name) {

            super(name);
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

    public static class XRAY extends Thing{
        public XRAY(String name) {
            super(name);
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


    public static class Shtafirka extends Thing{
        public Shtafirka(String name) {
            super(name);
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
