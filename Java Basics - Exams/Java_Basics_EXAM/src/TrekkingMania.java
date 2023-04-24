import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kili = 0;
        int k2 = 0;
        int everest = 0;
        int allPeople = 0;

        for (int i = 0; i < groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            if (people <= 5) {
                musala+=people;
            } else if (people >= 6 && people <= 12) {
                monblan+=people;
            } else if (people >= 13 && people <= 25) {
                kili+=people;
            } else if (people >= 26 && people <= 40) {
                k2+=people;
            } else if (people >= 41) {
                everest+=people;
            }

            allPeople+=people;
        }

        System.out.printf("%.2f%%", ((double)musala/(double)allPeople)*100);
        System.out.println();
        System.out.printf("%.2f%%", ((double)monblan/(double)allPeople)*100);
        System.out.println();
        System.out.printf("%.2f%%", ((double)kili/(double)allPeople)*100);
        System.out.println();
        System.out.printf("%.2f%%", ((double)k2/(double)allPeople)*100);
        System.out.println();
        System.out.printf("%.2f%%", ((double)everest/(double)allPeople)*100);
    }
}
