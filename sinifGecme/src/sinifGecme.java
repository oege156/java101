import java.util.Scanner;
public class sinifGecme {
    public static void main(String[] args) {

        double mat , fizik , turkce , kimya , muzik , toplam=0 ;


        Scanner inp = new Scanner(System.in);

        System.out.println("Ders notlarını giriniz");
        System.out.println("Matematik :");
        mat = inp.nextDouble();

        if ((mat >= 0 && mat <= 100)){
            toplam = toplam + mat;
        }


        System.out.println("Fizik :");
        fizik = inp.nextDouble();

        if ((fizik >= 0 && fizik <= 100)){
            toplam = toplam + fizik;

        }

        System.out.println("Turkce :");
        turkce= inp.nextDouble();

        if ((turkce >= 0) && (turkce <= 100)){
            toplam = toplam + turkce;

        }

        System.out.println("Kimya :");
        kimya = inp.nextDouble();

        if ((kimya >= 0) && (kimya <= 100)){
            toplam = toplam + kimya;

        }

        System.out.println("Muzik :");
        muzik = inp.nextDouble();

        if ((muzik >= 0) && (muzik <= 100)){
            toplam = toplam + muzik;

        }

        System.out.println(toplam / 5);
        if ((toplam / 5) >= 55) {
            System.out.println("Tebrikler sinifi gectiniz.");

        }else {
            System.out.println("Uzgunuz sinifi gecemediniz.");
        }








    }
}
