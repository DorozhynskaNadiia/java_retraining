package happy_dynamic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DynamicHappyTickets generator = new DynamicHappyTickets();

        long duration = 10 * (long) 1_000_000_000;
        long endPoint = System.nanoTime() + duration;
        int countAll = 0;
        int countHappy = 0;

        System.out.print("Please enter even number from 4 to 20: ");
        Scanner scan = new Scanner(System.in);
        int ticketSize = scan.nextInt();
        if (ticketSize % 2 == 0) {
            do {
                countHappy = countHappy + generator.generateHappyTickets(1, ticketSize);
                countAll = countAll + 1;
            }
            while (System.nanoTime() < endPoint);
            System.out.println(countAll + " are all generated tickets");
            System.out.println(countHappy + " are happy tickets");
        } else {
            System.out.println("You've entered odd number. Please enter even");
        }
    }
}