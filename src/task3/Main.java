package task3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1998, Month.JULY, 28);

        Period p = Period.between(birthday, today);

        System.out.println("From day of my birthday passed: " + "\n" + p.getYears() + " years" + "\n" + p.getMonths() + " month" + "\n" + p.getDays() + " days");
    }
}
