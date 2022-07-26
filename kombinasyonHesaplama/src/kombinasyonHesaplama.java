import java.util.Scanner;

public class kombinasyonHesaplama {
    public static void main(String[] args) {

        int n,r,k,j,nFak=1,rFak=1,l,m,lFak=1,kom;


        Scanner inp = new Scanner(System.in);

        System.out.println("Kombinasyon C(n,r) seklinde gosterilir.");
        System.out.println("\"N\" degerini giriniz:");
        n = inp.nextInt();
        System.out.println("\"r\" degerini giriniz");
        r = inp.nextInt();
        l = n - r;
        for (k = 1; k <= n; k++) {
            nFak *= k;
        }
        for (j = 1; j <= r; j++) {
            rFak *= j;
        }
        for (m = 1; m <= l; m++) {
            lFak *= m;
        }
        kom = nFak / (rFak * lFak);
        System.out.println("C(n,r) = " + kom);
    }
}
