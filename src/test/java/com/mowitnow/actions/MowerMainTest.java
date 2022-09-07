package com.mowitnow.actions;


import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;


public class MowerMainTest {

    private static final String FILE_NAME = "src/main/resources/file.txt";

    @Test
    public void main() throws IOException {
        MowerMain mowerMain = new MowerMain(FILE_NAME);

        assertEquals("1 3 N", mowerMain.run().get(0));
        assertEquals("5 1 E", mowerMain.run().get(1));
    }
}