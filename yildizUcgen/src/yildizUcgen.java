import java.util.Scanner;
public class yildizUcgen {
    public static void main(String[] args) {

        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Basamak sayisin, giriniz :");
        n = inp.nextInt();

      for (int i=1;i<=n;i++) {
          for (int k=1;k<=(n-i);k++) {
              System.out.print(" ");
          }
          for (int j=1;j<=(2*i)-1;j++) {
              System.out.print("*");
          }
      System.out.println();
      }
      for (int l=1;l<=n;l++) {
          for (int m=n;m>(n-l);m--) {
              System.out.print(" ");
          }
          for (int p=n+4;p>(2*l)-1;p--) {
              System.out.print("*");
          }
          System.out.println();
      }

    }
}
