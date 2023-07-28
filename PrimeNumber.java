import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return (false);
        }
        if (num == 2) {
            return (true);
        }
        for (int i = 2; i < num/2+1; i++) {
            if (num % i == 0) {
                return (false);
            }
        }
        return (true);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = scanner.nextInt();

        boolean is_prime = isPrime(num);
        if (is_prime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }

        scanner.close();

    }

}