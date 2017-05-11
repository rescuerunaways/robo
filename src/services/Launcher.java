package services;

import java.io.IOException;

import static io.Reader.readLines;
import static services.ParseService.parse;
import static services.actions.ProcessService.process;

public class Launcher {

    public static void main(String[] args) throws IOException {

            process(parse(readLines()));

    }
}

