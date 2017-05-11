package model;

public class Command implements ICommand{
    private CommandType type;

    public Command(CommandType type) {
        this.type = type;
    }

    public CommandType getType() {
        return type;
    }
}
