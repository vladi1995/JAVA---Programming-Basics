import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int food = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int allFood = 0;

        while(!command.equals("Adopted")) {
            int convertedCommand = Integer.parseInt(command);
            allFood += convertedCommand;
            command = scanner.nextLine();
        }

        boolean isNotEnough = allFood - food*1000 > 0;

        if (isNotEnough) {
            System.out.printf("Food is not enough. You need %d grams more.", allFood - food*1000);
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.", food*1000 - allFood);
        }
    }
}
