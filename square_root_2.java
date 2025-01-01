import java.util.Scanner;

public class square_root_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here : ");
        int number = sc.nextInt();

        double sr = Math.sqrt(number);
        System.out.println("The square root of the entered number is");
        System.out.println(sr);
    }

}
