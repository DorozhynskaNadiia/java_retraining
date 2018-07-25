package happy_tickets;

import org.apache.commons.lang3.RandomStringUtils;

public class HappyTickets {

    private static int generateHappyTickets(int ticketsCount) {
        int happyTicketsCount = 0;

        for (int i = 0; i < ticketsCount; i++) {
            String result = RandomStringUtils.random(8, false, true);

            byte n1 = (byte) result.charAt(0);
            byte n2 = (byte) result.charAt(1);
            byte n3 = (byte) result.charAt(2);
            byte n4 = (byte) result.charAt(3);
            byte n5 = (byte) result.charAt(4);
            byte n6 = (byte) result.charAt(5);
            byte n7 = (byte) result.charAt(6);
            byte n8 = (byte) result.charAt(7);


            if (n1 + n2 + n3 + n4 == n5 + n6 + n7 + n8) {
                happyTicketsCount = happyTicketsCount + 1;
                System.out.println(result + ": is happy");
            } else {
                System.out.println(result + ": is not happy");
            }
        }
        return happyTicketsCount;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        int duration = 10;
        int countAll = 0;
        int countHappy = 0;
        do {
            countHappy = countHappy + generateHappyTickets(1000);
            countAll = countAll + 1000;
        } while (System.nanoTime() - start < (long) 1000000000 * duration);
        System.out.println(countAll + " are all generated tickets");
        System.out.println(countHappy + " are happy tickets");
    }
}