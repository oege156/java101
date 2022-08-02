import java.util.Scanner;

public class exponantiationCalculatorRecursive {
    static int result = 1;

    static int exp(int x, int y) {
        if (y == 0) {
            return 1;
        }

        result *= x;
        exp(x,y-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the base number :");
        x = inp.nextInt();
        System.out.println("Enter the exponent number :");
        y = inp.nextInt();

        System.out.println("Result :"+exp(x, y));

    }
}
