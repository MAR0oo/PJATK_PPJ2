package GUI03_home.zad3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Ala");
        list.add("ma");
        list.add("Kota");

        System.out.println(list.size());

        for(String s: list){
            System.out.println(s + " ");
        }

    }
}
