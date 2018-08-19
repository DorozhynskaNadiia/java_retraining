package oop;

import java.util.concurrent.ThreadLocalRandom;

public class JavaGenerator implements Generator {
    public String generate() {
        int number = ThreadLocalRandom.current().nextInt(100_000,999_999);
        String random = String.valueOf(number);
        return random;
    }
}
