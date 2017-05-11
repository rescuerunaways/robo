package model;


import static store.KeyValue.vecAliaces;

public class Robot {
    public Robot() {
        position = new int[]{0, 0};
        direction = vecAliaces.get("NORTH");
    }

    public static boolean placed = false;

    private int[] position;
    private int[] direction;

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public int[] getDirection() {
        return direction;
    }

    public void setDirection(int[] direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return position[0] + "," + position[1] + "," + vecAliaces.values();
    }
}
