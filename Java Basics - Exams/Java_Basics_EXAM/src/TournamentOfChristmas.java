import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double allMoney = 0;
        int allWon = 0;
        int allLost = 0;

        for (int i = 0; i < days; i++) {
            String command = scanner.nextLine();
            String winOrLose = scanner.nextLine();

            double raisedMoney = 0;
            int wonGames = 0;
            int lostGames = 0;

            while (!command.equals("Finish")) {
                if (winOrLose.equals("win")) {
                    raisedMoney += 20;
                    wonGames++;
                } else {
                    lostGames++;
                }
                command = scanner.nextLine();
                if (!command.equals("Finish")) {
                    winOrLose = scanner.nextLine();
                }
            }

            if (wonGames > lostGames) {
                raisedMoney *= 1.10;
            }

            allMoney += raisedMoney;
            allWon += wonGames;
            allLost += lostGames;
        }

        if (allWon > allLost) {
            allMoney *= 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", allMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", allMoney);
        }
    }
}
