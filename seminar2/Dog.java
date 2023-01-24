package seminar2;

public class Dog extends Animal {

    private int mood;

    public Dog(String name, int age, int mood) {
     super(name, age);
     this.mood = mood;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    @Override
    void tellAboutYourself() {
        System.out.printf("Привет, я собака, меня зовут %s, мое настроение на %d \n", this.getName(), this.mood);
    }
//*Перегрузить у собаки метод, что бы мы могли менять настроение

//    public void tellAboutYourself(int mood) {
//        System.out.printf("Привет, я собака, меня зовут %s, теперь мое настроение на %d \n", this.name, mood);
//    }
//    public void tellAboutYourself(String say) {
//        System.out.println(say);
//    }

    @Override
    void sayHi() {
        System.out.println("Гав-гав");
    }

    @Override
    public String toString() {
        return "Dog{" + "имя = " + getName() + " " +
                "возраст = " + getAge() + " " +
                "настроение = " + mood +
                '}';
    }
}
