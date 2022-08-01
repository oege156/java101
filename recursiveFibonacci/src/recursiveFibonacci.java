import java.util.Scanner;
public class recursiveFibonacci {
    static int fib(int n) {
        if (n==1 || n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("What digit of the Fibonacci series do you want to find?");
        int digits = inp.nextInt();
        System.out.println(fib(digits));

    }
}
