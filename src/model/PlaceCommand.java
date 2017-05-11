package model;

public class PlaceCommand implements ICommand {
    private int[] position;
    private int[] direction;

    public PlaceCommand(int [] position, int []direction) {
        this.position = position;
        this.direction = direction;
    }
    public int[] getPosition() {
        return position;
    }

    public int[] getDirection() {
        return direction;
    }

    public CommandType getType() {
        return CommandType.PLACE;
    }
}

