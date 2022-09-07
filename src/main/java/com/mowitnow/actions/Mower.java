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
	
	@Override
	public String toString() {
	    return position.toString() + " " + direction.getValue();
	   }


    public Mower(Position position, Direction direction, Area area) {
	        this.position = position;
	        this.direction = direction;

	    }

    public static Mower initMower(Area area, String coordinates) {
	        String[] formattedCoordinates = coordinates.split(" ");

	        Position position = new Position(Integer.parseInt(formattedCoordinates[0]), Integer.parseInt(formattedCoordinates[1]));
	        Direction direction = Direction.valueOfDirection(formattedCoordinates[2]);

	        return new Mower(position, direction, area);	
		}

	public void move(char step) {
		      switch (step) {
	            case 'A' : Navigate.navigate(position, direction); return;
	            case 'G' : direction = direction.getPreviousDirection(); return;
	            case 'D' : direction = direction.getNextDirection();return;
	        }			
		}
		

}
