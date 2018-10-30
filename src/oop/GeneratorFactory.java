package oop;

public class GeneratorFactory {
    public static Generator get(String g) {
        if (g.equals("java")) {
            return new JavaGenerator();
        }
        if (g.equals("apache")) {
            return new ApacheGenerator();
        }
        throw new RuntimeException("Generator is not supported " + g);
    }
}
