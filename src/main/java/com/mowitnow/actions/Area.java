package com.mowitnow.actions;


public class Area {
    private  int width;
    private  int height;
    
    public Area(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public static Area initArea(String[] area) {
	       int width = Integer.parseInt(area[0]);
	       int height = Integer.parseInt(area[1]);
	       return new Area(width, height);
	}

	public boolean canMove(Position position) {
		 return position.getX() >= 0 && position.getX() <= width
	                && position.getY() >= 0  && position.getY() <= height;
	}
	                
	               
}
