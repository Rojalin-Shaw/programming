import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if (word.length() > 10) {
                System.out.println(word.charAt(0) + "" + (word.length() - 2) + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
        sc.close();
    }
}
