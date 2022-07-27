import java.util.Scanner;
public class harmonikSeriBulma {
    public static void main(String[] args) {
        double result = 0,i;
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("n sayisini giriniz :");
        n = inp.nextInt();

        for (i =1;i<=n;i++) {
            result += (1/i);
        }
        System.out.println(result);
    }
}
