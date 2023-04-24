import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int walkings = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int allMinutes = minutes * walkings;
        int allCaloriesBurned = allMinutes * 5;

        boolean isEnough = allCaloriesBurned >= calories / 2;

        String result = isEnough
                ?
                String.format("Yes, the walk for your cat is enough. Burned calories per day: %d.", allCaloriesBurned)
                :
                String.format("No, the walk for your cat is not enough. Burned calories per day: %d.", allCaloriesBurned);

        System.out.println(result);
    }
}
