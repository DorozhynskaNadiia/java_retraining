package com.company;

public class Main {

    private static void printCell(int rowIndex, int columnIndex) {
        int cell;
        if (rowIndex == 1) {
            cell = columnIndex;
        } else {
            cell = columnIndex * rowIndex;
        }
        System.out.print(cell + "\t");
    }

    private static void printMatrix(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                printCell(i, j);
                if(j == 1) {
                    System.out.print("|\t");
                }
            }
            System.out.println();

            if(i == 1) {
                for(int d = 1; d <=size + 1; d++) {
                    System.out.print("-\t");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printMatrix(10);
    }

}

