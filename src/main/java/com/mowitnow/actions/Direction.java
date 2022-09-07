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
         switch (this) {
            case NORTH : return  EAST;
            case EAST :  return SOUTH;
            case SOUTH :  return WEST;
            case WEST : return  NORTH;
            default : return  null;
        }
    }

    /**
     * To get the previous direction according to the current direction.
     *
     */
    public Direction getPreviousDirection() {
        switch (this) {
            case NORTH : return  WEST;
            case EAST : return  NORTH;
            case SOUTH : return  EAST;
            case WEST : return SOUTH;
            default : return  null;

        }

    }
	public static Direction valueOfDirection(String direction) {
	        for (Direction o : values()) {
	            if (o.direction.equals(direction)) {
	                return o;
	            }
	        }
	        return null;
	}
    public String getValue() {
        return direction;
    }
}
