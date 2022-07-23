import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double armut , elma  , domates   , muz  , patlican , toplam ;

        System.out.println("Lutfen aldiginiz meyve ve sebzelerin kilogram bilgisini giriniz");

        System.out.println("Armut :");
        armut = inp.nextDouble();

        System.out.println("Elma :");
        elma = inp.nextDouble();

        System.out.println("Domates :");
        domates = inp.nextDouble();

        System.out.println("Muz :");
        muz = inp.nextDouble();

        System.out.println("Patlican :");
        patlican = inp.nextDouble();

        armut = armut * 2.14;
        elma = elma * 3.67;
        domates = domates * 1.11;
        muz = muz * 0.95;
        patlican = patlican * 5.00;

        toplam = armut + elma + domates + muz + patlican ;

        System.out.println("Toplam tutar : "+toplam);

    }
}
