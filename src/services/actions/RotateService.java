package services.actions;

import model.ICommand;
import model.Robot;

import static java.lang.Math.*;
import static services.actions.ProcessService.robot;
import static store.KeyValue.dirAliaces;

public class RotateService {

    public static Robot rotate(ICommand command) {
        int[] newDirection = rotate(robot.getDirection(), dirAliaces.get(command.toString()));
        robot.setDirection(newDirection);
        return robot;
    }

    private static int[] rotate(int[] vector, int degrees) {
        int x = vector[1] * sine(degrees);
        int y = vector[0] * cosine(degrees);
        return new int[]{x, y};
    }

    private static int cosine(double degrees) {
        return (int) round(cos(toRadians(degrees)));
    }

    private static int sine(double degrees) {
        return (int) round(sin(toRadians(degrees)));
    }
}
