package services.actions;


import model.ICommand;
import model.PlaceCommand;

import static services.actions.ProcessService.robot;
import static store.KeyValue.matrix;


public class Validator {

    public static boolean isLegal(ICommand command) {
        switch (command.getType()) {
            case PLACE:
                int[] position = ((PlaceCommand) command).getPosition();
                if (position[0] > matrix[0] || position[1] > matrix[1])
                    return false;
                break;
            case MOVE:
                if (robot.getPosition()[0] + robot.getDirection()[0] > matrix[0]
                    || robot.getPosition()[1] + robot.getDirection()[1] > matrix[1])
                    return false;
                break;
        }
        return true;
    }
}
