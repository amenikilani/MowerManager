package com.mowitnow.actions;



public enum Direction {
	NORTH("N"), 
	EAST("E"), 
	WEST("W"),
	SOUTH("S");
	
	public String direction;
	
	Direction(String direction) {
        this.direction = direction;
    }

    /**
     * To get the next direction according to the current direction.
     *
     */

    public Direction getNextDirection() {
    	Direction direct = null ; 
		return direct;
    }

    /**
     * To get the previous direction according to the current direction.
     *
     */
    public Direction getPreviousDirection() {
    	Direction direct = null ;
		return direct;

    }
}
