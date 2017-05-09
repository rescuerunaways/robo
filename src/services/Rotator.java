package services;

import static java.lang.Math.*;

public class Rotator {
    public static int[] rotate(int[] vector, int degrees) {
        int x = vector[1] * sine(degrees);
        int y = vector[0] * cosine(degrees);
        return new int[]{x, y};
    }

    private static int cosine(double degrees) {
        return (int) round(cos(toRadians(degrees)));
    }

    private static int sine(double degrees) {
        return (int) round(sin(toRadians(degrees)));
    }
}
