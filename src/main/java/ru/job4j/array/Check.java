package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean item = data[0];
        for (boolean element : data) {
            if (item != element) {
                result = !result;
            }
        }
        return result;
    }
}
