package GUI03_home.zad5;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 1; i <=12 ; i++) {
            LocalDate localDate = LocalDate.of(LocalDate.now().getYear(), i, 1);
            hashMap.put(localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH), localDate.getMonth().maxLength());
        }

        System.out.println(hashMap);

        System.out.println(hashMap.get("March"));
    }
}
