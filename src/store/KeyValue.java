package store;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KeyValue {
    public static final int[] matrix = new int[]{4, 4};
    public static final Map<String, int[]>   vecAliaces;
    public static final Map<String, Integer> dirAliaces;

    static {
        vecAliaces = new HashMap<>(5);
        vecAliaces.put("NORTH", new int[]{0, 1});
        vecAliaces.put("WEST", new int[]{-1, 0});
        vecAliaces.put("EAST", new int[]{1, 0});
        vecAliaces.put("SOUTH", new int[]{0, -1});

        dirAliaces = new HashMap<>(5);
        dirAliaces.put("LEFT", -90);
        dirAliaces.put("RIGHT", 90);
    }

    public static Object dirToString(int[] direction) {
        for (Map.Entry<?, ?> entry : vecAliaces.entrySet()) {
            if (Arrays.equals((int[]) entry.getValue(), (direction))) {
                return entry.getKey();
            }
        }
        return "";
    }
}
