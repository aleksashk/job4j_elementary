package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] iAr : array) {
            for (int j : iAr) {
                rsl += j;
            }
        }
        return rsl;
    }
}
