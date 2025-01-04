import java.util.Scanner;

public class NaturalSum_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get sum of all the natural numbers");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Please enter a possitive number");
        } else {
            int sum = 0;
            while (number > 0) {
                sum += number;
                number -= 1;
            }
            System.out.println(sum);
        }

    }

}
