import java.util.Scanner;

public class primeNumberFinder {

    static boolean checkPrime(int number, int index) {
        if (number <= 2) {
            return number == 2;
        }
        if (number % index == 0) {
            return false;
        }
        if (index * index > number) {
            return true;
        }
        return checkPrime(number, index + 1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true){
            System.out.println("If you want to exit, please enter \"0\"");
            System.out.println("Please enter the number :");
            int number = inp.nextInt();
            if (number == 0){
                break;
            }
            if (checkPrime(number, 2)){
                System.out.println(number+" is a prime number.");
            }else {
                System.out.println(number+" is not a Prime number. Please try again.");
            }
        }
    }
}
