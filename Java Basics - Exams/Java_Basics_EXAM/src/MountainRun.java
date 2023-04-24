import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double timeDistance = distance * time + Math.floor(distance / 50) * 30;

        boolean isRecordBeaten = record - timeDistance > 0;

        String result = isRecordBeaten
                ?
                String.format("Yes! The new record is %.2f seconds.", timeDistance)
                :
                String.format("No! He was %.2f seconds slower.", timeDistance - record);

        System.out.printf(result);
    }
}
