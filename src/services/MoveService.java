package services;

import model.Robot;

import static services.ProcessService.robot;

public class MoveService {

    public static Robot move() {
        int[] direction = robot.getDirection();
        int[] position = robot.getPosition();
        robot.setPosition(move(direction, position));
        return robot;
    }

    private static int[] move(int[] direction, int[] position) {
        int[] newPosition = {direction[0] + position[0], direction[1] + position[1]};
        return newPosition;
    }
}
