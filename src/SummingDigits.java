import java.util.Scanner;

public class SummingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to sum its digits: ");
        long n = scanner.nextLong();
        System.out.println("The sum of the digits in " + n + " is: " + sumDigits(n));
        scanner.close();
    }

    public static int sumDigits(long n) {
        n = Math.abs(n); // 
        int sum = 0;
        while (n != 0) {
            sum += n % 10; 
            n /= 10; 
        }
        return sum;
    }
}