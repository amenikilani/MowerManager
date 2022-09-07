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

	public static Area initArea(String[] split) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean canMove(Position position) {
		// TODO Auto-generated method stub
		return false;
	}
}
