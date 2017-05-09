package io;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.file.Files.lines;
import static services.Processor.inputPath;


public class Reader {
    public static List<String> getCommands() throws IOException {
        return lines(Paths.get(inputPath)).collect(Collectors.toList());
    }
}
