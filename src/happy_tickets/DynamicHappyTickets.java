package happy_tickets; //рефактор по окремих невеликих методах; винести в окремий клас роботу з числами, створити об'єкт цього класу і викликати методи

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;

public class DynamicHappyTickets {

    private static byte[] convertToByteArray(String str) {
        byte[] n = new byte[str.length()];
        for (int j = 0; j < n.length; j++) {
            n[j] = (byte) str.charAt(j);
        }
        return n;
    }

    private static boolean isHappyTicket(byte[] n) {
        int firstHalf = 0;
        int secondHalf = 0;
        for (int k = 0; k < n.length; k++) {
            if (k < n.length / 2) {
                firstHalf = firstHalf + n[k];
            } else {
                secondHalf = secondHalf + n[k];
            }
        }
        return firstHalf == secondHalf;
    }

    private static int generateHappyTickets(int ticketsCount, int ticketSize) {
        int happyTicketsCount = 0;

        for (int i = 0; i < ticketsCount; i++) {
            String result = RandomStringUtils.random(ticketSize, false, true);

            byte[] n = convertToByteArray(result);

            if (isHappyTicket(n)) {
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
                countHappy = countHappy + generateHappyTickets(1, ticketSize); //список хепі тікетів занести в арей ліст і вкінці вивести всі які починаються на 0
                ArrayList <String> happyTikets  = new ArrayList<>();

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