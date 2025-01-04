import java.util.Scanner;

// Finding factorial of a number

public class factorial_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorialof a number :- ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is " + factorial);

        }

    }

}
