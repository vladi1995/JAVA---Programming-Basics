import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        int allDogFood = 0;
        int allCatFood = 0;
        double biscuits = 0;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            if (i%3 == 0) {
                biscuits += (catFood + dogFood) * 0.10;
            }

            allDogFood += dogFood;
            allCatFood += catFood;
        }

        System.out.printf("Total eaten biscuits: %dgr.", Math.round(biscuits));
        System.out.println();
        System.out.printf("%.2f%% of the food has been eaten.", ((allDogFood + allCatFood)/food)*100);
        System.out.println();
        System.out.printf("%.2f%% eaten from the dog.",((double)(allDogFood)/(double)(allDogFood + allCatFood))*100);
        System.out.println();
        System.out.printf("%.2f%% eaten from the cat.",((double)(allCatFood)/(double)(allDogFood + allCatFood))*100);
    }
}
