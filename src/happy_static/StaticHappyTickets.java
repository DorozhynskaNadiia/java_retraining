package happy_static;

public class StaticHappyTickets {
    public boolean isHappyTicket(String str) {
        byte[] n = new byte[str.length()];
        for (int j = 0; j < n.length; j++) {
            n[j] = (byte) str.charAt(j);
        }
        return isHappy(n);
    }

    private static boolean isHappy(byte[] n) {
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
}
