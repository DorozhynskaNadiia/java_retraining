package com.company;

public class Main {

    private static void printRowOf(int length, String symbol)
    {
        for (int j = 1; j <= length; j++) {
            System.out.print(symbol + "\t");
            if (j == 1) {
                System.out.print("|\t");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 10;
        for (int i = 1; i <= size; i++) {
            printRowOf(size, "0");
            if (i == 1) {
                printRowOf(size, "-");
            }
        }
    }

}

