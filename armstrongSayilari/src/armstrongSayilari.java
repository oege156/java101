import java.util.Scanner;
public class armstrongSayilari {
    public static void main(String[] args) {

        int a, b, i, j, k = 0, l, total = 0, m;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz :");
        a = inp.nextInt();
        m = a;
        i = a;

        while (i != 0) {
            i /= 10;
            k++;
        }
        while (a != 0) {
            b = a % 10;
            a /= 10;
            l = 1;
            for (j = 1; j <= k; j++) {
                l*=b;
            }
            total += l;
        }
        if (total == m) {
            System.out.println(m + " sayisi bir Armstrong sayisidir.");
        } else {
            System.out.println(m + " sayisi bir Armstrong sayisi degildir.");
        }
    }
}
