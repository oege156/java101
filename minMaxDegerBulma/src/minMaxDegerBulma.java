import java.util.Scanner;
public class minMaxDegerBulma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n,number;
        System.out.println("Please enter how many numbers you want to enter :");
        n = inp.nextInt();
        int largestNumber =0 ,smallestNumber=0;
        for (int i=1;i<=n;i++) {
            System.out.println("Please enter "+i+". number :");
            number = inp.nextInt();
            if (i==1) {
                largestNumber = number;
                smallestNumber = number;
            }else {
                if (number > largestNumber) {
                    largestNumber = number;
                } else if (number < smallestNumber) {
                    smallestNumber=number;
                }
            }
        }
        System.out.println("The largest number is :"+largestNumber);
        System.out.println("The smallest number is :"+smallestNumber);

    }
}
