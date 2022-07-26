import java.util.Scanner;
public class ciftVe4unKatiOlanSayilar {
    public static void main(String[] args) {

        int n , total = 0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Sayi giriniz :");
            n = inp.nextInt();
            if ((n%4==0)) {
                total+=n;
            }

        } while (n%2 == 0);
        System.out.println("Toplam :"+total);
    }
}
