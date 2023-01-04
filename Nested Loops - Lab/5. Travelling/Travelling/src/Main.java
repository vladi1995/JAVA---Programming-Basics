import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        double budget = 0;

        while (!destination.equals("End")) {
            double neededMoney = Double.parseDouble(scanner.nextLine());
            budget = 0;
            while (neededMoney > budget) {
                budget += Double.parseDouble(scanner.nextLine());
            }
            System.out.println("Going to " + destination + "!");
            destination = scanner.nextLine();
        }
    }
}