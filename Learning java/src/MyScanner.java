import java.util.*; // Import the Scanner class

public class MyScanner {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter your name");// Prompt user for input
      String name = scanner.nextLine(); // Read user input
      System.out.println("Hello, " + name + "!");
      scanner.close();// Output user input
   }
}
