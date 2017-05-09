package services;

import java.io.IOException;

import static io.Reader.getCommands;
import static services.Processor.process;

public  class Launcher {

    public static void main(String[] args) throws IOException {
        process(getCommands());
    }
}

