package com.company;

public class MultiplicationMatrix {

    private static void printCell(int rowIndex, int columnIndex, int width) {
        int cell;
        if (rowIndex == 1) {
            cell = columnIndex;
        } else {
            cell = columnIndex * rowIndex;
        }
        System.out.format("%" + width + "d", cell);
    }

    public static void printMatrix(int row, int column) {
        int columnWidth = getColumnWidth(row, column);
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                printCell(i, j, columnWidth);
                if(j == 1) {
                    System.out.printf("%s", "|");
                }
            }
            System.out.println();

            if(i == 1) {
                for(int k = 0; k < columnWidth * column + 1; k++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }

    private static int getColumnWidth(int rowNum, int columnNum) {
        int maxValueOfMatrix = rowNum * columnNum;
        String maxValueString = Integer.toString(maxValueOfMatrix);
        return maxValueString.length() + 1;
    }
}
