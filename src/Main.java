import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.*;

public class Main {

    public static int[][]              matrix     = new int[5][5];
    public static Map<String, int[]>   vecAliaces = new HashMap<>(5);
    public static Map<String, Integer> dirAliaces = new HashMap<>(5);


    public static void main(String[] args) {
        vectors();
        rotations();

        int[] northToEast = rotate(new int[]{0, 1}, 90);

        System.out.println(northToEast[0]);
        System.out.println(northToEast[1]);
    }

    public static void vectors() {
        vecAliaces.put("NORTH", new int[]{0, 1});
        vecAliaces.put("EAST", new int[]{-1, 0});
        vecAliaces.put("SOUTH", new int[]{1, 0});
        vecAliaces.put("WEST", new int[]{0, -1});
    }

    public static void rotations() {
        dirAliaces.put("LEFT", -90);
        dirAliaces.put("RIGHT", 90);
    }

    public static int[] rotate(int[] vector, int degrees) {
        int x = vector[1] * sinus(degrees);
        int y = vector[0] * cosinus(degrees);
        return new int[]{x, y};
    }

    private static int cosinus(double degrees) {
        return (int) round(cos(toRadians(degrees)));
    }

    private static int sinus(double degrees) {
        return (int) round(sin(toRadians(degrees)));
    }

}

