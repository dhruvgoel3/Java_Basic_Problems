import java.util.Scanner;

public class negORpos_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check that the number is negative , possitive or zero :- ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Entered number is possitive");
        } else if (num < 0) {
            System.out.println("Entered number is negative");
        } else {
            System.out.println("The value of entered number is zero");
        }

    }

}
