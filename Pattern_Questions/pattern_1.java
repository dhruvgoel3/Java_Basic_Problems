package Pattern_Questions;

// SOLID rECTANGLE
// Here we will be using nested loops
//    *****
//    *****
//    *****
//    *****
public class pattern_1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) // For rows(Outer loop)
        {
            for (int j = 1; j <= 5; j++) { // Inner loop
                System.out.print("*");

            }
            System.out.println();

        }

    }

}
