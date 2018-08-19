package oop;

import org.apache.commons.lang3.RandomStringUtils;

public class ApacheGenerator implements Generator{
    public String generate() {
        return RandomStringUtils.random(6, false, true);
    }
}
