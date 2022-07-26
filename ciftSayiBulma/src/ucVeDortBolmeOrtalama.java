import java.util.Scanner;

public class ucVeDortBolmeOrtalama {
    public static void main(String[] args) {
        int k, i, piece = 0, total = 0, sonuc;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayi giriniz:");
        k = inp.nextInt();

        for (i = 1; i <= k; i++) {

            if ((i % 3 == 0) && (i % 4 == 0)) {
                total += i;
                piece++;
            }
        }
        if (piece == 0) {
            System.out.println("0 dan " + k + " sayisina kadar 3 ve 4 ile tam bolunen bir sayi yoktur.");
        } else {
            sonuc = total / piece;
            System.out.println("Ortalama :" + sonuc);
        }

    }
}
