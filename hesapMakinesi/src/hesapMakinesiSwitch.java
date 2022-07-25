import java.util.Scanner;
public class hesapMakinesiSwitch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n1 , n2 , select ;

        System.out.println("Ilk sayiyi giriniz :");
        n1 = inp.nextInt();

        System.out.println("Ikinci sayiyi giriniz :");
        n2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Lutfen birini seciniz.");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam :" + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma :" + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpım :" + (n1 * n2));
                break;
            case 4:
                switch (n2){
                    case 0 :
                        System.out.println("Bir sayi sifira bolunemez.");
                        break;
                    default:
                        System.out.println("Bolum :"+ (n1 / n2));
                        break;
                }
                break;

            default:
                System.out.println("Hatali giris yaptiniz lütfen tekrar deneyiniz.");
        }
    }
}
