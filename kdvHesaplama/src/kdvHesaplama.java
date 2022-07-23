import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args) {
        double anaPara , kdv , kdvTutari , kdvDahil;
        boolean kdvDurum;

        Scanner inp = new Scanner(System.in);

        System.out.println("Tutar giriniz = ");
        anaPara = inp.nextDouble();

        kdvDurum = (0 < anaPara) && (anaPara > 1000);

         kdv = kdvDurum ? 0.08 : 0.18;

        kdvTutari = kdv * anaPara;
        kdvDahil = kdvTutari + anaPara;

        System.out.println("Girilen tutar = "+anaPara);
        System.out.println("KDV orani = "+kdv);
        System.out.println("KDV tutari = "+kdvTutari);
        System.out.println("KDV dahil tutar = "+kdvDahil);
    }
}
