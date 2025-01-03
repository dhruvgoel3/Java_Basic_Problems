import java.util.Scanner;

public class leapYear_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to that it is leap year or not :- ");
        int year = sc.nextInt();

        if (year % 400 == 0 && year % 100 == 0) {
            System.out.println("It is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("it is also a leap year");
        } else {
            System.out.println("it is not a leap year");
        }
    }

}
