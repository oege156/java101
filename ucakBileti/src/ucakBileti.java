import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args) {

        int distance, age, travelType;
        double amount;

        Scanner inp = new Scanner(System.in);

        System.out.println("1-One direction\n2-Round trip\nPlease select your travel type :");
        travelType = inp.nextInt();
        System.out.println("Please enter the distance you want to travel :");
        distance = inp.nextInt();
        System.out.println("Please enter your age :");
        age = inp.nextInt();

        amount = distance * 0.10;

        if ((distance > 0) && (age >= 0)) {
            if ((travelType == 1) || (travelType == 2)) {
                if (age < 12) {
                    if (travelType == 1) {
                        System.out.println("Your ticket price :" + amount * 0.5);
                    } else if (travelType == 2) {
                        System.out.println("Your ticket price :" + amount * 0.5 * 0.8);
                    }
                }
                if ((age >= 12) && (age <= 24)) {
                    if (travelType == 1) {
                        System.out.println("Your ticket price :" + amount * 0.9);
                    } else if (travelType == 2) {
                        System.out.println("Your ticket price :" + amount * 0.9 * 0.8);
                    }
                }
                if ((age > 24) && (age <= 65)) {
                    if (travelType == 1) {
                        System.out.println("Your ticket price :" + amount);
                    } else if (travelType == 2) {
                        System.out.println("Your ticket price :" + amount * 0.8);
                    }
                }
                if (age > 65) {
                    if (travelType == 1) {
                        System.out.println("Your ticket price :" + amount * 0.7);
                    } else if (travelType == 2) {
                        System.out.println("Your ticket price :" + amount * 0.7 * 0.8);
                    }
                }
            }  else {
                System.out.println("You entered wrong data please try again.");

            }

        }else{
            System.out.println("You entered wrong data please try again.");
        }
    }
}
