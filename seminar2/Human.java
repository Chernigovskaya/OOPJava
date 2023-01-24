package seminar2;

import java.util.List;

// Описать человека с возможностью заведения животных
// Добавить методы по изменению параметров
// Сделать добавление животных интерактивным
// Вывести в консолоь

public class Human extends Animal{
    private List<Animal> pets;

    public Human(String name, int age, List<Animal> pets) {
        super(name, age);
        this.pets = pets;
    }

    @Override
    void tellAboutYourself() {
        System.out.printf("Я человек %s ", getName());
    }

    @Override
    void sayHi() {
        System.out.println("Привет");

    }

    public List<Animal> getPets() {
        return pets;
    }

    public void setPets(List<Animal> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Human{" + getName() + " " +
                "pets=" + getPets() +
                '}';
    }
}
