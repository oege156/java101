import java.util.Scanner;
public class cinZodyagi {
    public static void main(String[] args) {

        int yearOfBirth , zodiac  ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter your year of birth :");
        yearOfBirth = inp.nextInt();

        zodiac = yearOfBirth % 12;

        switch (zodiac) {

               case 0 :
                   System.out.println("Your zodiac sign is Monkey.");
                   break;
               case 1 :
                   System.out.println("Your zodiac sign is Rooster.");
                   break;
               case 2 :
                   System.out.println("Your zodiac sign is Dog.");
                   break;
               case 3 :
                   System.out.println("Your zodiac sign is Pig.");
                   break;
               case 4 :
                   System.out.println("Your zodiac sign is Mouse.");
                   break;
               case 5 :
                   System.out.println("Your zodiac sign is Ox.");
                   break;
               case 6 :
                   System.out.println("Your zodiac sign is Tiger.");
                   break;
               case 7 :
                   System.out.println("Your zodiac sign is Rabbit.");
                   break;
               case 8 :
                   System.out.println("Your zodiac sign is Dragon.");
                   break;
               case 9 :
                   System.out.println("Your zodiac sign is Snake.");
                   break;
               case 10 :
                   System.out.println("Your zodiac sign is Horse.");
                   break;
               case 11 :
                   System.out.println("Your zodiac sign is Sheep.");
            default :
                System.out.println("You entered incorrectly, please enter a valid entry.");
        }
    }
}
