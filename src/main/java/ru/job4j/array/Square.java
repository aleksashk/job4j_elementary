package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] resArray = new int[bound];
        for (int i = 0; i < bound; i++) {
            resArray[i] = i * i;
        }
        return resArray;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
