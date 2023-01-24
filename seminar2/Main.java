package seminar2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog("Шарик", 4, 5);
//        Animal animal2 = new Dog("Бобик", 1, 2);
//        Animal animal3 = new Cat("Барсик", 2, "Полосатая");
//        Animal animal4 = new Cat("Батон", 8, "Сиамская");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя человека");
        String name = scanner.nextLine();
        System.out.println("Введите возраст человека");
        int age = scanner.nextInt();
        System.out.println("Сколько животных у человека? ");
        int quantity = scanner.nextInt();
        List<Animal> pets = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Собака (1) или кошка (0)?");
            int type = scanner.nextInt();
            if (type == 1){
                pets.add(new Dog("Собака", i, 5));
            } else {
                pets.add(new Cat("Мурзик", i, "полосатый"));
            }

        }

        Animal human1 = new Human(name, age, pets);
        System.out.println(human1);


//        HashSet<Animal> pets = new HashSet<>();
//        pets.add(animal1);
//        pets.add(animal2);
//        pets.add(animal3);
//        pets.add(animal4);
//        pets.forEach(Animal::sayHi);
//        System.out.println(animal1.getName());
//
//        animal1.tellAboutYourself();


//
//        animal1.sayHi();
//        animal2.tellAboutYourself();
//        animal3.tellAboutYourself();
//        animal4.tellAboutYourself();
//        animal3.sayHi();

    }
}
