package happy_dynamic;

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

    private static String generateRandom (int ticketSize) {
        String result = RandomStringUtils.random(ticketSize, false, true);
        return result;
    }

    public int generateHappyTickets(int ticketsCount, int ticketSize) {
        int happyTicketsCount = 0;

        for (int i = 0; i < ticketsCount; i++) {
            String result = generateRandom(ticketSize);
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


}