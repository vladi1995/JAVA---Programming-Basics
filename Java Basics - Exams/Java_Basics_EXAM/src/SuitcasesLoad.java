import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        double allLuggage = 0;
        int index = 1;
        boolean isNotFull = false;
        String command = scanner.nextLine();

        while(!command.equals("End")) {
            double convertedCommand = Double.parseDouble(command);

            if (index % 3 == 0) {
                convertedCommand *= 1.10;
            }

            allLuggage += convertedCommand;

            if (allLuggage > capacity) {
                isNotFull = true;
                break;
            }

            command = scanner.nextLine();
            index++;
        }

        String result = isNotFull
                ?
                "No more space!"
                :
                "Congratulations! All suitcases are loaded!";

        System.out.println(result);
        System.out.printf("Statistic: %d suitcases loaded.", index - 1);
    }
}
