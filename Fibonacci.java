import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int n = scanner.nextInt();
        scanner.close();

        int firstTerm = 0;
        int secondTerm = 1;
        int count = 0;

        System.out.println("Fibonacci Sequence (first " + n + " terms):");

        while (count < n) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            count++;
        }
    }
}
