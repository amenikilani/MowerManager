package com.mowitnow.actions;


public class Navigate {
	
    /**
     * To Navigate with the mower.
     *
     * @param position    the current position
     * @param direction the direction to choose to move on 
     */

    public static  void navigate(Position position, Direction direction) {
        switch (direction) {
        case NORTH : position.setY(position.getY() + 1); return ;
        case EAST : position.setX(position.getX() + 1); return ;
        case SOUTH : position.setY(position.getY() - 1); return ;
        case WEST : position.setX(position.getX() - 1); return ;
    }
    }

    
    /**
     * To Rotate the mower.
     *
     * @param choosedDirection the choosed direction to rotate the current direction
     * @param direction the current direction
     * @return the new direction
     */
    public static  Direction rotate(char choosedDirection, Direction direction) {
           switch (choosedDirection) {
		        case 'D' : return direction.getNextDirection();
		        case 'G' : return direction.getPreviousDirection();
		        default : return null;
            }
    }
}
