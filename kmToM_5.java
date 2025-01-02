import java.util.Scanner;

public class kmToM_5 {
    public static void main(String[] args) {
        // Convert kilometers into miles
        // 1 kilometer = 0.621371 Mile

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value in kilometers :- ");

        float km = sc.nextFloat();

        float miles = (float) ((0.621371) * km);
        System.out.println(miles);

    }

}
