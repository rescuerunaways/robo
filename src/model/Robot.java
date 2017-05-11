package model;


import static store.KeyValue.dirToString;
import static store.KeyValue.vecAliaces;

public class Robot {
    private static Robot robot = null;

    private Robot() {
        position = new int[]{0, 0};
        direction = vecAliaces.get("NORTH");
    }

    public static Robot getRobot() {
        if (robot == null) {
            robot = new Robot();
        }
        return robot;
    }

    private boolean placed = false;

    private int[] position;
    private int[] direction;

    public boolean isPlaced() {
        return placed;
    }

    public void setPlaced(boolean placed) {
        this.placed = placed;
    }

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
        return position[0] + "," + position[1] + "," + dirToString(direction);
    }


}
