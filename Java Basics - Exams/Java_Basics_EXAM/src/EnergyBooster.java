import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String size = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (text) {
            case "Watermelon":
                price = determinePrice(size, 56, 28.70);
                break;
            case "Mango":
                price = determinePrice(size, 36.66, 19.60);
                break;
            case "Pineapple":
                price = determinePrice(size, 42.10, 24.80);
                break;
            case "Raspberry":
                price = determinePrice(size, 20, 15.20);
                break;
        }

        price *= count;
        price = (price >= 400 && price <= 1000) ? (price*=0.85) : (price > 1000) ? (price*=0.5) : price;

        System.out.printf("%.2f lv.", price);
    }

    public static double determinePrice(String size, double small, double big) {
        double price = size.equals("big") ? big * 5 : small * 2;
        return price;
    }
}
