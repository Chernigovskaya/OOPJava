package seminar1;

// Проработать и описать логику генеалогического древа на языке Java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Vasya", "m", false, null, null);
        Human h2 = new Human("Anna", "f", false, null, null);
        Human h3 = new Human("Sergei", "m", true, h1, h2);
        Human h4 = new Human("Ivan", "m", false, h1, h2);
        Human h6 = new Human("Nasty", "f", false,null, null);
        Human h7 = new Human("Maksim", "m", false,null, null);
        Human h8 = new Human("Maria", "f", true, h7, h6);
        Human h9 = new Human("Dasha", "f", true, null, null);
        Human h10 = new Human("Katy", "f", true, h3, h9);



        Set<Human> setHuman = new LinkedHashSet<>(Arrays.asList(h1, h2, h3, h4));
        setHuman.add(h6);
        setHuman.add(h7);
        setHuman.add(h8);
        setHuman.add(h9);
        setHuman.add(h10);


        h1.setChildrens(new LinkedHashSet<>(Arrays.asList(h3, h4)));
        h2.setChildrens(new LinkedHashSet<>(Arrays.asList(h3, h4)));
        h7.setChildrens(new LinkedHashSet<>(Arrays.asList(h8)));
        h6.setChildrens(new LinkedHashSet<>(Arrays.asList(h8)));
        System.out.println(h1);
        System.out.println(h1.getChildren());
        System.out.println(h1.isLiveStatus());
        System.out.println(h3.getFather());
        System.out.println(h6.getChildren());




//        Family family1 = new Family(h1,h2, new LinkedHashSet<>(Arrays.asList(h3, h4)));
//        Family family2 = new Family(h3, h8,null);
//        Family family3 = new Family(null,h10, new LinkedHashSet<>(Arrays.asList(h10)));
//        System.out.println(family1.getHusband());
//        System.out.println(family1.getWife());
//        System.out.println(family1.getChildrens());
//        System.out.println(family1);
//        System.out.println(family2.getChildrens());
//        System.out.println();


    }
}