package seminar2;

public class Cat extends Animal{

    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



    @Override
    void tellAboutYourself() {
        System.out.printf("Привет, я кошка, меня зовут %s, мне %d лет, моя порода %s \n", this.getName(), this.getAge(), this.breed);
    }

    @Override
    void sayHi() {
        System.out.println("мяу-мяу");
    }

    @Override
    public String toString() {
        return "Cat{" + getName() + " возраст = " + getAge() + " " +
                "порода = '" + breed + '\'' +
                '}';
    }
}
