import java.util.Scanner;
// Converet temrature celcius into fehrenhite

public class celciusToF_11 {
    // as == 0 degree c = 32 fahrenhite
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of temprature in Celius :-");
        float temp = sc.nextFloat();

        float TempInFehrenhite = (float) (temp * 1.8) + 32;

        System.out.println("Value of temprature in fehrenhite is :- " + TempInFehrenhite);
    }

}
