package seminar1;

// Проработать и описать логику генеалогического древа на языке Java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Vasya", "m", true);
        Human h2 = new Human("Anna", "f", true);
        Human h3 = new Human("Sergei", "m", true);
        Human h4 = new Human("Ivan", "m", true);
        Human h5 = new Human("Sveta", "f", true);
        Human h6 = new Human("Nasty", "f", true);
        Human h7 = new Human("Maksim", "m", true);
        h1.father(h3);
        h2.mother(h3);
        h1.father(h4);
        h2.mother(h4);


        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}