import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 1st Number");
        int num1 = sc.nextInt();
        System.out.print("Enter your 2nd Number");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("Your sum is" + sum);
    }
}