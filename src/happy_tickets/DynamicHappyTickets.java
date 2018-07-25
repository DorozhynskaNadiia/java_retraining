package happy_tickets;

import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;

public class DynamicHappyTickets {

    private static int generateHappyTickets(int ticketsCount, int ticketSize) {
        int happyTicketsCount = 0;

        for (int i = 0; i < ticketsCount; i++) {
            String result = RandomStringUtils.random(ticketSize, false, true);

            byte[] n = new byte[ticketSize];
            for (int j = 0; j < n.length; j++) {
                n[j] = (byte) result.charAt(j);
            }

            int firstHalf = 0;
            int secondHalf = 0;
            for (int k = 0; k < n.length; k++) {
                if (k < ticketSize / 2) {
                    firstHalf = firstHalf + n[k];
                } else {
                    secondHalf = secondHalf + n[k];
                }
            }
            if (firstHalf == secondHalf) {
                happyTicketsCount = happyTicketsCount + 1;
                System.out.println(result + ": is happy");
            } else {
                System.out.println(result + ": is not happy");
            }
        }
        return happyTicketsCount;
    }

    public static void main(String[] args) {
        long duration = 10 * (long)1_000_000_000;
        long endPoint = System.nanoTime() + duration;
        int countAll = 0;
        int countHappy = 0;

        System.out.print("Please enter even number from 4 to 20: ");
        Scanner scan = new Scanner(System.in);
        int ticketSize = scan.nextInt();
        if(ticketSize % 2 == 0) {
            do {
                countHappy = countHappy + generateHappyTickets(1, ticketSize); //список хепі тікетів занести в арей ліст і вкінці вивести всі які починаються на 0 (for-stream)
                countAll = countAll + 1;
            }
            while (System.nanoTime() < endPoint);
//          while (System.nanoTime() - start < (long) 1_000_000_000 * duration);
            System.out.println(countAll + " are all generated tickets");
            System.out.println(countHappy + " are happy tickets");
        } else {
            System.out.println("You've entered odd number. Please enter even");
        }
    }
}