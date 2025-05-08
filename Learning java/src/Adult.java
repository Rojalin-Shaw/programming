import java.util.*;

public class Adult {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.print("You are adult");

        } else {
            System.out.print("you are not adult");
        }
    }
}
