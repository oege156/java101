import java.util.Scanner;
public class daireAlanCevre {
    public static void main(String[] args) {


        double a , r , pi = 3.14 , alan , cevre , dilimAlan ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin yaricapini giriniz :");
        r = inp.nextDouble();

        System.out.println("Merkez acisinin olcusunu giriniz :");
        a = inp.nextDouble();


        alan = pi * r * r;

        cevre = 2 * pi * r;

        dilimAlan = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin alani : "+alan);
        System.out.println("Dairenin cevresi : "+cevre);
        System.out.println("Daire diliminin alani : "+dilimAlan);


    }
}
