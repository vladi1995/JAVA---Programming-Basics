import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double price = 0;

        switch (sport) {
            case "Gym":
                price = determinePrice(sex, 42, 35);
                break;
            case "Boxing":
                price = determinePrice(sex, 41, 37);
                break;
            case "Yoga":
                price = determinePrice(sex, 45, 42);
                break;
            case "Zumba":
                price = determinePrice(sex, 34, 31);
                break;
            case "Dances":
                price = determinePrice(sex, 51, 53);
                break;
            case "Pilates":
                price = determinePrice(sex, 39, 37);
                break;
        }

        price = (age <= 19) ? (price*=0.80) : price;
        boolean isEnough = budget >= price;

        String result = isEnough
                ?
                String.format("You purchased a 1 month pass for %s.", sport)
                :
                String.format("You don't have enough money! You need $%.2f more.", (price - budget));

        System.out.println(result);
    }

    public static int determinePrice(String sex, int male, int female) {
        int price = sex.equals("m") ? male : female;
        return price;
    }
}

