import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.print("Enter the value of X: ");
        int X = scanner.nextInt();

        if (isFactor(N, X)) {
            System.out.println("Yes, " + X + " is a factor of " + N + ".");
        } else {
            System.out.println("No, " + X + " is not a factor of " + N + ".");
        }

        scanner.close();
    }

    private static boolean isFactor(int number, int potentialFactor) {
        return number % potentialFactor == 0;
    }
}
