import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args) {
        double kdvsiz , kdvli , kdvtutari;

        Scanner inp = new Scanner(System.in);

        System.out.println("Tutar giriniz = ");
        kdvsiz = inp.nextDouble();

        kdvtutari = ((kdvsiz / 100) * 18);

        kdvli = kdvsiz + kdvtutari;



        System.out.println("Kdv'siz tutar = "+kdvsiz);
        System.out.println("Kdv tutarı = "+kdvtutari);
        System.out.println("Kdv'li tutar = "+kdvli);
    }
}
