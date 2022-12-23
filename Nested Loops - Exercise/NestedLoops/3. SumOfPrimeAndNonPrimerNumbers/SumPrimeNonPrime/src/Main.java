import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while(!input.equals("stop")) {
            int nextNumber = Integer.parseInt(input);

            if (nextNumber < 0) {
                System.out.println("Number is negative.");
            } else {
                if (isPrime(nextNumber)) {
                    sumPrime += nextNumber;
                } else {
                    sumNonPrime += nextNumber;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNonPrime);
    }

    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0 && num != 2) {
                return false;
            }
        }
        return true;
    }
}