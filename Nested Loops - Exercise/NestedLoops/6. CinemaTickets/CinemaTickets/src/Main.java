import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int counter = 0;
        double average = 0;
        int totalTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int studentTickets = 0;

        while (!command.equals("Finish")) {
            int spareSpaces = Integer.parseInt(scanner.nextLine());
            String typeOfTicket = "";
            counter = 0;

            while (counter < spareSpaces) {
                typeOfTicket = scanner.nextLine();

                if (typeOfTicket.equals("End")) {
                    break;
                }

                switch (typeOfTicket) {
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                    case "student":
                        studentTickets++;
                        break;
                }

                counter++;
                totalTickets++;
            }
            average = (double)counter / (double)spareSpaces;
            System.out.println(command + " - " + String.format("%.2f", (average)*100) + "% full.");
            command = scanner.nextLine();
        }
        System.out.println("Total tickets: " + totalTickets);
        System.out.println((String.format("%.2f", (double)studentTickets/(double) totalTickets*100) + "% student tickets."));
        System.out.println((String.format("%.2f", (double)standardTickets/(double) totalTickets*100) + "% standard tickets."));
        System.out.println((String.format("%.2f", (double)kidTickets/(double) totalTickets*100) + "% kids tickets."));
    }
}