import java.util.*;

public class Even {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.print("Number is odd");
        }
        sc.close();
    }
}