package com.mowitnow.actions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DirectionTest {
	   @Test
	    public void getNextDirection() {
	        assertEquals(Direction.NORTH, Direction.WEST.getNextDirection());
	        assertEquals(Direction.EAST, Direction.NORTH.getNextDirection());
	        assertEquals(Direction.WEST, Direction.SOUTH.getNextDirection());
	        assertEquals(Direction.SOUTH, Direction.EAST.getNextDirection());

	    }

	    @Test
	    public void getPreviousDirection() {
	        assertEquals(Direction.NORTH, Direction.EAST.getPreviousDirection());
	        assertEquals(Direction.EAST, Direction.SOUTH.getPreviousDirection());
	        assertEquals(Direction.WEST, Direction.NORTH.getPreviousDirection());
	        assertEquals(Direction.SOUTH, Direction.WEST.getPreviousDirection());
	    }

}
