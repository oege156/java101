import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {

        int year ;
        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter a year :");
        year = inp.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(+year+"is a leap year !");
            }else {
                System.out.println(+year+"is not a leap year !");
            }
        } else if (year % 4 == 0) {
            System.out.println(+year+"is a leap year !");
        }else {
            System.out.println(+year+" is not a leap year !");
        }

    }
}
