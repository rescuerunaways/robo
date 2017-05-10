package model;


public enum CommandType {

    PLACE("PLACE"),
    MOVE("MOVE"),
    RIGHT("RIGHT"),
    LEFT("LEFT"),
    REPORT("REPORT");

    CommandType(String name) {
    }
}
