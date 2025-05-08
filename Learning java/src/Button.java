import java.util.*;

public class Button {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Chioce");
        int Button = sc.nextInt();
        if (Button == 1) {
            System.out.print("Hello");
        } else if (Button == 2) {
            System.out.println("Namaste");
        } else {
            System.out.println("Invalid Choice");
        }
        sc.close();
    }
}