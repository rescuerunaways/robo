package io;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.file.Files.lines;


public class Reader {
    public static final String inputPath = "././test/test_1.txt";


    public static List<String> readLines() throws IOException {
        return lines(Paths.get(inputPath)).collect(Collectors.toList());
    }
}
