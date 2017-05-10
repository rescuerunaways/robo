package services;

import model.Command;
import model.CommandType;
import model.PlaceCommand;
import model.Robot;

import java.util.List;

import static services.MoveService.move;
import static services.RotateService.rotate;
import static services.Validator.validate;

public class ProcessService {

    public static Robot robot;
    private static boolean placed = false;

    public static String process(List<Command> commands) {
        commands.stream().forEachOrdered(command -> action(command));
        return "blah";
    }

    private static void action(Command command) {
        validate(command);
        CommandType type = command.getName();

        switch (type) {
            case PLACE:
                robot = new Robot((PlaceCommand) command);
                placed = true;
                break;
            case RIGHT:
            case LEFT:
                rotate(command.toString());
                break;
            case MOVE:
                move();
                break;
            case REPORT:
                System.out.print(robot.toString());
                break;
        }
    }
}
