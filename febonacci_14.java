
// Ques= Print fibonacci sequence = 0,1,1,2,3,5,8

import java.util.Scanner;

public class febonacci_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to obtain fibonacci sequence :- ");
        int number = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = a + b;

        if (number == 0) {
            System.out.print(a);
        } else {
            System.out.println(a);
            System.out.println(b);
            for (int i = 1; i <= number; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }
        }

    }

}
