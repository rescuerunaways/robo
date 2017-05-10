package model;

public class PlaceCommand extends Command {
    private int[] position;
    private int[] direction;

    public PlaceCommand(int [] position, int []direction) {
        super(CommandType.PLACE);
        this.position = position;
        this.direction = direction;
    }
    public int[] getPostion() {
        return position;
    }

    public int[] getDirection() {
        return direction;
    }

}

