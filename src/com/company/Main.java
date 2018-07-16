package com.company;

public class Main {

    public static void main(String[] args) {
        int size = 3;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(0 + " ");
            }
            System.out.println();
            if (i == 1) {
                for (int j = 1; j <= size; j++) {
                    System.out.print("- ");
                }
                System.out.println();
            }
        }
    }

}

