import java.util.Scanner;
public class sicakligaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        int heat ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the air temperature :");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("You can go skiing.");
        } else if (heat >= 5 && heat <= 15) {

            System.out.println("you can go to the cinema.");
        } else if (heat >= 15 && heat <=25) {
            System.out.println("You can go on a picnic.");
        } else if (heat > 25) {
            System.out.println("You can go swimming.");

        }
    }

}
