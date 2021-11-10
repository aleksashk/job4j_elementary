package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[]numbers = new int[5];
        int counter = 0;
        for (int ignored : numbers) {
            numbers[counter] = counter * 2 + 3;
            System.out.println(numbers[counter++]);
        }
    }
}
