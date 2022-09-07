package com.mowitnow.actions;

public class Mower {
	   private Position position;
	   private Direction direction;

	   public Position getPosition() {
		return position;
	  }
 
	public void setPosition(Position position) {
		this.position = position;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}


	    public Mower(Position position, Direction direction) {
	        this.position = position;
	        this.direction = direction;
	    }

}