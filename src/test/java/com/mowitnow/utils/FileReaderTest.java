package com.mowitnow.utils;



import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.mowitnow.utils.FileReader;


public class FileReaderTest {
    private static final String FILE_NAME = "src/main/resources/file.txt";


    @Test
    public void readFile() {
        try {
            List<String> lines = FileReader.parseFile(FILE_NAME);
            assertEquals("5 5", lines.get(0));
            assertEquals("1 2 N", lines.get(1));
            assertEquals("GAGAGAGAA", lines.get(2));
            assertEquals("3 3 E", lines.get(3));
            assertEquals("AADAADADDA", lines.get(4));
            assertEquals(5, lines.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
