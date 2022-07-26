import java.util.Scanner;
public class usAlma {
    public static void main(String[] args) {

        int n,k,total=1,i;

        Scanner inp = new Scanner(System.in);

        System.out.println("Ussu alinacak sayiyi giriniz :");
        n = inp.nextInt();
        System.out.println("Us olacak sayiyi giriniz :");
        k = inp.nextInt();

        for (i=1;i<=k;i++) {
            total *= n;
        }
        System.out.println("Cevap :"+total);
    }
}
