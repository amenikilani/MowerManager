package com.mowitnow.actions;

public class Navigate {
	
    /**
     * To Navigate with the mower.
     *
     * @param position    the current position
     * @param direction the direction to choose to move on 
     */

    public static  void navigate(Position position, Direction direction) {
    }

    
    /**
     * To Rotate the mower.
     *
     * @param choosedDirection the choosed direction to rotate the current direction
     * @param direction the current direction
     * @return the new direction
     */
    public static  Direction rotate(char choosedDirection, Direction direction) {
        return direction ; 
    }
}
