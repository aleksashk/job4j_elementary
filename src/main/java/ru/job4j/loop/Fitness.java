package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        if (ivan > nik) {
            return 0;
        }
        while (true) {
            ++month;
            ivan *= 3;
            nik *= 2;
            if (ivan >= nik) {
                break;
            }
        }
        return month;
    }
}
