import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter machine OS");
        Scanner scanner = new Scanner(System.in);
        String osType = scanner.nextLine();
        scanner.close();

        IFactory factory = GUIAbstractFactory.createFactory(osType);

        if (factory != null) {
            IButton button = factory.createButton();
            button.press();

            ITextbox textBox = factory.createTextbox();
            textBox.settext();
        } else {
            System.out.println("Invalid OS type");
        }
    }
}