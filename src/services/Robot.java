package services;


import static store.KeyValue.vecAliaces;

public class Robot {

    Robot() {
        position = new int[]{0, 0};
        direction = vecAliaces.get("NORTH");
    }

    Robot(int[] position, int[] direction) {
        this.position = position;
        this.direction = direction;
    }

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
