import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginningOfInterval = Integer.parseInt(scanner.nextLine());
        int endOfInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;
        int firstNum = 0;
        int secondNum = 0;

        for (int i = beginningOfInterval; i <= endOfInterval; i++) {
            for (int j = beginningOfInterval; j <= endOfInterval; j++) {
                counter++;
                if (i + j == magicNumber) {
                    isFound = true;
                    firstNum = i;
                    secondNum = j;
                    break;
                }
            }

            if (isFound == true) {
                break;
            }
        }

        if (isFound) {
            System.out.println("Combination N:" + counter + " (" + firstNum + " + " + secondNum + " = " + magicNumber + ")");
        } else {
            System.out.println(counter + " combinations - neither equals " + magicNumber);
        }
    }
}