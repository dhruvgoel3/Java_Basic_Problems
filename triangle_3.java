import java.util.Scanner;

public class triangle_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of base: ");
        float base = sc.nextFloat(); // Corrected to sc.nextFloat()
        System.out.print("Enter the value of height: ");
        float height = sc.nextFloat();

        float AreaOfTriangle = 0.5f * base * height;

        System.out.print("Area of triangle is: ");
        System.out.println(AreaOfTriangle);
    }
}
