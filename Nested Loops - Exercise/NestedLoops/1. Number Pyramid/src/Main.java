import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter a number: ");
        int pyramidNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;

        String result = "";
        for (int i = 1; i <= pyramidNumber; i++) {
            result = "";
            for (int j = 1; j <= i; j++) {
                counter++;
                if (counter > pyramidNumber) {
                    isFound = true;
                    break;
                }
                result += counter + " ";
            }
            System.out.println(result);
            if (isFound) {
                break;
            }
        }
    }
}
