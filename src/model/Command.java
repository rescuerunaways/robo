package model;

public class Command {
    private CommandType name;

    public Command(CommandType name) {
        this.name = name;
    }

    public CommandType getName() {
        return name;
    }
}
