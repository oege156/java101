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
                System.out.println("Bolum :" + (n1 / n2));
                if(n2 !=0){
                    System.out.print("İşleminizin Sonucu: "+(n1/n2));
                }else {
                    System.out.print("Bir sayı sıfıra bölünemez");
                }
                break;

            default:
                System.out.println("Hatali giris yaptiniz lütfen tekrar deneyiniz.");
        }
    }
}
