package proj8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Film f1 = new Film("Star Wars I", "Adventure", "150");
        Film f2 = new Film("Star Wars II", "Adventure", "140");
        Film f3 = new Film("Star Wars III", "Adventure", "140");
        Film f4 = new Film("Star Wars IV", "Adventure", "160");

        Library l1 = new Library("Space");
        l1.add(f1);
        l1.add(f2);
        l1.add(f3);
        l1.add(f4);
        System.out.println(Arrays.toString(l1.getFilms()));
    }
}