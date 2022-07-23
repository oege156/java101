import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        int mat , fizik , kimya , turkce , tarih , muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println ("Matematik notunu giriniz = ");
        mat = inp.nextInt();

        System.out.println("Fizik notunu giriniz =");
        fizik = inp.nextInt();

        System.out.println("Kimya notunu giriniz = ");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunu giriniz = ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunu giriniz = ");
        tarih = inp.nextInt();

        System.out.println("Müzik notunu giriniz =");
        muzik = inp.nextInt();

        double toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println(sonuc);

    }
}

