import java.util.Scanner;
public class hesapMakinesiIfElse {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner inp = new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz :");
        n1 = inp.nextInt();

        System.out.println("Ikinci sayiyi giriniz :");
        n2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Seciniz");
        select = inp.nextInt();

        if (select == 1) {
            System.out.println("Toplam :" + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Cikarma :" + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Carpim :" + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println("Bolme :" + (n1 / n2));
            } else {
                System.out.println("Bir sayi 0'a bolunemez.");
            }
        } else {
            System.out.println("Yanlis bir secim yaptiniz lutfen tekrar deneyiniz.");
        }
    }
}
