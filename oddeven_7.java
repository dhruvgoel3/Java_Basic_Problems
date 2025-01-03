import java.util.Scanner;

public class oddeven_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check that it is dd or even :- ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Enterd number is odd");
        }

    }

}
