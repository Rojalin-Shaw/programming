import java.util.*;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice");
        String Button = sc.nextLine();
        switch (Button) {
            case "a":
                System.out.println("Hello");
                break;
            case "b":
                System.out.println("Hi");
                break;
            case "c":
                System.out.println("Hlw");
                break;
            default:
                System.out.println("Invalid Chouice");
        }
    }
}