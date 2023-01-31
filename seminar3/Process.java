package seminar3;

public class Process {
    public static void processing(Object object){
        if (object instanceof Text){
            System.out.println("Text сохранен");
            System.out.println(((Text) object).getText());
        } else if (object instanceof Picture) {
            System.out.println("Картинка сохранена");
            System.out.println(((Picture) object).getMyPicture());
        } else {
            System.out.println("что-то пошло не так...");
        }
    }
}
