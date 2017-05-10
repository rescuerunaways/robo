package services;

import java.io.IOException;

import static io.Reader.readLines;
import static services.ParseService.parse;
import static services.ProcessService.process;

public class Launcher {

    public static void main(String[] args)  {
        try {
            process(parse(readLines()));
        } catch (IOException e) {

        }
    }
}

