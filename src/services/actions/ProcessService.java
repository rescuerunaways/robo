package services.actions;

import model.Command;
import model.ICommand;
import model.PlaceCommand;
import model.Robot;

import java.util.List;

import static model.Robot.placed;
import static services.actions.MoveService.move;
import static services.actions.PlaceService.place;
import static services.actions.RotateService.rotate;
import static services.actions.Validator.isLegal;

public class ProcessService {

    public static Robot robot = new Robot();

    public static void process(List<Command> commands) {
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
                if (placed) rotate(command);
                break;
            case MOVE:
                if (placed) move();
                break;
            case REPORT:
                if (placed) System.out.print(robot);
                break;
        }
    }
}
