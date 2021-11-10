package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[]names = new String[4];
        names[0] = "David";
        names[1] = "Mark";
        names[2] = "Grigory";
        names[3] = "Sebastian";
        for (String s : names) {
            System.out.println(s);
        }
    }
}