import java.util.Scanner;

public class taksiMeter {
    public static void main(String[] args) {

        int km ;
        double perKm = 2.20 , price , priceLast  ;
        boolean priceTop ;


        Scanner inp = new Scanner(System.in);

       System.out.println("Mesafeyi KM cinsinden giriniz :");
       km = inp.nextInt();

        price = ((km * perKm) + 10);
        priceTop = price < 20;
        priceLast = priceTop ? 20 : price ;

       System.out.println("Odenecek tutar :" +priceLast);




    }
}
