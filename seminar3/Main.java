package seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        List<Object> objects = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int index = scanner.nextInt();
        System.out.println("txt or picture");
        for (int i = 0; i <= index; i++) {
            String choice = scanner.nextLine();
            if ("txt".equals(choice)){
                Text myText = new Text("какой-то текст");
                objects.add(myText);
            } else if ("picture".equals(choice)) {
                Picture myPicture = new Picture(2);
                objects.add(myPicture);
            } else System.out.println("Что-то не то ввели");
        }
        objects.forEach(Process::processing);
    }

}
