import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        boolean result = false;

        for (int i = 1111; i <= 9999; i++) {
            int copyNumber = i;
            result = false;

            for (int j = 0; j <= 3; j++) {
                if ((copyNumber % 10 == 0) || (N % (copyNumber % 10) != 0)) {
                    result = true;
                    break;
                }
                copyNumber /= 10;
            }

            if (!result) {
                System.out.print(i + " ");
            }
        }
    }
}