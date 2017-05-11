package services.actions;

import static services.actions.ProcessService.robot;

public class MoveService {

    public static void move() {
        int[] direction = robot.getDirection();
        int[] position = robot.getPosition();
        robot.setPosition(move(direction, position));
    }

    private static int[] move(int[] direction, int[] position) {
        return new int[]{direction[0] + position[0], direction[1] + position[1]};
    }
}
