package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                appendingData(result, symbol, counter);
                counter = 1;
            }
            symbol = input.charAt(i);
            if (i == input.length() - 1) {
                appendingData(result, symbol, counter);
            }
        }
        return result.toString();
    }

    private static void appendingData(StringBuilder result, char symbol, int counter) {
        result.append(symbol);
        if (counter > 1) {
            result.append(counter);
        }
    }
}
