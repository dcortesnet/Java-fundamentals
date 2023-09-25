package f06_dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        System.out.println("Dates");

        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        // Format date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatDate = nowDate.format(formatter);

        System.out.println(formatDate);

    }
}
