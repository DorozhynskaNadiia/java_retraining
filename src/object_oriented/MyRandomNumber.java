package object_oriented;

import oop.Generator;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;

public class MyRandomNumber {
    private String number;

    public MyRandomNumber() {
        this.number = RandomStringUtils.random(6, false, true);
    }

    public MyRandomNumber(Generator g) {
        this.number = g.generate();
    }

    public boolean isHappy() {
        final int mid = number.length() / 2;
        String[] parts = {number.substring(0, mid), number.substring(mid)};

        String[] left = parts[0].split("");
        String[] right = parts[1].split("");

        int sumLeft = Arrays.stream(left).mapToInt(s -> Integer.parseInt(s)).sum();
        int sumRight = Arrays.stream(right).mapToInt(s -> Integer.parseInt(s)).sum();

        return sumLeft == sumRight;
    }

    public String getNumber() {
        return this.number;
    }
}
