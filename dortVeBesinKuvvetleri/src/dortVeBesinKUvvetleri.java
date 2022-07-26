import java.util.Scanner;
public class dortVeBesinKUvvetleri {
    public static void main(String[] args) {

        int n , k , j;

        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayi giriniz :");
        n = inp.nextInt();

        System.out.println("4 un Kuvvetleri :");
        for (k = 1; k <= n;k *= 4) {
            System.out.println(k);
        }System.out.println("--------------");
        System.out.println("5 in Kuvvetleri :");
        for (j = 1; j <= n;j *= 5) {
            System.out.println(j);
        }

    }
}
