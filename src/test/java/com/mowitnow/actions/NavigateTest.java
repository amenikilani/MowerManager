package com.mowitnow.actions;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NavigateTest {
	
    @Test
    public void navigate() {
        Position position = new Position(0, 0);
        Navigate.navigate(position, Direction.NORTH);
        assertEquals(0, position.getX());
        assertEquals(1, position.getY());
    }

    @Test
    public void rotate() {
    	Direction direction = Direction.NORTH;
        assertEquals(Direction.EAST, Navigate.rotate('D', direction));
        assertEquals(Direction.WEST, Navigate.rotate('G', direction));
    }
}

