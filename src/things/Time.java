package things;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;


public class Time {
    private static Calendar calendar;

    public Time() {
        this.calendar = new GregorianCalendar();
    }

    public static void timeGone(int min) {
        switch (min) {
            case 1, 21, 31 -> System.out.println("Прошла " + min + " минута.");
            case 2, 3, 4, 22, 23, 24 -> System.out.println("Прошло " + min + " минуты.");
            case 5, 6, 7, 8, 9, 10, 15, 20, 25, 30, 50 -> System.out.println("Прошло " + min + " минут.");
            default -> System.out.println("Прошло сколько-то минут");
        }

    }

    public Calendar getCalendar() {
        return calendar;
    }

    @Override
    public String
    toString() {
        return calendar.getTime().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Time time)) return false;
        return Objects.equals(getCalendar(), time.getCalendar());
    }
}