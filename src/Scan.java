import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
      int num1, num2, sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();

        sc.close();
        sum = num1 + num2;
        System.out.println("sum of these numbers is: " + sum);
    }
}
