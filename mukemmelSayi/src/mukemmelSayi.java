import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int number;
        int total = 0;
        System.out.println("Please enter the number :");
        number = inp.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + " is perfect number.");
        } else {
            System.out.println(number + " is not perfect number");
        }

    }
}
