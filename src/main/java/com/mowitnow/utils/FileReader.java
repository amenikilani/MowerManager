package com.mowitnow.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    /**
     * To read the file.
     *
     * @param name file name
     */
    public static List<String> parseFile(String name) throws IOException {
        return Files.readAllLines(Paths.get(name));
    }

}