import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double sumOfGrades = 0;
        double allPresentationsSum = 0;
        int allPresentationsCount = 0;

        while (!command.equals("Finish")) {
            sumOfGrades = 0;

            for (int i = 0; i < numOfPeople; i++) {
                double mark = Double.parseDouble(scanner.nextLine());
                sumOfGrades += mark;
            }

            allPresentationsSum += sumOfGrades / numOfPeople;
            allPresentationsCount++;

            System.out.println(command + " - " + String.format("%.2f", (sumOfGrades / numOfPeople)) + ".");
            command = scanner.nextLine();
        }
        System.out.println("Student's final assessment is " + String.format("%.2f", (allPresentationsSum/allPresentationsCount)) + ".");
    }
}