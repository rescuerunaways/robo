package services;

import model.Robot;

import static java.lang.Math.*;
import static services.ProcessService.robot;
import static store.KeyValue.dirAliaces;

/**
 * TODO: tatianaermolaeva, добавь описание класса
 */
public class RotateService {

    public static Robot rotate(String degrees) {
        int[] newDirection = rotate(robot.getDirection(), dirAliaces.get(degrees));
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
