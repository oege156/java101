import java.util.Scanner;
public class vucutkitleIndeksi {
    public static void main(String[] args) {

        double boy , kg , index ;
        Scanner inp = new Scanner(System.in);

        System.out.println("Boyunuzu metre cinsinden giriniz:");
        boy = inp.nextDouble();

        System.out.println("Lütfen kilonuzu kg cinsinden giriniz");
        kg = inp.nextDouble();

        index = kg / (boy * boy);

        System.out.println("Vucut kitle indeksiniz : "+index);




    }
}
