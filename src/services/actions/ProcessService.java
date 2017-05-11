package services.actions;

import model.ICommand;
import model.PlaceCommand;
import model.Robot;

import java.util.List;

import static model.Robot.getRobot;
import static services.actions.MoveService.move;
import static services.actions.PlaceService.place;
import static services.actions.RotateService.rotate;
import static services.actions.Validator.isLegal;

public class ProcessService {

    public static Robot robot = getRobot();

    public static void process(List<ICommand> commands) {
        commands.stream().forEachOrdered(ProcessService::action);
    }

    private static void action(ICommand command) {
        if(!isLegal(command)) return;

        switch (command.getType()) {
            case PLACE:
                place((PlaceCommand)command);
                break;
            case RIGHT:
            case LEFT:
                if (robot.isPlaced()) rotate(command);
                break;
            case MOVE:
                if (robot.isPlaced()) move();
                break;
            case REPORT:
                if (robot.isPlaced()) System.out.print(robot);
                break;
        }
    }
}
