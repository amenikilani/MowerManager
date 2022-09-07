package com.mowitnow.actions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AreaTest {
	
    @Test
    public void canMove() {
        Area area = new Area(7, 7);

        Position position = new Position(0, 0);
        assertTrue(area.canMove(position));
        position = new Position(-1, -1);
        assertFalse(area.canMove(position));
    }
}
