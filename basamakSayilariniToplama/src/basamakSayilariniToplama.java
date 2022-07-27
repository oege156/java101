import java.util.Scanner;
public class basamakSayilariniToplama {
    public static void main(String[] args) {

        int a,b=0,c=0;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz :");
        a = inp.nextInt();

        while (a!=0) {
            b = a%10;
            a/=10;
            c+=b;
        }
        System.out.println("Toplam :"+c);
    }
}
