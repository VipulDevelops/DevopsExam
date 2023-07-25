import java.util.Scanner;

public class Factorial {
     public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter a number: ");

        // Read the number from the user.
        int number = input.nextInt();

        // Calculate the factorial of the number.
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the factorial of the number to the console.
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}

// 1st question : factorial program (accept a number and return factorial) > git > docker
// 2nd question : deploy the above as a Kubernates pod with 3 instances and run it through Kubernetes
