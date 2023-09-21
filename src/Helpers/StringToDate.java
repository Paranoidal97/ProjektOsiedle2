package Helpers;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

public class StringToDate {
    public static Optional<Date> StringtoDate(String data) {
        try {
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd");
            Date date1 = sdf1.parse(data);
            return Optional.of(date1); // Zwracamy przekonwertowaną datę opakowaną w Optional
        } catch (ParseException e) {
            e.printStackTrace();
            return Optional.empty(); // W przypadku błędu, zwracamy pusty Optional
        }
    }
}