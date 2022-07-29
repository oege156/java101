import java.util.Scanner;

public class atmProjesiSwitch {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.println("User name :");
            userName = inp.nextLine();
            System.out.println("Password :");
            password = inp.nextLine();
            if (userName.equals("ozan") && password.equals("5415")) {
                System.out.println("Welcome Patika Bank");
                do {
                    System.out.println("1-Deposit Money\n2-Withdraw Money\n3-Balance Query\n4-Exit");
                    System.out.println("What do you want to do please enter :");
                    select = inp.nextInt();
                    int price;
                    switch (select) {
                        case 1:
                            System.out.println("Please enter deposit amount :");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Please enter withdraw amount :");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Your account balance :" + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("See you again.");
                break;
            } else {
                right--;
                System.out.println("Wrong Username or password please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank(0850 000 000).");
                } else {
                    System.out.println("You have " + right + " left");
                }
            }
        }
    }
}
