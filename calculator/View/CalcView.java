package calculator.View;

import java.util.Scanner;

import calculator.Controller.Controller;

public class CalcView {
    private Controller controller = new Controller();
    public void getNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        int a = scanner.nextInt();
        System.out.println("enter operation");
        String sunvol = scanner.next();
        System.out.println("enter b");
        int b = scanner.nextInt();
        if (sunvol.equals("+")) {
            System.out.println(controller.sumNumbers(a, b));
        }
        if (sunvol.equals("-")) {
            System.out.println(controller.differenceNumbers(a, b));
        }
        if (sunvol.equals("*")) {
            System.out.println(controller.multiplicationNumbers(a, b));
        }
        if (sunvol.equals("/")) {
            System.out.println(controller.divisionNumbers(a, b));
        }
    }

}
