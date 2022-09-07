package com.mowitnow.actions;


public class Position {
	
    public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	private int x ;
    private int y ;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

    @Override
    public String toString() {
        return "" + x + " " + y ;
    }
}
