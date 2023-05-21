package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    
    public Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    public void setX(int x) {
    	this.x = x;
    }
    public int getX() {
    	return this.x;
    }

    public void setY(int y) {
    	this.y = y;
    }
    public int getY() {
    	return this.y;
    }
    
    public void setWidth(int width) {
    	this.width = width;
    }
    public int getWidth() {
    	return this.width;
    }
    
    public void setHeight(int height) {
    	this.height = height;
    }
    public int getHeight() {
    	return this.height;
    }
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
class PolyMoving extends Polymorph {

	public PolyMoving(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++) {
		setX(getX() + 5);
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
}

