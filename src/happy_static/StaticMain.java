package happy_static;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;

public class StaticMain {
    public static void main(String[] args) {
        StaticHappyTickets happy = new StaticHappyTickets();

        int ticketSize = 8;

        long duration = 10 * (long) 1_000_000_000;
        long endPoint = System.nanoTime() + duration;
        int countAll = 0;
        ArrayList<String> happyTickets = new ArrayList<>();

        do {
            String random = RandomStringUtils.random(ticketSize, false, true);
            //генеруємо лише квитки які не починаються з 0 (якщо генерує, то згенерувати ще раз)
            if(random.startsWith("0")) {
               continue;
            }
            countAll = countAll + 1;

            if (happy.isHappyTicket(random)) {
                happyTickets.add(random);
            }
        } while (System.nanoTime() < endPoint);
        System.out.println(countAll + " generated tickets");
        System.out.println(happyTickets.size() + " happy tickets");

        ArrayList<String> startWithZero = new ArrayList<>();
        for (String ticket : happyTickets) {
            if (ticket.startsWith("0")) {
                startWithZero.add(ticket);
            }
        }
        System.out.println(startWithZero.size() + " starts with zero");
    }
}
