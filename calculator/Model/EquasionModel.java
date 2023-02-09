package calculator.Model;

public class EquasionModel {
    private int number;

    public EquasionModel(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Result = " + number;
    }
}
