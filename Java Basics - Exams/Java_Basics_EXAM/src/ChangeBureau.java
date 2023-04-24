import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chinese = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double result = (bitcoin * 1168 * 1 / 1.95 + chinese * 0.15 * 1.76/1.95)*(1-commission/100);
        System.out.printf("%.2f", result);
    }
}
