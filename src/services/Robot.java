package services;


public class Robot {
    Robot() {
        position = new int[]{0, 0};
        direction = "NORTH";
    }

    Robot(int[] position, String direction) {
        this.position = position;
        this.direction = direction;
    }

    private int[]  position;
    private String direction;

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return position[0] + "," + position[1] + "," + direction;
    }
}
