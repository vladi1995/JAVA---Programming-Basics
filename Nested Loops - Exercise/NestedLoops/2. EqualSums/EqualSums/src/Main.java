import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            sumEven = 0;
            sumOdd = 0;
            for (int j = 0; j < 6; j++) {
                if (j % 2 == 0) {
                    sumEven += (Character.getNumericValue((String.valueOf(i).charAt(j))));
                } else {
                    sumOdd += (Character.getNumericValue((String.valueOf(i).charAt(j))));
                }
            }
            if(sumEven == sumOdd) {
                System.out.print(i + " ");
            }
        }
    }
}