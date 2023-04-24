import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent * 0.20;
        double beverages = cake * 0.55;
        double animator = rent * 1/3;

        System.out.println(rent + cake + beverages + animator);
    }
}
