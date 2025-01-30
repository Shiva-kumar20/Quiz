import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz!");
        System.out.println("Here's your question:");
        System.out.println("What is the capital of France?");
        System.out.println("a) Berlin");
        System.out.println("b) Madrid");
        System.out.println("c) Paris");
        System.out.println("d) Rome");

        System.out.print("Enter your answer (a/b/c/d): ");
        char answer = scanner.next().charAt(0);

        if (answer == 'c' || answer == 'C') {
            System.out.println("Correct! Paris is the capital of France.");
        } else {
            System.out.println("Incorrect. The correct answer is c) Paris.");
        }

        scanner.close();
    }
}

