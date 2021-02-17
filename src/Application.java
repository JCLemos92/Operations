import java.util.Scanner;

public class Application {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd number: ");
        int b = scanner.nextInt();

        System.out.println("Result: " + (a + b) );
    }
}
