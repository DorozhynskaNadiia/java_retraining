package object_oriented;

import java.util.ArrayList;
import java.util.List;

public class MainRandom {
    public static void main(String[] args) {
        long duration = 10 * (long) 1_000_000_000;
        long endPoint = System.nanoTime() + duration;

        List<MyRandomNumber> myHappyNumbers = new ArrayList<MyRandomNumber>();
        List<MyRandomNumber> myAllNumbers = new ArrayList<MyRandomNumber>();

        do {
            MyRandomNumber number = new MyRandomNumber();
            myAllNumbers.add(number);
        } while (System.nanoTime() < endPoint);

        for(MyRandomNumber currentNumber : myAllNumbers) {
            if (currentNumber.isHappy()) {
                myHappyNumbers.add(currentNumber);
            }
        }
        List<MyRandomNumber> startWithZero = new ArrayList<>();
        for (MyRandomNumber currentNumber : myHappyNumbers) {
            if (currentNumber.getNumber().startsWith("0")) {
                startWithZero.add(currentNumber);
            }
        }

        System.out.format("Happy count: %d\n", myHappyNumbers.size());
        System.out.format("Other count: %d\n", myAllNumbers.size());
        System.out.format("Starts with zero: %d\n", startWithZero.size());

    }
}
