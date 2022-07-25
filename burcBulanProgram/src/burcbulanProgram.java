import java.util.Scanner;
public class burcbulanProgram {
    public static void main(String[] args) {

        int month , day ;

        Scanner inp = new Scanner(System.in);

        System.out.println("1-January\n2-February\n3-March\n4-April\n5-May\n6-June\n7-July\n8-August\n9-September\n10-October\n11-November\n12-December");
        System.out.println("Please enter month of your born :");
        month = inp.nextInt();
        System.out.println("Please enter your birthday:");
        day = inp.nextInt();

        if (month == 1) {
            if (day < 22) {
                System.out.println("Your zodiac sign is Capricorn.");
            } else  {
                System.out.println("Your zodiac sign is Aquarius. ");
            }
        } else if (month == 2) {
            if (day < 20) {
                System.out.println("Your zodiac sign is Aquarius.");
            } else {
                System.out.println("your zodiac sign is Pisces.");
            }
        } else if (month == 3) {
            if (day < 21) {
                System.out.println("Your zodiac sign is Pisces.");
            } else {
                System.out.println("Your zodiac sign is Aries.");
            }
        } else if (month == 4) {
            if (day < 21) {
                System.out.println("Your zodiac sign is Aries.");
            } else {
                System.out.println("Your zodiac sign is Taurus.");
            }
        } else if (month == 5) {
            if (day < 22) {
                System.out.println("Your zodiac sign is Taurus.");
            } else {
                System.out.println("Your zodiac sign is Gemini.");
            }
        } else if (month == 6) {
            if (day < 23) {
                System.out.println("Your zodiac sign is Gemini.");
            } else {
                System.out.println("Your zodiac sign is Cancer.");
            }
        } else if (month == 7) {
            if (day < 23) {
                System.out.println("Your zodiac sign is Cancer.");
            } else {
                System.out.println("Your zodiac sign is Leo.");
            }
        } else if (month == 8) {
            if (day < 23) {
                System.out.println("Your zodiac sign is Leo.");
            } else {
                System.out.println("Your zodiac sign is Virgo.");
            }
        } else if (month == 9) {
            if (day < 23) {
                System.out.println("Your zodiac sign is Virgo.");
            } else {
                System.out.println("Your zodiac sign is Libra.");
            }
        } else if (month == 10) {
            if (day < 23) {
                System.out.println("Your zodiac sign is Libra.");
            } else {
                System.out.println("Your zodiac sign is Scorpio.");
            }
        } else if (month == 11) {
            if (day < 22) {
                System.out.println("Your zodiac sign is Scorpio.");
            } else {
                System.out.println("Your zodiac sign is Sagittarius.");
            }
        } else if (month == 12) {
            if (day < 22) {
                System.out.println("Your zodiac sign is Sagittarius.");
            } else {
                System.out.println("Your zodiac sign is Capricorn.");
            }
        }
    }
}
