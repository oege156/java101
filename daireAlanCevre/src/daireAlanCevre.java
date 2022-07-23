import java.util.Scanner;
public class daireAlanCevre {
    public static void main(String[] args) {


        double r , pi = 3.14 , alan , cevre ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin yaricapini giriniz :");
        r = inp.nextDouble();

        alan = pi * r * r;

        cevre = 2 * pi * r;

        System.out.println("Dairenin alani : "+alan);
        System.out.println("Dairenin cevresi : "+cevre);

    }
}
