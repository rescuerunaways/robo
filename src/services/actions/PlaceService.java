package services.actions;


import model.PlaceCommand;

import static services.actions.ProcessService.robot;

public class PlaceService {

    public static void place(PlaceCommand command) {
        robot.setPosition(command.getPosition());
        robot.setDirection(command.getDirection());
        robot.setPlaced(true);
    }
}
