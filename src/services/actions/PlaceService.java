package services.actions;


import model.PlaceCommand;
import model.Robot;

import static services.actions.ProcessService.robot;

public class PlaceService {

    public static void place(PlaceCommand command) {
        robot.setPosition(command.getPosition());
        robot.setDirection(command.getDirection());
        Robot.placed = true;
    }
}
